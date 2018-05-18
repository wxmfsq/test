package com.founder.eds.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.759+0800")
public class DictionaryCacheDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.founder.eds.dao.DictionaryCacheDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public DictionaryCacheDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.founder.eds.dto.DictionaryCacheDto> selectDictionaries() {
        entering("com.founder.eds.dao.DictionaryCacheDaoImpl", "selectDictionaries");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/DictionaryCacheDao/selectDictionaries.sql");
            __query.setCallerClassName("com.founder.eds.dao.DictionaryCacheDaoImpl");
            __query.setCallerMethodName("selectDictionaries");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.DictionaryCacheDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.DictionaryCacheDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.DictionaryCacheDto>(com.founder.eds.dto._DictionaryCacheDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.DictionaryCacheDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.DictionaryCacheDaoImpl", "selectDictionaries", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.DictionaryCacheDaoImpl", "selectDictionaries", __e);
            throw __e;
        }
    }

}
