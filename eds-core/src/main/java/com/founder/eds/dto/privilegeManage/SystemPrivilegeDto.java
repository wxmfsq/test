package com.founder.eds.dto.privilegeManage;

import org.seasar.doma.Entity;

@Entity
public class SystemPrivilegeDto
{
    private Integer privilegeSn;

    private Integer accountSn;

    private String privilegeType;

    private Integer privilegeDefinition;

    public Integer getPrivilegeSn()
    {
        return privilegeSn;
    }

    public void setPrivilegeSn(Integer privilegeSn)
    {
        this.privilegeSn = privilegeSn;
    }

    public Integer getAccountSn()
    {
        return accountSn;
    }

    public void setAccountSn(Integer accountSn)
    {
        this.accountSn = accountSn;
    }

    public String getPrivilegeType()
    {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType)
    {
        this.privilegeType = privilegeType;
    }

    public Integer getPrivilegeDefinition()
    {
        return privilegeDefinition;
    }

    public void setPrivilegeDefinition(Integer privilegeDefinition)
    {
        this.privilegeDefinition = privilegeDefinition;
    }

}
