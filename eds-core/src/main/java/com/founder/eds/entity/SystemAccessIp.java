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

@Entity(listener = SystemAccessIpListener.class)
@Table(name = "SYSTEM_ACCESS_IP")
public class SystemAccessIp
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequence = "SEQ_SYSTEM_ACCESS_IP")
    @Column(name = "ACCESS_IP_SN")
    private Integer accessIpSn;

    @Column(name = "ACCESS_IP")
    private String accessIp;
    
    @Column(name = "MEMO")
    private String memo;

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
