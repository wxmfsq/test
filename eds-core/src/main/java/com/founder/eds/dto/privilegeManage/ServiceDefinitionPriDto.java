package com.founder.eds.dto.privilegeManage;

import org.seasar.doma.Entity;

@Entity
public class ServiceDefinitionPriDto
{
    private int serviceDefinitionSn;

    private int dataSourceSn;

    private String serviceName;

    private String serviceType;

    private String serviceUrl;

    private String serviceGroup;

    private String serviceGroupName;

    private String description;

    private String opMode;

    private String dataEncode;

    private String resultComposit;

    public int getServiceDefinitionSn()
    {
        return serviceDefinitionSn;
    }

    public void setServiceDefinitionSn(int serviceDefinitionSn)
    {
        this.serviceDefinitionSn = serviceDefinitionSn;
    }

    public int getDataSourceSn()
    {
        return dataSourceSn;
    }

    public void setDataSourceSn(int dataSourceSn)
    {
        this.dataSourceSn = dataSourceSn;
    }

    public String getServiceName()
    {
        return serviceName;
    }

    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public String getServiceUrl()
    {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl)
    {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceGroup()
    {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup)
    {
        this.serviceGroup = serviceGroup;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getOpMode()
    {
        return opMode;
    }

    public void setOpMode(String opMode)
    {
        this.opMode = opMode;
    }

    public String getDataEncode()
    {
        return dataEncode;
    }

    public void setDataEncode(String dataEncode)
    {
        this.dataEncode = dataEncode;
    }

    public String getResultComposit()
    {
        return resultComposit;
    }

    public void setResultComposit(String resultComposit)
    {
        this.resultComposit = resultComposit;
    }

    public String getServiceGroupName()
    {
        return serviceGroupName;
    }

    public void setServiceGroupName(String serviceGroupName)
    {
        this.serviceGroupName = serviceGroupName;
    }

}
