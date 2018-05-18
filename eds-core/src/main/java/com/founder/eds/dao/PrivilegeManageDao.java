package com.founder.eds.dao;

import java.util.List;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;

import com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto;
import com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto;
import com.founder.eds.dto.privilegeManage.SystemAccessIpDto;
import com.founder.eds.dto.privilegeManage.SystemAccountDto;
import com.founder.eds.dto.privilegeManage.SystemPrivilegeDto;
import com.founder.eds.entity.SystemAccessIp;
import com.founder.eds.entity.SystemPrivilege;

@Dao
@AnnotateWith(annotations = {
        @Annotation(target = AnnotationTarget.CLASS, type = Component.class),
        @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class) })
public interface PrivilegeManageDao
{
    @Select
    public List<SystemAccountDto> selectSystemAccount();

    @Select
    public List<SystemAccessIpDto> selectSystemAccessIp();

    @Select
    public List<SystemAccessIpDto> selectSystemAccessIpById(
            List<String> accessIpSns, List<String> accessIps, String accessIp,
            int operFlag);

    @Select
    public List<String> selectAccessIpById(List<String> accessIps);

    @Insert
    public int saveSystemAccessIp(SystemAccessIp systemAccessIp);

    @Update(sqlFile = true)
    public int updateSystemAccessIp(SystemAccessIp systemAccessIp);

    @Update(sqlFile = true)
    public int deleteSystemAccessIp(SystemAccessIp systemAccessIp);

    @Select
    public List<ServiceDefinitionPriDto> selectServiceDefinition();

    @Select
    public List<DictServiceGroupPriDto> selectDictServiceGroup();

    @Select
    public List<SystemPrivilegeDto> selectSystemPrivilegeByAccountSn(
            String accountSn);

    @Delete(sqlFile = true)
    public int deleteSystemPrivilege(String accountSn);

    @Insert(sqlFile = true)
    public int insertSystemPrivilege(SystemPrivilege systemPrivilege);
}
