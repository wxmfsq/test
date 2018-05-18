package com.founder.eds.dto.privilegeManage;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.609+0800")
public final class _SystemPrivilegeDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _SystemPrivilegeDto __singleton = new _SystemPrivilegeDto();

    /** the accountSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.Integer, java.lang.Object> $accountSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "accountSn", "accountSn", true, true);

    /** the privilegeDefinition */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.Integer, java.lang.Object> $privilegeDefinition = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "privilegeDefinition", "privilegeDefinition", true, true);

    /** the privilegeSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.Integer, java.lang.Object> $privilegeSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "privilegeSn", "privilegeSn", true, true);

    /** the privilegeType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.String, java.lang.Object> $privilegeType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "privilegeType", "privilegeType", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> __entityPropertyTypeMap;

    private _SystemPrivilegeDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "SystemPrivilegeDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SystemPrivilegeDto";
        __qualifiedTableName = "SystemPrivilegeDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>>(4);
        __list.add($accountSn);
        __map.put("accountSn", $accountSn);
        __list.add($privilegeDefinition);
        __map.put("privilegeDefinition", $privilegeDefinition);
        __list.add($privilegeSn);
        __map.put("privilegeSn", $privilegeSn);
        __list.add($privilegeType);
        __map.put("privilegeType", $privilegeType);
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
    public void preInsert(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemPrivilegeDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.SystemPrivilegeDto newEntity() {
        return new com.founder.eds.dto.privilegeManage.SystemPrivilegeDto();
    }

    @Override
    public Class<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto> getEntityClass() {
        return com.founder.eds.dto.privilegeManage.SystemPrivilegeDto.class;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.SystemPrivilegeDto getOriginalStates(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.privilegeManage.SystemPrivilegeDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SystemPrivilegeDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SystemPrivilegeDto newInstance() {
        return new _SystemPrivilegeDto();
    }

}
