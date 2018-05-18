package com.founder.eds.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

@Entity(listener = SystemPrivilegeListener.class)
@Table(name = "SYSTEM_PRIVILEGE")
public class SystemPrivilege
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequence = "SEQ_SYSTEM_PRIVILEGE")
    @Column(name = "PRIVILEGE_SN")
    private Integer privilegeSn;

    @Column(name = "ACCOUNT_SN")
    private Integer accountSn;

    @Column(name = "PRIVILEGE_TYPE")
    private String privilegeType;

    @Column(name = "PRIVILEGE_DEFINITION")
    private Integer privilegeDefinition;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "DELETE_FLAG")
    private String deleteFlag;

    @Column(name = "UPDATE_COUNT")
    @Version
    private BigDecimal updateCount;

    @Column(name = "DELETE_TIME")
    private Date deleteTime;

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

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getDeleteFlag()
    {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag)
    {
        this.deleteFlag = deleteFlag;
    }

    public BigDecimal getUpdateCount()
    {
        return updateCount;
    }

    public void setUpdateCount(BigDecimal updateCount)
    {
        this.updateCount = updateCount;
    }

    public Date getDeleteTime()
    {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime)
    {
        this.deleteTime = deleteTime;
    }

}
