package com.founder.eds.dto;

import org.seasar.doma.Entity;

/**
 * 登陆页面用户信息
 * @version 1.0, 2014/07/18  
 * @author jia_yanqing
 * @since 1.0
 */
@Entity
public class LoginDto
{
    // 登陆失败标识
    public final static String ERROR_LOGIN = "error";

    // 用户名不存在错误信息
    public final static String NO_EXISTS_USER = "用户名不存在";

    // 密码错误错误信息
    public final static String NO_CORRECT_PASSWORD = "密码输入错误";
    
    // 角色错误异常
    public final static String JOB_CATEGORY = "此用户非管理员角色";

    // 用户不存在异常信息
    public final static String NO_EXISTS_EXCEPTION = "org.springframework.security.core.userdetails.UsernameNotFoundException: User not found";

    // 密码错误异常
    public final static String NO_CORRECT_EXCEPTION = "org.springframework.security.authentication.BadCredentialsException: Bad credentials";
    
    // 角色错误异常
    public final static String JOB_CATEGORY_EXCEPTION = "org.springframework.security.core.userdetails.UsernameNotFoundException: User is not manager";
    
    public static final String FIRST_LOGIN_COOKIE_NAME = "firstLoginInfo";
    
    // 用户id
    private String userId;

    // 登陆密码
    private String password;

    // 用户名
    private String userName;
    
    // 角色
    private String jobCategory;
    
    public String getFIRST_LOGIN_COOKIE_NAME()
    {
        return FIRST_LOGIN_COOKIE_NAME;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

    public String getJobCategory()
    {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory)
    {
        this.jobCategory = jobCategory;
    }

}
