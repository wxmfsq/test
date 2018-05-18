package com.founder.eds.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.560+0800")
public final class _DataSourceEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.entity.DataSourceEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _DataSourceEntity __singleton = new _DataSourceEntity();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("SEQ_DATA_SOURCE");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the connectionName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $connectionName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "connectionName", "CONNECTION_NAME", true, true);

    /** the connectionUrl */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $connectionUrl = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "connectionUrl", "CONNECTION_URL", true, true);

    /** the createTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.util.Date, java.lang.Object> $createTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.util.Date, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "createTime", "CREATE_TIME", true, true);

    /** the createby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $createby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "createby", "CREATEBY", true, true);

    /** the dataSourceSn */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.math.BigDecimal, java.lang.Object> $dataSourceSn = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "dataSourceSn", "DATA_SOURCE_SN", __idGenerator);

    /** the databaseType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $databaseType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "databaseType", "DATABASE_TYPE", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the deleteTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.util.Date, java.lang.Object> $deleteTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.util.Date, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "deleteTime", "DELETE_TIME", true, true);

    /** the deleteby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $deleteby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteby", "DELETEBY", true, true);

    /** the passWord */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $passWord = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "passWord", "PASSWORD", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.math.BigDecimal, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "updateCount", "UPDATE_COUNT");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.util.Date, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.util.Date, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    /** the updateby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $updateby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updateby", "UPDATEBY", true, true);

    /** the user */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object> $user = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, java.lang.String, java.lang.Object>(com.founder.eds.entity.DataSourceEntity.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "user", "user", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> __entityPropertyTypeMap;

    private _DataSourceEntity() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "DataSourceEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DATA_SOURCE";
        __qualifiedTableName = "DATA_SOURCE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>>(14);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>>(14);
        __list.add($connectionName);
        __map.put("connectionName", $connectionName);
        __list.add($connectionUrl);
        __map.put("connectionUrl", $connectionUrl);
        __list.add($createTime);
        __map.put("createTime", $createTime);
        __list.add($createby);
        __map.put("createby", $createby);
        __idList.add($dataSourceSn);
        __list.add($dataSourceSn);
        __map.put("dataSourceSn", $dataSourceSn);
        __list.add($databaseType);
        __map.put("databaseType", $databaseType);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
        __list.add($deleteTime);
        __map.put("deleteTime", $deleteTime);
        __list.add($deleteby);
        __map.put("deleteby", $deleteby);
        __list.add($passWord);
        __map.put("passWord", $passWord);
        __list.add($updateCount);
        __map.put("updateCount", $updateCount);
        __list.add($updateTime);
        __map.put("updateTime", $updateTime);
        __list.add($updateby);
        __map.put("updateby", $updateby);
        __list.add($user);
        __map.put("user", $user);
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
    public void preInsert(com.founder.eds.entity.DataSourceEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.entity.DataSourceEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.entity.DataSourceEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.entity.DataSourceEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.entity.DataSourceEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.entity.DataSourceEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DataSourceEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, ?, ?> getGeneratedIdPropertyType() {
        return $dataSourceSn;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.DataSourceEntity, ?, ?> getVersionPropertyType() {
        return $updateCount;
    }

    @Override
    public com.founder.eds.entity.DataSourceEntity newEntity() {
        return new com.founder.eds.entity.DataSourceEntity();
    }

    @Override
    public Class<com.founder.eds.entity.DataSourceEntity> getEntityClass() {
        return com.founder.eds.entity.DataSourceEntity.class;
    }

    @Override
    public com.founder.eds.entity.DataSourceEntity getOriginalStates(com.founder.eds.entity.DataSourceEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.entity.DataSourceEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DataSourceEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DataSourceEntity newInstance() {
        return new _DataSourceEntity();
    }

}
