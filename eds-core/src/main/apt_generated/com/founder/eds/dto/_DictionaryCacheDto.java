package com.founder.eds.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.453+0800")
public final class _DictionaryCacheDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.founder.eds.dto.DictionaryCacheDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final _DictionaryCacheDto __singleton = new _DictionaryCacheDto();

    /** the csCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $csCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "csCode", "csCode", true, true);

    /** the csName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $csName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "csName", "csName", true, true);

    /** the cvCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $cvCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cvCode", "cvCode", true, true);

    /** the cvId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $cvId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cvId", "cvId", true, true);

    /** the cvValue */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $cvValue = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cvValue", "cvValue", true, true);

    /** the pyCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $pyCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "pyCode", "pyCode", true, true);

    /** the seqNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object> $seqNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, java.lang.String, java.lang.Object>(com.founder.eds.dto.DictionaryCacheDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "seqNo", "seqNo", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> __entityPropertyTypeMap;

    private _DictionaryCacheDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "DictionaryCacheDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DictionaryCacheDto";
        __qualifiedTableName = "DictionaryCacheDto";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>>(7);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>>(7);
        __list.add($csCode);
        __map.put("csCode", $csCode);
        __list.add($csName);
        __map.put("csName", $csName);
        __list.add($cvCode);
        __map.put("cvCode", $cvCode);
        __list.add($cvId);
        __map.put("cvId", $cvId);
        __list.add($cvValue);
        __map.put("cvValue", $cvValue);
        __list.add($pyCode);
        __map.put("pyCode", $pyCode);
        __list.add($seqNo);
        __map.put("seqNo", $seqNo);
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
    public void preInsert(com.founder.eds.dto.DictionaryCacheDto entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.founder.eds.dto.DictionaryCacheDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.founder.eds.dto.DictionaryCacheDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.founder.eds.dto.DictionaryCacheDto entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.founder.eds.dto.DictionaryCacheDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.founder.eds.dto.DictionaryCacheDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.founder.eds.dto.DictionaryCacheDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.founder.eds.dto.DictionaryCacheDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.founder.eds.dto.DictionaryCacheDto newEntity() {
        return new com.founder.eds.dto.DictionaryCacheDto();
    }

    @Override
    public Class<com.founder.eds.dto.DictionaryCacheDto> getEntityClass() {
        return com.founder.eds.dto.DictionaryCacheDto.class;
    }

    @Override
    public com.founder.eds.dto.DictionaryCacheDto getOriginalStates(com.founder.eds.dto.DictionaryCacheDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.founder.eds.dto.DictionaryCacheDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DictionaryCacheDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DictionaryCacheDto newInstance() {
        return new _DictionaryCacheDto();
    }

}
