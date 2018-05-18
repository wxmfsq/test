package com.founder.eds.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.646+0800")
public final class _ResultParamDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.ResultParamDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _ResultParamDto __singleton = new _ResultParamDto();

    /** the dataGroupName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object> $dataGroupName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataGroupName", "dataGroupName", true, true);

    /** the dataGroupNameCn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object> $dataGroupNameCn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataGroupNameCn", "dataGroupNameCn", true, true);

    /** the dataGroupNameEn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object> $dataGroupNameEn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dataGroupNameEn", "dataGroupNameEn", true, true);

    /** the dataGroupNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object> $dataGroupNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "dataGroupNo", "dataGroupNo", true, true);

    /** the maxTimes */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object> $maxTimes = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "maxTimes", "maxTimes", true, true);

    /** the minTimes */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object> $minTimes = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "minTimes", "minTimes", true, true);

    /** the paraentSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object> $paraentSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "paraentSn", "paraentSn", true, true);

    /** the resultSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object> $resultSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "resultSn", "resultSn", true, true);

    /** the serviceDefinitionSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object> $serviceDefinitionSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.math.BigDecimal, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "serviceDefinitionSn", "serviceDefinitionSn", true, true);

    /** the sqlText */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object> $sqlText = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.ResultParamDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sqlText", "sqlText", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> __entityPropertyTypeMap;

    private _ResultParamDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ResultParamDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ResultParamDto";
        __qualifiedTableName = "ResultParamDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>>(10);
        __list.add($dataGroupName);
        __map.put("dataGroupName", $dataGroupName);
        __list.add($dataGroupNameCn);
        __map.put("dataGroupNameCn", $dataGroupNameCn);
        __list.add($dataGroupNameEn);
        __map.put("dataGroupNameEn", $dataGroupNameEn);
        __list.add($dataGroupNo);
        __map.put("dataGroupNo", $dataGroupNo);
        __list.add($maxTimes);
        __map.put("maxTimes", $maxTimes);
        __list.add($minTimes);
        __map.put("minTimes", $minTimes);
        __list.add($paraentSn);
        __map.put("paraentSn", $paraentSn);
        __list.add($resultSn);
        __map.put("resultSn", $resultSn);
        __list.add($serviceDefinitionSn);
        __map.put("serviceDefinitionSn", $serviceDefinitionSn);
        __list.add($sqlText);
        __map.put("sqlText", $sqlText);
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
    public void preInsert(com.founder.eds.dto.ResultParamDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.ResultParamDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.ResultParamDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.ResultParamDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.ResultParamDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.ResultParamDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ResultParamDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.ResultParamDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.ResultParamDto newEntity() {
        return new com.founder.eds.dto.ResultParamDto();
    }

    @Override
    public Class<com.founder.eds.dto.ResultParamDto> getEntityClass() {
        return com.founder.eds.dto.ResultParamDto.class;
    }

    @Override
    public com.founder.eds.dto.ResultParamDto getOriginalStates(com.founder.eds.dto.ResultParamDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.ResultParamDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ResultParamDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ResultParamDto newInstance() {
        return new _ResultParamDto();
    }

}
