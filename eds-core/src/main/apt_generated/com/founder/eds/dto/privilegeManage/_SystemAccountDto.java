package com.founder.eds.dto.privilegeManage;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.511+0800")
public final class _SystemAccountDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.privilegeManage.SystemAccountDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _SystemAccountDto __singleton = new _SystemAccountDto();

    /** the accountSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.Integer, java.lang.Object> $accountSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccountDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "accountSn", "accountSn", true, true);

    /** the jobCategory */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.String, java.lang.Object> $jobCategory = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccountDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "jobCategory", "jobCategory", true, true);

    /** the userId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.String, java.lang.Object> $userId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccountDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "userId", "userId", true, true);

    /** the userName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.String, java.lang.Object> $userName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccountDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "userName", "userName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> __entityPropertyTypeMap;

    private _SystemAccountDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "SystemAccountDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SystemAccountDto";
        __qualifiedTableName = "SystemAccountDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>>(4);
        __list.add($accountSn);
        __map.put("accountSn", $accountSn);
        __list.add($jobCategory);
        __map.put("jobCategory", $jobCategory);
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
    public void preInsert(com.founder.eds.dto.privilegeManage.SystemAccountDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.privilegeManage.SystemAccountDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.privilegeManage.SystemAccountDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.privilegeManage.SystemAccountDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.privilegeManage.SystemAccountDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.privilegeManage.SystemAccountDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccountDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccountDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.SystemAccountDto newEntity() {
        return new com.founder.eds.dto.privilegeManage.SystemAccountDto();
    }

    @Override
    public Class<com.founder.eds.dto.privilegeManage.SystemAccountDto> getEntityClass() {
        return com.founder.eds.dto.privilegeManage.SystemAccountDto.class;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.SystemAccountDto getOriginalStates(com.founder.eds.dto.privilegeManage.SystemAccountDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.privilegeManage.SystemAccountDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SystemAccountDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SystemAccountDto newInstance() {
        return new _SystemAccountDto();
    }

}
