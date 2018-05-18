package com.founder.eds.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.628+0800")
public final class _InputParam extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.entity.InputParam> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _InputParam __singleton = new _InputParam();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("SEQ_INPUT_PARAM");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the createTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.util.Date, java.lang.Object> $createTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.util.Date, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "createTime", "CREATE_TIME", true, true);

    /** the createby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $createby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "createby", "CREATEBY", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the deleteTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.util.Date, java.lang.Object> $deleteTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.util.Date, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "deleteTime", "DELETE_TIME", true, true);

    /** the deleteby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $deleteby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "deleteby", "DELETEBY", true, true);

    /** the inputParamSn */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object> $inputParamSn = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "inputParamSn", "INPUT_PARAM_SN", __idGenerator);

    /** the maxTimes */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $maxTimes = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maxTimes", "MAX_TIMES", true, true);

    /** the minTimes */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object> $minTimes = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "minTimes", "MIN_TIMES", true, true);

    /** the paramName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $paramName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "paramName", "PARAM_NAME", true, true);

    /** the paramNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object> $paramNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "paramNo", "PARAM_NO", true, true);

    /** the paramText */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $paramText = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "paramText", "PARAM_TEXT", true, true);

    /** the paramType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $paramType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "paramType", "PARAM_TYPE", true, true);

    /** the serviceDefinitionSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object> $serviceDefinitionSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "serviceDefinitionSn", "SERVICE_DEFINITION_SN", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.math.BigDecimal, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "updateCount", "UPDATE_COUNT");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.util.Date, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.util.Date, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    /** the updateby */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object> $updateby = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, java.lang.String, java.lang.Object>(com.founder.eds.entity.InputParam.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updateby", "UPDATEBY", true, true);

    private final com.founder.eds.entity.InputParamListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> __entityPropertyTypeMap;

    private _InputParam() {
        __listener = new com.founder.eds.entity.InputParamListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "InputParam";
        __catalogName = "";
        __schemaName = "";
        __tableName = "INPUT_PARAM";
        __qualifiedTableName = "INPUT_PARAM";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>>(16);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>>(16);
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
        __idList.add($inputParamSn);
        __list.add($inputParamSn);
        __map.put("inputParamSn", $inputParamSn);
        __list.add($maxTimes);
        __map.put("maxTimes", $maxTimes);
        __list.add($minTimes);
        __map.put("minTimes", $minTimes);
        __list.add($paramName);
        __map.put("paramName", $paramName);
        __list.add($paramNo);
        __map.put("paramNo", $paramNo);
        __list.add($paramText);
        __map.put("paramText", $paramText);
        __list.add($paramType);
        __map.put("paramType", $paramType);
        __list.add($serviceDefinitionSn);
        __map.put("serviceDefinitionSn", $serviceDefinitionSn);
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
    public void preInsert(com.founder.eds.entity.InputParam entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.entity.InputParam entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.entity.InputParam entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.entity.InputParam entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.entity.InputParam entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.entity.InputParam entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.entity.InputParam, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, ?, ?> getGeneratedIdPropertyType() {
        return $inputParamSn;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.entity.InputParam, ?, ?> getVersionPropertyType() {
        return $updateCount;
    }

    @Override
    public com.founder.eds.entity.InputParam newEntity() {
        return new com.founder.eds.entity.InputParam();
    }

    @Override
    public Class<com.founder.eds.entity.InputParam> getEntityClass() {
        return com.founder.eds.entity.InputParam.class;
    }

    @Override
    public com.founder.eds.entity.InputParam getOriginalStates(com.founder.eds.entity.InputParam __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.entity.InputParam __entity) {
    }

    /**
     * @return the singleton
     */
    public static _InputParam getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _InputParam newInstance() {
        return new _InputParam();
    }

}
