package com.founder.eds.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.739+0800")
public class UserDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.founder.eds.dao.UserDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.founder.eds.dto.LoginDto> selectUserByUserId(java.lang.String userId) {
        entering("com.founder.eds.dao.UserDaoImpl", "selectUserByUserId", userId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/UserDao/selectUserByUserId.sql");
            __query.addParameter("userId", java.lang.String.class, userId);
            __query.setCallerClassName("com.founder.eds.dao.UserDaoImpl");
            __query.setCallerMethodName("selectUserByUserId");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.LoginDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.LoginDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.LoginDto>(com.founder.eds.dto._LoginDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.LoginDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.UserDaoImpl", "selectUserByUserId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.UserDaoImpl", "selectUserByUserId", __e);
            throw __e;
        }
    }

}
