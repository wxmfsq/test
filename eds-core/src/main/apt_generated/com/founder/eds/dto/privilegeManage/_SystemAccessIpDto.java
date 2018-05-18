package com.founder.eds.dto.privilegeManage;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.582+0800")
public final class _SystemAccessIpDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _SystemAccessIpDto __singleton = new _SystemAccessIpDto();

    /** the accessIp */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.String, java.lang.Object> $accessIp = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccessIpDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "accessIp", "accessIp", true, true);

    /** the accessIpSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.Integer, java.lang.Object> $accessIpSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccessIpDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "accessIpSn", "accessIpSn", true, true);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.String, java.lang.Object> $memo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccessIpDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "memo", "memo", true, true);

    /** the updateCount */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.Integer, java.lang.Object> $updateCount = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.SystemAccessIpDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "updateCount", "updateCount", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> __entityPropertyTypeMap;

    private _SystemAccessIpDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "SystemAccessIpDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "SystemAccessIpDto";
        __qualifiedTableName = "SystemAccessIpDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>>(4);
        __list.add($accessIp);
        __map.put("accessIp", $accessIp);
        __list.add($accessIpSn);
        __map.put("accessIpSn", $accessIpSn);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($updateCount);
        __map.put("updateCount", $updateCount);
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
    public void preInsert(com.founder.eds.dto.privilegeManage.SystemAccessIpDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.privilegeManage.SystemAccessIpDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.privilegeManage.SystemAccessIpDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.privilegeManage.SystemAccessIpDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.privilegeManage.SystemAccessIpDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.privilegeManage.SystemAccessIpDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.SystemAccessIpDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.SystemAccessIpDto newEntity() {
        return new com.founder.eds.dto.privilegeManage.SystemAccessIpDto();
    }

    @Override
    public Class<com.founder.eds.dto.privilegeManage.SystemAccessIpDto> getEntityClass() {
        return com.founder.eds.dto.privilegeManage.SystemAccessIpDto.class;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.SystemAccessIpDto getOriginalStates(com.founder.eds.dto.privilegeManage.SystemAccessIpDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.privilegeManage.SystemAccessIpDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SystemAccessIpDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SystemAccessIpDto newInstance() {
        return new _SystemAccessIpDto();
    }

}
