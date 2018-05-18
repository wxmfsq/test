package com.founder.eds.dto.privilegeManage;

import org.seasar.doma.Entity;

@Entity
public class SystemAccessIpDto
{
    private Integer accessIpSn;

    private String accessIp;
    
    private String memo;

    private Integer updateCount;

    public Integer getAccessIpSn()
    {
        return accessIpSn;
    }

    public void setAccessIpSn(Integer accessIpSn)
    {
        this.accessIpSn = accessIpSn;
    }

    public String getAccessIp()
    {
        return accessIp;
    }

    public void setAccessIp(String accessIp)
    {
        this.accessIp = accessIp;
    }

    public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getUpdateCount()
    {
        return updateCount;
    }

    public void setUpdateCount(Integer updateCount)
    {
        this.updateCount = updateCount;
    }

}
