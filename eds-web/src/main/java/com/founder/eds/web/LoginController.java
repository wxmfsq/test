package com.founder.eds.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.founder.eds.dto.LoginDto;

@Controller
@RequestMapping("/login")
public class LoginController  implements
		ApplicationContextAware {

	public static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login")
	public ModelAndView login(WebRequest request) {
		
		// 验证错误标识
        String status = request.getParameter("status");
        // 错误信息
        String errorMessage = null;
        // 登陆失败日志输出
        String errorMessageTips = null;
        // 用户名
        String userName = null;
        // 错误信息对象
        Object error = null;
        // 用户对象
        Object user = null;

        userName = request.getParameter("userName");

        // 当验证失败时获取错误信息及相应用户名
        if (LoginDto.ERROR_LOGIN.equals(status))
        {
            // 获取存储的用户信息对象
            RequestAttributes attrs = RequestContextHolder.getRequestAttributes();

            // 获取用户对象
            user = attrs.getAttribute(
                    UsernamePasswordAuthenticationFilter.SPRING_SECURITY_LAST_USERNAME_KEY,
                    RequestAttributes.SCOPE_SESSION);

            // 获取错误信息对象
            error = attrs.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION,
                    RequestAttributes.SCOPE_SESSION);

            // 获取用户名
            userName = String.valueOf(attrs.getAttribute(
                    UsernamePasswordAuthenticationFilter.SPRING_SECURITY_LAST_USERNAME_KEY,
                    RequestAttributes.SCOPE_SESSION));

            // 获取错误信息
            errorMessage = String.valueOf(attrs.getAttribute(
                    WebAttributes.AUTHENTICATION_EXCEPTION,
                    RequestAttributes.SCOPE_SESSION));

            // 根据错误信息获取相应错误提示
            if (LoginDto.NO_EXISTS_EXCEPTION.equals(errorMessage))
            {
                // 用户名不存在
                errorMessage = LoginDto.NO_EXISTS_USER;

                errorMessageTips = "user_not_Found";
            }
            else if (LoginDto.NO_CORRECT_EXCEPTION.equals(errorMessage))
            {
                // 密码输入错误
                errorMessage = LoginDto.NO_CORRECT_PASSWORD;

                errorMessageTips = "password_is_incorrect";
            }
            else if(LoginDto.JOB_CATEGORY_EXCEPTION.equals(errorMessage))
            {
                // 密码输入错误
                errorMessage = LoginDto.JOB_CATEGORY;

                errorMessageTips = "User_is_not_manager";
            }
            // 进入错误页面时如果用户没有登录过则为空
            if (user == null && error == null)
            {
                userName = "";
                errorMessage = "";
            }
        }

        ModelAndView mav = new ModelAndView();
        mav.addObject("userName", userName);
        mav.addObject("errorMessage", errorMessage);
        mav.addObject("errorMessageTips", errorMessageTips);
        mav.addObject("status", status);

        // 登陆失败加入log日志
        if ("error".equals(status))
        {
            if (userName != null && userName.indexOf("&#64;") >= 0)
            {
                userName = userName.substring(0, userName.indexOf("&#64;"));

                logger.debug("login_tips: 用户{}登陆系统失败，原因：{}", userName,
                        errorMessage);
            }
        }
        mav.setViewName("login/login");

        return mav;
		
	}
	
	@RequestMapping(value = "/loginin")
	public ModelAndView loginin(WebRequest request) {
		return new ModelAndView("login/test");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
	}

}
