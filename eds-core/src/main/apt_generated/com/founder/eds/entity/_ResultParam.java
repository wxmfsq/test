package com.founder.eds.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.492+0800")
public final class _ResultParam extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.entity.ResultParam> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _ResultParam __singleton = new _ResultParam();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("SEQ_RESULT_PARAM");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the createTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.util.Date, java.lang.Object> $createTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.util.Date, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "createTime", "CREATE_TIME", true, true);

    /** the createby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $createby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "createby", "CREATEBY", true, true);

    /** the dataGroupNameCn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $dataGroupNameCn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataGroupNameCn", "DATA_GROUP_NAME_CN", true, true);

    /** the dataGroupNameEn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $dataGroupNameEn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataGroupNameEn", "DATA_GROUP_NAME_EN", true, true);

    /** the dataGroupNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object> $dataGroupNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "dataGroupNo", "DATA_GROUP_NO", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the deleteTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.util.Date, java.lang.Object> $deleteTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.util.Date, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "deleteTime", "DELETE_TIME", true, true);

    /** the deleteby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $deleteby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteby", "DELETEBY", true, true);

    /** the maxTimes */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $maxTimes = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maxTimes", "MAX_TIMES", true, true);

    /** the minTimes */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object> $minTimes = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "minTimes", "MIN_TIMES", true, true);

    /** the paraentSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object> $paraentSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "paraentSn", "PARENT_SN", true, true);

    /** the resultSn */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object> $resultSn = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "resultSn", "RESULT_SN", __idGenerator);

    /** the serviceDefinitionSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object> $serviceDefinitionSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "serviceDefinitionSn", "SERVICE_DEFINITION_SN", true, true);

    /** the sqlText */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $sqlText = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sqlText", "SQL_TEXT", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "updateCount", "UPDATE_COUNT");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.util.Date, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.util.Date, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    /** the updateby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object> $updateby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.ResultParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updateby", "UPDATEBY", true, true);

    private final com.founder.eds.entity.ResultParamListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> __entityPropertyTypeMap;

    private _ResultParam() {
        __listener = new com.founder.eds.entity.ResultParamListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ResultParam";
        __catalogName = "";
        __schemaName = "";
        __tableName = "RESULT_PARAM";
        __qualifiedTableName = "RESULT_PARAM";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>>(17);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>>(17);
        __list.add($createTime);
        __map.put("createTime", $createTime);
        __list.add($createby);
        __map.put("createby", $createby);
        __list.add($dataGroupNameCn);
        __map.put("dataGroupNameCn", $dataGroupNameCn);
        __list.add($dataGroupNameEn);
        __map.put("dataGroupNameEn", $dataGroupNameEn);
        __list.add($dataGroupNo);
        __map.put("dataGroupNo", $dataGroupNo);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
        __list.add($deleteTime);
        __map.put("deleteTime", $deleteTime);
        __list.add($deleteby);
        __map.put("deleteby", $deleteby);
        __list.add($maxTimes);
        __map.put("maxTimes", $maxTimes);
        __list.add($minTimes);
        __map.put("minTimes", $minTimes);
        __list.add($paraentSn);
        __map.put("paraentSn", $paraentSn);
        __idList.add($resultSn);
        __list.add($resultSn);
        __map.put("resultSn", $resultSn);
        __list.add($serviceDefinitionSn);
        __map.put("serviceDefinitionSn", $serviceDefinitionSn);
        __list.add($sqlText);
        __map.put("sqlText", $sqlText);
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
    public void preInsert(com.founder.eds.entity.ResultParam entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.entity.ResultParam entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.entity.ResultParam entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.entity.ResultParam entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.entity.ResultParam entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.entity.ResultParam entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.ResultParam, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, ?, ?> getGeneratedIdPropertyType() {
        return $resultSn;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.ResultParam, ?, ?> getVersionPropertyType() {
        return $updateCount;
    }

    @Override
    public com.founder.eds.entity.ResultParam newEntity() {
        return new com.founder.eds.entity.ResultParam();
    }

    @Override
    public Class<com.founder.eds.entity.ResultParam> getEntityClass() {
        return com.founder.eds.entity.ResultParam.class;
    }

    @Override
    public com.founder.eds.entity.ResultParam getOriginalStates(com.founder.eds.entity.ResultParam __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.entity.ResultParam __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ResultParam getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ResultParam newInstance() {
        return new _ResultParam();
    }

}
