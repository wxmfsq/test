package com.founder.eds.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.634+0800")
public final class _ServiceDefinitionDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.ServiceDefinitionDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _ServiceDefinitionDto __singleton = new _ServiceDefinitionDto();

    /** the dataSourceSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ServiceDefinitionDto, java.lang.Integer, java.lang.Object> $dataSourceSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ServiceDefinitionDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.ServiceDefinitionDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "dataSourceSn", "dataSourceSn", true, true);

    /** the serviceGroup */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ServiceDefinitionDto, java.lang.String, java.lang.Object> $serviceGroup = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.ServiceDefinitionDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.ServiceDefinitionDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroup", "serviceGroup", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> __entityPropertyTypeMap;

    private _ServiceDefinitionDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ServiceDefinitionDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ServiceDefinitionDto";
        __qualifiedTableName = "ServiceDefinitionDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>>(2);
        __list.add($dataSourceSn);
        __map.put("dataSourceSn", $dataSourceSn);
        __list.add($serviceGroup);
        __map.put("serviceGroup", $serviceGroup);
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
    public void preInsert(com.founder.eds.dto.ServiceDefinitionDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.ServiceDefinitionDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.ServiceDefinitionDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.ServiceDefinitionDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.ServiceDefinitionDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.ServiceDefinitionDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.ServiceDefinitionDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.ServiceDefinitionDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.ServiceDefinitionDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.ServiceDefinitionDto newEntity() {
        return new com.founder.eds.dto.ServiceDefinitionDto();
    }

    @Override
    public Class<com.founder.eds.dto.ServiceDefinitionDto> getEntityClass() {
        return com.founder.eds.dto.ServiceDefinitionDto.class;
    }

    @Override
    public com.founder.eds.dto.ServiceDefinitionDto getOriginalStates(com.founder.eds.dto.ServiceDefinitionDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.ServiceDefinitionDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ServiceDefinitionDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ServiceDefinitionDto newInstance() {
        return new _ServiceDefinitionDto();
    }

}
