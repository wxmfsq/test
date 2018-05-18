package com.founder.eds.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.603+0800")
public final class _DictServiceGroup extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.entity.DictServiceGroup> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _DictServiceGroup __singleton = new _DictServiceGroup();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("SEQ_DICT_SERVICE_GROUP");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the createTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.util.Date, java.lang.Object> $createTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.util.Date, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "createTime", "CREATE_TIME", true, true);

    /** the createby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object> $createby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "createby", "CREATEBY", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the deleteTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.util.Date, java.lang.Object> $deleteTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.util.Date, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "deleteTime", "DELETE_TIME", true, true);

    /** the deleteby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object> $deleteby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteby", "DELETEBY", true, true);

    /** the groupSn */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.math.BigDecimal, java.lang.Object> $groupSn = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "groupSn", "GROUP_SN", __idGenerator);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object> $memo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "memo", "MEMO", true, true);

    /** the serviceGroupName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object> $serviceGroupName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroupName", "SERVICE_GROUP_NAME", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.math.BigDecimal, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "updateCount", "UPDATE_COUNT");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.util.Date, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.util.Date, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    /** the updateby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object> $updateby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, java.lang.String, java.lang.Object>(com.founder.eds.entity.DictServiceGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updateby", "UPDATEBY", true, true);

    private final com.founder.eds.entity.DictServiceGroupListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> __entityPropertyTypeMap;

    private _DictServiceGroup() {
        __listener = new com.founder.eds.entity.DictServiceGroupListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "DictServiceGroup";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DICT_SERVICE_GROUP";
        __qualifiedTableName = "DICT_SERVICE_GROUP";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>>(11);
        __list.add($createTime);
        __map.put("createTime", $createTime);
        __list.add($createby);
        __map.put("createby", $createby);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
        __list.add($deleteTime);
        __map.put("deleteTime", $deleteTime);
        __list.add($deleteby);
        __map.put("deleteby", $deleteby);
        __idList.add($groupSn);
        __list.add($groupSn);
        __map.put("groupSn", $groupSn);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($serviceGroupName);
        __map.put("serviceGroupName", $serviceGroupName);
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
    public void preInsert(com.founder.eds.entity.DictServiceGroup entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.entity.DictServiceGroup entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.entity.DictServiceGroup entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.entity.DictServiceGroup entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.entity.DictServiceGroup entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.entity.DictServiceGroup entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.DictServiceGroup, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, ?, ?> getGeneratedIdPropertyType() {
        return $groupSn;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.DictServiceGroup, ?, ?> getVersionPropertyType() {
        return $updateCount;
    }

    @Override
    public com.founder.eds.entity.DictServiceGroup newEntity() {
        return new com.founder.eds.entity.DictServiceGroup();
    }

    @Override
    public Class<com.founder.eds.entity.DictServiceGroup> getEntityClass() {
        return com.founder.eds.entity.DictServiceGroup.class;
    }

    @Override
    public com.founder.eds.entity.DictServiceGroup getOriginalStates(com.founder.eds.entity.DictServiceGroup __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.entity.DictServiceGroup __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DictServiceGroup getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DictServiceGroup newInstance() {
        return new _DictServiceGroup();
    }

}
