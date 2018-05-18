package com.founder.eds.service.privilegeManage.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.founder.eds.core.Constants;
import com.founder.eds.dao.PrivilegeManageDao;
import com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto;
import com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto;
import com.founder.eds.dto.privilegeManage.SystemAccessIpDto;
import com.founder.eds.dto.privilegeManage.SystemAccountDto;
import com.founder.eds.dto.privilegeManage.SystemPrivilegeDto;
import com.founder.eds.entity.SystemAccessIp;
import com.founder.eds.entity.SystemPrivilege;
import com.founder.eds.service.privilegeManage.PrivilegeManageService;
import com.founder.eds.util.StringUtils;

@Service
public class PrivilegeManageServiceImpl implements PrivilegeManageService
{
    @Autowired
    private PrivilegeManageDao privilegeManageDao;

    @Override
    public List<SystemAccountDto> selectSystemAccount()
    {
        List<SystemAccountDto> systemAccountList = privilegeManageDao.selectSystemAccount();

        return systemAccountList;
    }

    @Override
    public List<SystemAccessIpDto> selectSystemAccessIp()
    {
        List<SystemAccessIpDto> systemAccessIpList = privilegeManageDao.selectSystemAccessIp();

        return systemAccessIpList;
    }

    @Override
    public int saveSystemAccessIp(String[] accessIps, String[] memos)
    {
        if (accessIps != null && accessIps.length != 0)
        {
            for (int i = 0; i < accessIps.length; i++)
            {
                SystemAccessIp systemAccessIp = new SystemAccessIp();

                systemAccessIp.setAccessIp(accessIps[i]);
                
                systemAccessIp.setMemo(memos[i]);

                privilegeManageDao.saveSystemAccessIp(systemAccessIp);
            }
        }

        return 1;
    }

    @Override
    public int updateSystemAccessIp(String[] systemAccessIpSns,
            String[] systemAccessIps, String[] existsMemo, String[] existsUpdateCount)
    {
        if (systemAccessIpSns != null && systemAccessIpSns.length != 0)
        {
            for (int i = 0; i < systemAccessIpSns.length; i++)
            {
                SystemAccessIp systemAccessIp = new SystemAccessIp();

                systemAccessIp.setAccessIpSn(Integer.parseInt(systemAccessIpSns[i]));
                systemAccessIp.setAccessIp(systemAccessIps[i]);
                systemAccessIp.setMemo(existsMemo[i]);
                systemAccessIp.setUpdateCount(StringUtils.strToBigDecimal(
                        existsUpdateCount[i], "更新IP版本号转换类型错误"));

                privilegeManageDao.updateSystemAccessIp(systemAccessIp);
            }
        }

        return 1;
    }

    @Override
    public List<ServiceDefinitionPriDto> selectServiceDefinition()
    {
        List<ServiceDefinitionPriDto> serviceDefinitionPriList = privilegeManageDao.selectServiceDefinition();

        return serviceDefinitionPriList;
    }

    @Override
    public List<DictServiceGroupPriDto> selectDictServiceGroup()
    {
        List<DictServiceGroupPriDto> dictServiceGroupPriList = privilegeManageDao.selectDictServiceGroup();

        return dictServiceGroupPriList;
    }

    @Override
    public List<SystemAccessIpDto> selectSystemAccessIpById(
            List<String> accessIpSns, List<String> accessIps, String accessIp,
            int operFlag)
    {
        return privilegeManageDao.selectSystemAccessIpById(accessIpSns,
                accessIps, accessIp, operFlag);
    }

    @Override
    public int deleteSystemAccessIp(List<String> systemAccessIpSns,
            List<String> existUpdateCount)
    {
        for (int i = 0; i < systemAccessIpSns.size(); i++)
        {
            SystemAccessIp systemAccessIp = new SystemAccessIp();
            systemAccessIp.setAccessIpSn(Integer.parseInt(systemAccessIpSns.get(i)));
            systemAccessIp.setDeleteFlag("1");
            systemAccessIp.setUpdateCount(StringUtils.strToBigDecimal(
                    existUpdateCount.get(i), "删除IP版本号类型转换错误"));
            privilegeManageDao.deleteSystemAccessIp(systemAccessIp);
        }

        return 1;
    }

    @Override
    public List<SystemPrivilegeDto> selectSystemPrivilegeByAccountSn(
            String accountSn)
    {
        List<SystemPrivilegeDto> systemPrivileges = privilegeManageDao.selectSystemPrivilegeByAccountSn(accountSn);

        return systemPrivileges;
    }

    @Override
    public int deleteSystemPrivilege(String accountSn)
    {
        return privilegeManageDao.deleteSystemPrivilege(accountSn);
    }

    @Override
    public int insertSystemPrivilege(String[] groupObjArr, String[] serObjArr,
            String accountSn)
    {
        if (groupObjArr != null && groupObjArr.length != 0)
        {
            for (int i = 0; i < groupObjArr.length; i++)
            {
                SystemPrivilege sg = new SystemPrivilege();

                sg.setAccountSn(Integer.parseInt(accountSn));
                sg.setPrivilegeType(Constants.PRIVILEGE_TYPE_GROUP);
                sg.setPrivilegeDefinition(Integer.parseInt(groupObjArr[i]));

                privilegeManageDao.insertSystemPrivilege(sg);
            }
        }

        if (serObjArr != null && serObjArr.length != 0)
        {
            for (int i = 0; i < serObjArr.length; i++)
            {
                if (!StringUtils.isEmpty(serObjArr[i]))
                {
                    SystemPrivilege s = new SystemPrivilege();

                    s.setAccountSn(Integer.parseInt(accountSn));
                    s.setPrivilegeType(Constants.PRIVILEGE_TYPE_SINGLE);
                    s.setPrivilegeDefinition(Integer.parseInt(serObjArr[i]));

                    privilegeManageDao.insertSystemPrivilege(s);
                }
            }
        }

        return 1;
    }

    @Override
    public List<String> selectAccessIpById(List<String> accessIps)
    {
        return privilegeManageDao.selectAccessIpById(accessIps);
    }

}
