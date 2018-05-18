package com.founder.eds.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.543+0800")
public final class _LoginDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.LoginDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _LoginDto __singleton = new _LoginDto();

    /** the jobCategory */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object> $jobCategory = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.LoginDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "jobCategory", "jobCategory", true, true);

    /** the password */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object> $password = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.LoginDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "password", "password", true, true);

    /** the userId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object> $userId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.LoginDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "userId", "userId", true, true);

    /** the userName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object> $userName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.LoginDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "userName", "userName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> __entityPropertyTypeMap;

    private _LoginDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "LoginDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "LoginDto";
        __qualifiedTableName = "LoginDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>>(4);
        __list.add($jobCategory);
        __map.put("jobCategory", $jobCategory);
        __list.add($password);
        __map.put("password", $password);
        __list.add($userId);
        __map.put("userId", $userId);
        __list.add($userName);
        __map.put("userName", $userName);
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
    public void preInsert(com.founder.eds.dto.LoginDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.LoginDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.LoginDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.LoginDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.LoginDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.LoginDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.LoginDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.LoginDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.LoginDto newEntity() {
        return new com.founder.eds.dto.LoginDto();
    }

    @Override
    public Class<com.founder.eds.dto.LoginDto> getEntityClass() {
        return com.founder.eds.dto.LoginDto.class;
    }

    @Override
    public com.founder.eds.dto.LoginDto getOriginalStates(com.founder.eds.dto.LoginDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.LoginDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LoginDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LoginDto newInstance() {
        return new _LoginDto();
    }

}
