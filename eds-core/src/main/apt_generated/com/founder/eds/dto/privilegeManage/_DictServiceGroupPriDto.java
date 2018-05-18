package com.founder.eds.dto.privilegeManage;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.639+0800")
public final class _DictServiceGroupPriDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _DictServiceGroupPriDto __singleton = new _DictServiceGroupPriDto();

    /** the groupSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, java.lang.Integer, java.lang.Object> $groupSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "groupSn", "groupSn", true, true);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, java.lang.String, java.lang.Object> $memo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "memo", "memo", true, true);

    /** the serviceGroupName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, java.lang.String, java.lang.Object> $serviceGroupName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroupName", "serviceGroupName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> __entityPropertyTypeMap;

    private _DictServiceGroupPriDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "DictServiceGroupPriDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DictServiceGroupPriDto";
        __qualifiedTableName = "DictServiceGroupPriDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>>(3);
        __list.add($groupSn);
        __map.put("groupSn", $groupSn);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($serviceGroupName);
        __map.put("serviceGroupName", $serviceGroupName);
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
    public void preInsert(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto newEntity() {
        return new com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto();
    }

    @Override
    public Class<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto> getEntityClass() {
        return com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto.class;
    }

    @Override
    public com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto getOriginalStates(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DictServiceGroupPriDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DictServiceGroupPriDto newInstance() {
        return new _DictServiceGroupPriDto();
    }

}
