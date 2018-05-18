package com.founder.eds.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.588+0800")
public final class _DataSourceDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.DataSourceDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _DataSourceDto __singleton = new _DataSourceDto();

    /** the connectionName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object> $connectionName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DataSourceDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "connectionName", "connectionName", true, true);

    /** the connectionUrl */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object> $connectionUrl = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DataSourceDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "connectionUrl", "connectionUrl", true, true);

    /** the dataSourceSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.Integer, java.lang.Object> $dataSourceSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.DataSourceDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "dataSourceSn", "dataSourceSn", true, true);

    /** the databaseType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object> $databaseType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DataSourceDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "databaseType", "databaseType", true, true);

    /** the passWord */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object> $passWord = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DataSourceDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "passWord", "passWord", true, true);

    /** the user */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object> $user = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DataSourceDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "user", "user", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> __entityPropertyTypeMap;

    private _DataSourceDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "DataSourceDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DataSourceDto";
        __qualifiedTableName = "DataSourceDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>>(6);
        __list.add($connectionName);
        __map.put("connectionName", $connectionName);
        __list.add($connectionUrl);
        __map.put("connectionUrl", $connectionUrl);
        __list.add($dataSourceSn);
        __map.put("dataSourceSn", $dataSourceSn);
        __list.add($databaseType);
        __map.put("databaseType", $databaseType);
        __list.add($passWord);
        __map.put("passWord", $passWord);
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
    public void preInsert(com.founder.eds.dto.DataSourceDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.DataSourceDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.DataSourceDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.DataSourceDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.DataSourceDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.DataSourceDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DataSourceDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.DataSourceDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.DataSourceDto newEntity() {
        return new com.founder.eds.dto.DataSourceDto();
    }

    @Override
    public Class<com.founder.eds.dto.DataSourceDto> getEntityClass() {
        return com.founder.eds.dto.DataSourceDto.class;
    }

    @Override
    public com.founder.eds.dto.DataSourceDto getOriginalStates(com.founder.eds.dto.DataSourceDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.DataSourceDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DataSourceDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DataSourceDto newInstance() {
        return new _DataSourceDto();
    }

}
