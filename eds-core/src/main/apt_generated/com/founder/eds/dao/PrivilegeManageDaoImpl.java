package com.founder.eds.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:55.983+0800")
public class PrivilegeManageDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.founder.eds.dao.PrivilegeManageDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.PrivilegeManageDao.class, "deleteSystemAccessIp", com.founder.eds.entity.SystemAccessIp.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.PrivilegeManageDao.class, "deleteSystemPrivilege", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.PrivilegeManageDao.class, "insertSystemPrivilege", com.founder.eds.entity.SystemPrivilege.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.PrivilegeManageDao.class, "saveSystemAccessIp", com.founder.eds.entity.SystemAccessIp.class);

    private static final java.lang.reflect.Method __method11 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.PrivilegeManageDao.class, "updateSystemAccessIp", com.founder.eds.entity.SystemAccessIp.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public PrivilegeManageDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int deleteSystemAccessIp(com.founder.eds.entity.SystemAccessIp systemAccessIp) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "deleteSystemAccessIp", systemAccessIp);
        try {
            if (systemAccessIp == null) {
                throw new org.seasar.doma.DomaNullPointerException("systemAccessIp");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/deleteSystemAccessIp.sql");
            __query.addParameter("systemAccessIp", com.founder.eds.entity.SystemAccessIp.class, systemAccessIp);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("deleteSystemAccessIp");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType(systemAccessIp, com.founder.eds.entity._SystemAccessIp.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "deleteSystemAccessIp", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "deleteSystemAccessIp", __e);
            throw __e;
        }
    }

    @Override
    public int deleteSystemPrivilege(java.lang.String accountSn) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "deleteSystemPrivilege", accountSn);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery();
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/deleteSystemPrivilege.sql");
            __query.addParameter("accountSn", java.lang.String.class, accountSn);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("deleteSystemPrivilege");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "deleteSystemPrivilege", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "deleteSystemPrivilege", __e);
            throw __e;
        }
    }

    @Override
    public int insertSystemPrivilege(com.founder.eds.entity.SystemPrivilege systemPrivilege) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "insertSystemPrivilege", systemPrivilege);
        try {
            if (systemPrivilege == null) {
                throw new org.seasar.doma.DomaNullPointerException("systemPrivilege");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/insertSystemPrivilege.sql");
            __query.addParameter("systemPrivilege", com.founder.eds.entity.SystemPrivilege.class, systemPrivilege);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("insertSystemPrivilege");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType(systemPrivilege, com.founder.eds.entity._SystemPrivilege.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "insertSystemPrivilege", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "insertSystemPrivilege", __e);
            throw __e;
        }
    }

    @Override
    public int saveSystemAccessIp(com.founder.eds.entity.SystemAccessIp systemAccessIp) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "saveSystemAccessIp", systemAccessIp);
        try {
            if (systemAccessIp == null) {
                throw new org.seasar.doma.DomaNullPointerException("systemAccessIp");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.SystemAccessIp> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.SystemAccessIp>(com.founder.eds.entity._SystemAccessIp.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(systemAccessIp);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("saveSystemAccessIp");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "saveSystemAccessIp", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "saveSystemAccessIp", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<java.lang.String> selectAccessIpById(java.util.List<java.lang.String> accessIps) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectAccessIpById", accessIps);
        try {
            if (accessIps == null) {
                throw new org.seasar.doma.DomaNullPointerException("accessIps");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectAccessIpById.sql");
            __query.addParameter("accessIps", java.util.List.class, accessIps);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectAccessIpById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.lang.String>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.lang.String>>(__query, new org.seasar.doma.internal.jdbc.command.BasicResultListHandler<java.lang.String>(new org.seasar.doma.wrapper.StringWrapper()));
            java.util.List<java.lang.String> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectAccessIpById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectAccessIpById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto> selectDictServiceGroup() {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectDictServiceGroup");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectDictServiceGroup.sql");
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectDictServiceGroup");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto>(com.founder.eds.dto.privilegeManage._DictServiceGroupPriDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.privilegeManage.DictServiceGroupPriDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectDictServiceGroup", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectDictServiceGroup", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto> selectServiceDefinition() {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectServiceDefinition");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectServiceDefinition.sql");
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectServiceDefinition");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto>(com.founder.eds.dto.privilegeManage._ServiceDefinitionPriDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.privilegeManage.ServiceDefinitionPriDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectServiceDefinition", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectServiceDefinition", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto> selectSystemAccessIp() {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccessIp");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectSystemAccessIp.sql");
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectSystemAccessIp");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.privilegeManage.SystemAccessIpDto>(com.founder.eds.dto.privilegeManage._SystemAccessIpDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccessIp", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccessIp", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto> selectSystemAccessIpById(java.util.List<java.lang.String> accessIpSns, java.util.List<java.lang.String> accessIps, java.lang.String accessIp, int operFlag) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccessIpById", accessIpSns, accessIps, accessIp, operFlag);
        try {
            if (accessIpSns == null) {
                throw new org.seasar.doma.DomaNullPointerException("accessIpSns");
            }
            if (accessIps == null) {
                throw new org.seasar.doma.DomaNullPointerException("accessIps");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectSystemAccessIpById.sql");
            __query.addParameter("accessIpSns", java.util.List.class, accessIpSns);
            __query.addParameter("accessIps", java.util.List.class, accessIps);
            __query.addParameter("accessIp", java.lang.String.class, accessIp);
            __query.addParameter("operFlag", int.class, operFlag);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectSystemAccessIpById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.privilegeManage.SystemAccessIpDto>(com.founder.eds.dto.privilegeManage._SystemAccessIpDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.privilegeManage.SystemAccessIpDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccessIpById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccessIpById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.privilegeManage.SystemAccountDto> selectSystemAccount() {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccount");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectSystemAccount.sql");
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectSystemAccount");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemAccountDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemAccountDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.privilegeManage.SystemAccountDto>(com.founder.eds.dto.privilegeManage._SystemAccountDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.privilegeManage.SystemAccountDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccount", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemAccount", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto> selectSystemPrivilegeByAccountSn(java.lang.String accountSn) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemPrivilegeByAccountSn", accountSn);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/selectSystemPrivilegeByAccountSn.sql");
            __query.addParameter("accountSn", java.lang.String.class, accountSn);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("selectSystemPrivilegeByAccountSn");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto>(com.founder.eds.dto.privilegeManage._SystemPrivilegeDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.privilegeManage.SystemPrivilegeDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemPrivilegeByAccountSn", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "selectSystemPrivilegeByAccountSn", __e);
            throw __e;
        }
    }

    @Override
    public int updateSystemAccessIp(com.founder.eds.entity.SystemAccessIp systemAccessIp) {
        entering("com.founder.eds.dao.PrivilegeManageDaoImpl", "updateSystemAccessIp", systemAccessIp);
        try {
            if (systemAccessIp == null) {
                throw new org.seasar.doma.DomaNullPointerException("systemAccessIp");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method11);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/PrivilegeManageDao/updateSystemAccessIp.sql");
            __query.addParameter("systemAccessIp", com.founder.eds.entity.SystemAccessIp.class, systemAccessIp);
            __query.setCallerClassName("com.founder.eds.dao.PrivilegeManageDaoImpl");
            __query.setCallerMethodName("updateSystemAccessIp");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType(systemAccessIp, com.founder.eds.entity._SystemAccessIp.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.PrivilegeManageDaoImpl", "updateSystemAccessIp", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.PrivilegeManageDaoImpl", "updateSystemAccessIp", __e);
            throw __e;
        }
    }

}
