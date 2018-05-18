package com.founder.eds.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.founder.eds.cache.DictionaryCache;
import com.founder.eds.core.Constants;
import com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto;
import com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto;
import com.founder.eds.dto.privilegeManage.SystemAccessIpDto;
import com.founder.eds.dto.privilegeManage.SystemAccountDto;
import com.founder.eds.dto.privilegeManage.SystemPrivilegeDto;
import com.founder.eds.service.privilegeManage.PrivilegeManageService;
import com.founder.eds.util.StringUtils;

/**
 * 权限管理Controller
 * @version 1.0, 2014/11/25 14:32:00
 * @author jin_peng
 */
@Controller
@RequestMapping("/externalDataServe")
public class PrivilegeManageController extends AbstractController implements
        ApplicationContextAware
{
    private static Logger logger = LoggerFactory.getLogger(PrivilegeManageController.class);

    @Autowired
    private PrivilegeManageService privilegeManageService;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException
    {
        // TODO Auto-generated method stub
    }

    /**
     * 权限管理查询
     * @param request 请求上下文
     * @param model 数据对象o
     * @return 查询对象及返回页面
     */
    @RequestMapping("/privilegeManageList")
    public ModelAndView privilegeManageList(WebRequest request, ModelMap model)
    {
        logger.debug("查询权限start......");
        List<SystemAccountDto> systemAccounts = privilegeManageService.selectSystemAccount();
        List<SystemAccessIpDto> systemAccessIps = privilegeManageService.selectSystemAccessIp();

        List<DictServiceGroupPriDto> serviceGroups = privilegeManageService.selectDictServiceGroup();
        List<ServiceDefinitionPriDto> serviceDefinitions = privilegeManageService.selectServiceDefinition();

        model.addAttribute("dictCache", new DictionaryCache());
        model.addAttribute("constants", new Constants());

        model.addAttribute("systemAccounts", systemAccounts);
        model.addAttribute("systemAccessIps", systemAccessIps);
        model.addAttribute("serviceGroups", serviceGroups);
        model.addAttribute("serviceDefinitions", serviceDefinitions);

        return includeTemplate(model, "externalDataServe/privilegeManageList");
    }

    @RequestMapping("/saveSystemAccessIp")
    public @ResponseBody
    Object saveSystemAccessIp(WebRequest request, ModelMap model)
    {
        logger.debug("保存更新IP方法开始......");
        String[] existsSn = request.getParameterValues("existsSn[]");
        String[] existsIp = request.getParameterValues("existsIp[]");
        String[] existsMemo = request.getParameterValues("existsMemo[]");
        String[] existsUpdateCount = request.getParameterValues("existsUpdateCount[]");
        String[] addIps = request.getParameterValues("addIps[]");
        String[] addMemos = request.getParameterValues("addMemos[]");

        logger.debug("保存IP参数获取： existsSn = " + getRequiredParamsStr(existsSn)
            + "; existsIp = " + getRequiredParamsStr(existsIp)
            + "; existsMemo = " + getRequiredParamsStr(existsMemo)
            + "; existsUpdateCount = "
            + getRequiredParamsStr(existsUpdateCount) + "; addIps = "
            + getRequiredParamsStr(addIps)+ "; addMemos = "
                    + getRequiredParamsStr(addMemos));
        // 更新现有iP表数据
        privilegeManageService.updateSystemAccessIp(existsSn, existsIp, existsMemo,
                existsUpdateCount);

        logger.debug("更新IP操作完成.....");

        // 保存新规ip数据
        privilegeManageService.saveSystemAccessIp(addIps, addMemos);
        logger.debug("保存IP操作完成.....");

        // 查询指定访问内容
        List<SystemAccessIpDto> systemAccessIps = privilegeManageService.selectSystemAccessIpById(
                existsSn == null ? Arrays.asList(new String[0])
                        : Arrays.asList(existsSn),
                addIps == null ? Arrays.asList(new String[0])
                        : Arrays.asList(addIps), null,
                Constants.OPER_FLAG_UNDELETE);

        logger.debug("保存后查询操作完成.....");

        Map<String, Object> systemAccessMap = new HashMap<String, Object>();

        systemAccessMap.put("systemAccessIps", systemAccessIps);

        logger.debug("保存更新IP方法处理完成.....");
        return systemAccessMap;
    }

    /**
     * 获取未传递的必需参数
     * @param paramsList 未传递的必需参数集合
     * @return 未传递的必需参数内容
     */
    private String getRequiredParamsStr(String[] paramsList)
    {
        String param = "";
        int count = 0;

        if (paramsList != null && paramsList.length != 0)
        {
            for (String paramRequired : paramsList)
            {
                count++;
                param += paramRequired;

                if (count != paramsList.length)
                {
                    param += ", ";
                }
            }
        }

        return param;
    }

    @RequestMapping("/deleteSystemAccessIp")
    public @ResponseBody
    Object deleteSystemAccessIp(WebRequest request, ModelMap model)
    {
        String[] existsSn = request.getParameterValues("existsSn[]");
        String[] existUpdateCount = request.getParameterValues("existUpdateCount[]");

        // 逻辑删除ip
        privilegeManageService.deleteSystemAccessIp(Arrays.asList(existsSn),
                Arrays.asList(existUpdateCount));

        // 查询指定已逻辑删除内容
        List<SystemAccessIpDto> systemAccessIps = privilegeManageService.selectSystemAccessIpById(
                Arrays.asList(existsSn), new ArrayList<String>(), null,
                Constants.OPER_FLAG_DELETE);

        Map<String, Object> systemAccessMap = new HashMap<String, Object>();

        systemAccessMap.put("systemAccessIps", systemAccessIps);

        return systemAccessMap;
    }

    @RequestMapping("/selectSystemAccessIp")
    public ModelAndView selectSystemAccessIp(WebRequest request, ModelMap model)
    {
        String accessIp = request.getParameter("accessIp");
        List<SystemAccessIpDto> systemAccessIps = null;

        if (StringUtils.isEmpty(accessIp))
        {
            systemAccessIps = privilegeManageService.selectSystemAccessIp();
        }
        else
        {
            systemAccessIps = privilegeManageService.selectSystemAccessIpById(
                    new ArrayList<String>(), new ArrayList<String>(), accessIp,
                    Constants.OPER_FLAG_UNDELETE);
        }

        ModelAndView mav = new ModelAndView();

        mav.addObject("systemAccessIps", systemAccessIps);
        mav.setViewName("externalDataServe/systemAccessIpList");

        return mav;
    }

    @RequestMapping("/selectSystemPrivilege")
    public @ResponseBody
    Object selectSystemPrivilege(WebRequest request, ModelMap model)
    {
        String accountSn = request.getParameter("accountSn");

        List<SystemPrivilegeDto> systemPrivileges = privilegeManageService.selectSystemPrivilegeByAccountSn(accountSn);

        Map<String, Object> systemAccessMap = new HashMap<String, Object>();

        systemAccessMap.put("systemPrivileges", systemPrivileges);

        return systemAccessMap;
    }

    @RequestMapping("/savePrivilege")
    public @ResponseBody
    Object savePrivilege(WebRequest request, ModelMap model)
    {
        String[] groupObjArr = request.getParameterValues("groupObjArr[]");
        String[] serObjArr = request.getParameterValues("serObjArr[]");
        String[] serGroupObjArr = request.getParameterValues("serGroupObjArr[]");
        String userSelSn = request.getParameter("userSelSn");

        List<String> serObjList = new ArrayList<String>();

        if (groupObjArr != null && groupObjArr.length != 0)
        {
            List<String> groups = Arrays.asList(groupObjArr);

            if (serGroupObjArr != null && serGroupObjArr.length != 0)
            {
                for (int i = 0; i < serGroupObjArr.length; i++)
                {
                    if (!groups.contains(serGroupObjArr[i]))
                    {
                        serObjList.add(serObjArr[i]);
                    }
                }

                serObjArr = serObjList.toArray(new String[] {});
            }
        }

        // 删除用户对应所有权限
        privilegeManageService.deleteSystemPrivilege(userSelSn);

        // 插入权限
        privilegeManageService.insertSystemPrivilege(groupObjArr, serObjArr,
                userSelSn);

        // 查询权限
        List<SystemPrivilegeDto> systemPrivileges = privilegeManageService.selectSystemPrivilegeByAccountSn(userSelSn);

        Map<String, Object> systemAccessMap = new HashMap<String, Object>();

        systemAccessMap.put("systemPrivileges", systemPrivileges);

        return systemAccessMap;
    }

    @RequestMapping("/validateIpRepeat")
    public @ResponseBody
    Object validateIpRepeat(WebRequest request, ModelMap model)
    {
        String[] dataExistIp = request.getParameterValues("dataExistIp[]");
        String[] addInpIp = request.getParameterValues("addInpIp[]");

        List<String> ipValidations = new ArrayList<String>();

        if (dataExistIp != null && dataExistIp.length != 0)
        {
            for (String dataIp : dataExistIp)
            {
                ipValidations.add(dataIp);
            }
        }

        if (addInpIp != null && addInpIp.length != 0)
        {
            for (String addIp : addInpIp)
            {
                ipValidations.add(addIp);
            }
        }

        List<String> ipDbValidations = privilegeManageService.selectAccessIpById(ipValidations);

        List<String> ipRepeats = new ArrayList<String>();

        if (ipDbValidations != null && !ipDbValidations.isEmpty())
        {
            for (String ipData : ipValidations)
            {
                if (ipDbValidations.contains(ipData))
                {
                    ipRepeats.add(ipData);
                }
            }
        }

        Map<String, Object> accessRepeatIpMap = new HashMap<String, Object>();

        accessRepeatIpMap.put("accessRepeatIp", ipRepeats);

        return accessRepeatIpMap;
    }
}
