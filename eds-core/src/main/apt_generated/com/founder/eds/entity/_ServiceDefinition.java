package com.founder.eds.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.596+0800")
public final class _ServiceDefinition extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.entity.ServiceDefinition> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _ServiceDefinition __singleton = new _ServiceDefinition();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("SEQ_SERVICE_DEFINITION");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the createTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.util.Date, java.lang.Object> $createTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.util.Date, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "createTime", "CREATE_TIME", true, true);

    /** the createby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $createby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "createby", "CREATEBY", true, true);

    /** the dataEncode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $dataEncode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataEncode", "DATA_ENCODE", true, true);

    /** the dataSourceSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.math.BigDecimal, java.lang.Object> $dataSourceSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "dataSourceSn", "DATA_SOURCE_SN", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the deleteTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.util.Date, java.lang.Object> $deleteTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.util.Date, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "deleteTime", "DELETE_TIME", true, true);

    /** the deleteby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $deleteby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteby", "DELETEBY", true, true);

    /** the description */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $description = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "description", "DESCRIPTION", true, true);

    /** the opMode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $opMode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "opMode", "OP_MODE", true, true);

    /** the resultComposit */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $resultComposit = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "resultComposit", "RESULT_COMPOSIT", true, true);

    /** the serviceDefinitionSn */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.math.BigDecimal, java.lang.Object> $serviceDefinitionSn = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "serviceDefinitionSn", "SERVICE_DEFINITION_SN", __idGenerator);

    /** the serviceGroup */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $serviceGroup = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroup", "SERVICE_GROUP", true, true);

    /** the serviceName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $serviceName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceName", "SERVICE_NAME", true, true);

    /** the serviceType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $serviceType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceType", "SERVICE_TYPE", true, true);

    /** the serviceUrl */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $serviceUrl = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceUrl", "SERVICE_URL", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.math.BigDecimal, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "updateCount", "UPDATE_COUNT");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.util.Date, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.util.Date, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    /** the updateby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object> $updateby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, java.lang.String, java.lang.Object>(com.founder.eds.entity.ServiceDefinition.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updateby", "UPDATEBY", true, true);

    private final com.founder.eds.entity.ServiceDefinitionListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> __entityPropertyTypeMap;

    private _ServiceDefinition() {
        __listener = new com.founder.eds.entity.ServiceDefinitionListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ServiceDefinition";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SERVICE_DEFINITION";
        __qualifiedTableName = "SERVICE_DEFINITION";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>>(18);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>>(18);
        __list.add($createTime);
        __map.put("createTime", $createTime);
        __list.add($createby);
        __map.put("createby", $createby);
        __list.add($dataEncode);
        __map.put("dataEncode", $dataEncode);
        __list.add($dataSourceSn);
        __map.put("dataSourceSn", $dataSourceSn);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
        __list.add($deleteTime);
        __map.put("deleteTime", $deleteTime);
        __list.add($deleteby);
        __map.put("deleteby", $deleteby);
        __list.add($description);
        __map.put("description", $description);
        __list.add($opMode);
        __map.put("opMode", $opMode);
        __list.add($resultComposit);
        __map.put("resultComposit", $resultComposit);
        __idList.add($serviceDefinitionSn);
        __list.add($serviceDefinitionSn);
        __map.put("serviceDefinitionSn", $serviceDefinitionSn);
        __list.add($serviceGroup);
        __map.put("serviceGroup", $serviceGroup);
        __list.add($serviceName);
        __map.put("serviceName", $serviceName);
        __list.add($serviceType);
        __map.put("serviceType", $serviceType);
        __list.add($serviceUrl);
        __map.put("serviceUrl", $serviceUrl);
        __list.add($updateCount);
        __map.put("updateCount", $updateCount);
        __list.add($updateTime);
        __map.put("updateTime", $updateTime);
        __list.add($updateby);
        __map.put("updateby", $updateby);
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
    public void preInsert(com.founder.eds.entity.ServiceDefinition entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.entity.ServiceDefinition entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.entity.ServiceDefinition entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.entity.ServiceDefinition entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.entity.ServiceDefinition entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.entity.ServiceDefinition entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ServiceDefinition, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, ?, ?> getGeneratedIdPropertyType() {
        return $serviceDefinitionSn;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.ServiceDefinition, ?, ?> getVersionPropertyType() {
        return $updateCount;
    }

    @Override
    public com.founder.eds.entity.ServiceDefinition newEntity() {
        return new com.founder.eds.entity.ServiceDefinition();
    }

    @Override
    public Class<com.founder.eds.entity.ServiceDefinition> getEntityClass() {
        return com.founder.eds.entity.ServiceDefinition.class;
    }

    @Override
    public com.founder.eds.entity.ServiceDefinition getOriginalStates(com.founder.eds.entity.ServiceDefinition __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.entity.ServiceDefinition __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ServiceDefinition getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ServiceDefinition newInstance() {
        return new _ServiceDefinition();
    }

}
