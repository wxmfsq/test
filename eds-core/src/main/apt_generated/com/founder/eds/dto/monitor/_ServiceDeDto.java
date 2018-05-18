package com.founder.eds.dto.monitor;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.616+0800")
public final class _ServiceDeDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.monitor.ServiceDeDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _ServiceDeDto __singleton = new _ServiceDeDto();

    /** the serviceDefinitionSn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.Integer, java.lang.Object> $serviceDefinitionSn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.monitor.ServiceDeDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "serviceDefinitionSn", "serviceDefinitionSn", true, true);

    /** the serviceGroup */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.String, java.lang.Object> $serviceGroup = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.monitor.ServiceDeDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroup", "serviceGroup", true, true);

    /** the serviceGroupName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.String, java.lang.Object> $serviceGroupName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.monitor.ServiceDeDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceGroupName", "serviceGroupName", true, true);

    /** the serviceGroups */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.Integer, java.lang.Object> $serviceGroups = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.monitor.ServiceDeDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "serviceGroups", "serviceGroups", true, true);

    /** the serviceName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.String, java.lang.Object> $serviceName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.monitor.ServiceDeDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "serviceName", "serviceName", true, true);

    /** the serviceNames */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.Integer, java.lang.Object> $serviceNames = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, java.lang.Integer, java.lang.Object>(com.founder.eds.dto.monitor.ServiceDeDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "serviceNames", "serviceNames", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> __entityPropertyTypeMap;

    private _ServiceDeDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ServiceDeDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ServiceDeDto";
        __qualifiedTableName = "ServiceDeDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>>(6);
        __list.add($serviceDefinitionSn);
        __map.put("serviceDefinitionSn", $serviceDefinitionSn);
        __list.add($serviceGroup);
        __map.put("serviceGroup", $serviceGroup);
        __list.add($serviceGroupName);
        __map.put("serviceGroupName", $serviceGroupName);
        __list.add($serviceGroups);
        __map.put("serviceGroups", $serviceGroups);
        __list.add($serviceName);
        __map.put("serviceName", $serviceName);
        __list.add($serviceNames);
        __map.put("serviceNames", $serviceNames);
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
    public void preInsert(com.founder.eds.dto.monitor.ServiceDeDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.monitor.ServiceDeDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.monitor.ServiceDeDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.monitor.ServiceDeDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.monitor.ServiceDeDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.monitor.ServiceDeDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.monitor.ServiceDeDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.monitor.ServiceDeDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.monitor.ServiceDeDto newEntity() {
        return new com.founder.eds.dto.monitor.ServiceDeDto();
    }

    @Override
    public Class<com.founder.eds.dto.monitor.ServiceDeDto> getEntityClass() {
        return com.founder.eds.dto.monitor.ServiceDeDto.class;
    }

    @Override
    public com.founder.eds.dto.monitor.ServiceDeDto getOriginalStates(com.founder.eds.dto.monitor.ServiceDeDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.monitor.ServiceDeDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ServiceDeDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ServiceDeDto newInstance() {
        return new _ServiceDeDto();
    }

}
