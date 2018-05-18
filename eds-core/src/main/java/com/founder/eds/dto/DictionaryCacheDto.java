package com.founder.eds.dto;

import org.seasar.doma.Entity;

@Entity
public class DictionaryCacheDto
{
    private String csCode;

    private String csName;

    private String cvId;

    private String cvCode;

    private String cvValue;

    private String pyCode;

    private String seqNo;
    
    public String getCsCode()
    {
        return csCode;
    }

    public void setCsCode(String csCode)
    {
        this.csCode = csCode;
    }

    public String getCsName()
    {
        return csName;
    }

    public void setCsName(String csName)
    {
        this.csName = csName;
    }

    public String getCvCode()
    {
        return cvCode;
    }

    public void setCvCode(String cvCode)
    {
        this.cvCode = cvCode;
    }

    public String getCvValue()
    {
        return cvValue;
    }

    public void setCvValue(String cvValue)
    {
        this.cvValue = cvValue;
    }

    public String getPyCode()
    {
        return pyCode;
    }

    public void setPyCode(String pyCode)
    {
        this.pyCode = pyCode;
    }

    public String getCvId()
    {
        return cvId;
    }

    public void setCvId(String cvId)
    {
        this.cvId = cvId;
    }

    public String getSeqNo()
    {
        return seqNo;
    }

    public void setSeqNo(String seqNo)
    {
        this.seqNo = seqNo;
    }
    
}
