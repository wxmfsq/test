package com.founder.eds.dto.privilegeManage;

import org.seasar.doma.Entity;

@Entity
public class SystemAccountDto
{
    private Integer accountSn;

    private String userId;

    private String userName;

    private String jobCategory;

    public Integer getAccountSn()
    {
        return accountSn;
    }

    public void setAccountSn(Integer accountSn)
    {
        this.accountSn = accountSn;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
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
