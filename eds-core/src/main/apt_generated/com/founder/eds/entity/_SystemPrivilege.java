package com.founder.eds.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.533+0800")
public final class _SystemPrivilege extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.entity.SystemPrivilege> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _SystemPrivilege __singleton = new _SystemPrivilege();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("SEQ_SYSTEM_PRIVILEGE");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the accountSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.Integer, java.lang.Object> $accountSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.Integer, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "accountSn", "ACCOUNT_SN", true, true);

    /** the createTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.util.Date, java.lang.Object> $createTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.util.Date, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "createTime", "CREATE_TIME", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.String, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.String, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the deleteTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.util.Date, java.lang.Object> $deleteTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.util.Date, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "deleteTime", "DELETE_TIME", true, true);

    /** the privilegeDefinition */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.Integer, java.lang.Object> $privilegeDefinition = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.Integer, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "privilegeDefinition", "PRIVILEGE_DEFINITION", true, true);

    /** the privilegeSn */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.Integer, java.lang.Object> $privilegeSn = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.Integer, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "privilegeSn", "PRIVILEGE_SN", __idGenerator);

    /** the privilegeType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.String, java.lang.Object> $privilegeType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.lang.String, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "privilegeType", "PRIVILEGE_TYPE", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.math.BigDecimal, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "updateCount", "UPDATE_COUNT");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.util.Date, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, java.util.Date, java.lang.Object>(com.founder.eds.entity.SystemPrivilege.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    private final com.founder.eds.entity.SystemPrivilegeListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> __entityPropertyTypeMap;

    private _SystemPrivilege() {
        __listener = new com.founder.eds.entity.SystemPrivilegeListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "SystemPrivilege";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SYSTEM_PRIVILEGE";
        __qualifiedTableName = "SYSTEM_PRIVILEGE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>>(9);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>>(9);
        __list.add($accountSn);
        __map.put("accountSn", $accountSn);
        __list.add($createTime);
        __map.put("createTime", $createTime);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
        __list.add($deleteTime);
        __map.put("deleteTime", $deleteTime);
        __list.add($privilegeDefinition);
        __map.put("privilegeDefinition", $privilegeDefinition);
        __idList.add($privilegeSn);
        __list.add($privilegeSn);
        __map.put("privilegeSn", $privilegeSn);
        __list.add($privilegeType);
        __map.put("privilegeType", $privilegeType);
        __list.add($updateCount);
        __map.put("updateCount", $updateCount);
        __list.add($updateTime);
        __map.put("updateTime", $updateTime);
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
    public void preInsert(com.founder.eds.entity.SystemPrivilege entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.entity.SystemPrivilege entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.entity.SystemPrivilege entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.entity.SystemPrivilege entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.entity.SystemPrivilege entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.entity.SystemPrivilege entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.SystemPrivilege, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, ?, ?> getGeneratedIdPropertyType() {
        return $privilegeSn;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.SystemPrivilege, ?, ?> getVersionPropertyType() {
        return $updateCount;
    }

    @Override
    public com.founder.eds.entity.SystemPrivilege newEntity() {
        return new com.founder.eds.entity.SystemPrivilege();
    }

    @Override
    public Class<com.founder.eds.entity.SystemPrivilege> getEntityClass() {
        return com.founder.eds.entity.SystemPrivilege.class;
    }

    @Override
    public com.founder.eds.entity.SystemPrivilege getOriginalStates(com.founder.eds.entity.SystemPrivilege __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.entity.SystemPrivilege __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SystemPrivilege getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SystemPrivilege newInstance() {
        return new _SystemPrivilege();
    }

}
