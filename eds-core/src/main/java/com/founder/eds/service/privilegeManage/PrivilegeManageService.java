package com.founder.eds.service.privilegeManage;

import java.util.List;

import com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto;
import com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto;
import com.founder.eds.dto.privilegeManage.SystemAccessIpDto;
import com.founder.eds.dto.privilegeManage.SystemAccountDto;
import com.founder.eds.dto.privilegeManage.SystemPrivilegeDto;

public interface PrivilegeManageService
{
    public List<SystemAccountDto> selectSystemAccount();

    public List<SystemAccessIpDto> selectSystemAccessIp();

    public int saveSystemAccessIp(String[] accessIps, String[] memos);

    public int updateSystemAccessIp(String[] systemAccessIpSns,
            String[] systemAccessIps, String[] existsMemo, String[] existsUpdateCount);

    public List<ServiceDefinitionPriDto> selectServiceDefinition();

    public List<DictServiceGroupPriDto> selectDictServiceGroup();

    public List<SystemAccessIpDto> selectSystemAccessIpById(
            List<String> accessIpSns, List<String> accessIps, String accessIp,
            int operFlag);
    
    public List<String> selectAccessIpById(List<String> accessIps);

    public int deleteSystemAccessIp(List<String> systemAccessIpSns, List<String> existUpdateCount);

    public List<SystemPrivilegeDto> selectSystemPrivilegeByAccountSn(
            String accountSn);

    public int deleteSystemPrivilege(String accountSn);

    public int insertSystemPrivilege(String[] groupObjArr, String[] serObjArr,
            String accountSn);
}
