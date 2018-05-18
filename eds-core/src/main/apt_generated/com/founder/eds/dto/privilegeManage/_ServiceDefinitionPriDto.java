package com.founder.eds.dto.privilegeManage;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.525+0800")
public final class _ServiceDefinitionPriDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _ServiceDefinitionPriDto __singleton = new _ServiceDefinitionPriDto();

    /** the dataEncode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $dataEncode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataEncode", "dataEncode", true, true);

    /** the dataSourceSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.Integer, java.lang.Object> $dataSourceSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "dataSourceSn", "dataSourceSn", true, true);

    /** the description */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $description = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "description", "description", true, true);

    /** the opMode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $opMode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "opMode", "opMode", true, true);

    /** the resultComposit */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $resultComposit = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "resultComposit", "resultComposit", true, true);

    /** the serviceDefinitionSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.Integer, java.lang.Object> $serviceDefinitionSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "serviceDefinitionSn", "serviceDefinitionSn", true, true);

    /** the serviceGroup */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $serviceGroup = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroup", "serviceGroup", true, true);

    /** the serviceGroupName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $serviceGroupName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroupName", "serviceGroupName", true, true);

    /** the serviceName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $serviceName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceName", "serviceName", true, true);

    /** the serviceType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $serviceType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceType", "serviceType", true, true);

    /** the serviceUrl */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object> $serviceUrl = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceUrl", "serviceUrl", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> __entityPropertyTypeMap;

    private _ServiceDefinitionPriDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ServiceDefinitionPriDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ServiceDefinitionPriDto";
        __qualifiedTableName = "ServiceDefinitionPriDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>>(11);
        __list.add($dataEncode);
        __map.put("dataEncode", $dataEncode);
        __list.add($dataSourceSn);
        __map.put("dataSourceSn", $dataSourceSn);
        __list.add($description);
        __map.put("description", $description);
        __list.add($opMode);
        __map.put("opMode", $opMode);
        __list.add($resultComposit);
        __map.put("resultComposit", $resultComposit);
        __list.add($serviceDefinitionSn);
        __map.put("serviceDefinitionSn", $serviceDefinitionSn);
        __list.add($serviceGroup);
        __map.put("serviceGroup", $serviceGroup);
        __list.add($serviceGroupName);
        __map.put("serviceGroupName", $serviceGroupName);
        __list.add($serviceName);
        __map.put("serviceName", $serviceName);
        __list.add($serviceType);
        __map.put("serviceType", $serviceType);
        __list.add($serviceUrl);
        __map.put("serviceUrl", $serviceUrl);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto newEntity() {
        return new com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto();
    }

    @Override
    public Class<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto> getEntityClass() {
        return com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto.class;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto getOriginalStates(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ServiceDefinitionPriDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ServiceDefinitionPriDto newInstance() {
        return new _ServiceDefinitionPriDto();
    }

}
