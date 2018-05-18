package com.founder.eds.dao;

/** */
@org.springframework.stereotype.Component()
@javax.annotation.Generated(value = { "Doma", "1.30.0" }, date = "2015-09-22T18:20:56.496+0800")
public class ExternalDataDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.founder.eds.dao.ExternalDataDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.30.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "UpdateDataSource", com.founder.eds.entity.DataSource.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "dataSourceDelete", com.founder.eds.entity.DataSource.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "dataSourceSave", com.founder.eds.entity.DataSource.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "externalDataServeSave", com.founder.eds.entity.ServiceDefinition.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "externalDataServeUpdate", com.founder.eds.entity.ServiceDefinition.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "groupManageDelete", com.founder.eds.entity.DictServiceGroup.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "groupManageSave", com.founder.eds.entity.DictServiceGroup.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "inputParamDele", com.founder.eds.entity.InputParam.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "inputSave", com.founder.eds.entity.InputParam.class);

    private static final java.lang.reflect.Method __method10 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "resultParamDele", com.founder.eds.entity.ResultParam.class);

    private static final java.lang.reflect.Method __method11 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "resultSave", com.founder.eds.entity.ResultParam.class);

    private static final java.lang.reflect.Method __method28 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "serviceDefinitionDele", com.founder.eds.entity.ServiceDefinition.class);

    private static final java.lang.reflect.Method __method29 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.founder.eds.dao.ExternalDataDao.class, "updateGroupManage", com.founder.eds.entity.DictServiceGroup.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ExternalDataDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int UpdateDataSource(com.founder.eds.entity.DataSource dataSource) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "UpdateDataSource", dataSource);
        try {
            if (dataSource == null) {
                throw new org.seasar.doma.DomaNullPointerException("dataSource");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.DataSource> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.DataSource>(com.founder.eds.entity._DataSource.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(dataSource);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("UpdateDataSource");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "UpdateDataSource", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "UpdateDataSource", __e);
            throw __e;
        }
    }

    @Override
    public int dataSourceDelete(com.founder.eds.entity.DataSource dataSource) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "dataSourceDelete", dataSource);
        try {
            if (dataSource == null) {
                throw new org.seasar.doma.DomaNullPointerException("dataSource");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.DataSource> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.DataSource>(com.founder.eds.entity._DataSource.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(dataSource);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("dataSourceDelete");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "dataSourceDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "dataSourceDelete", __e);
            throw __e;
        }
    }

    @Override
    public int dataSourceSave(com.founder.eds.entity.DataSource dataSource) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "dataSourceSave", dataSource);
        try {
            if (dataSource == null) {
                throw new org.seasar.doma.DomaNullPointerException("dataSource");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.DataSource> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.DataSource>(com.founder.eds.entity._DataSource.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(dataSource);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("dataSourceSave");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "dataSourceSave", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "dataSourceSave", __e);
            throw __e;
        }
    }

    @Override
    public int externalDataServeSave(com.founder.eds.entity.ServiceDefinition serviceDefinition) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "externalDataServeSave", serviceDefinition);
        try {
            if (serviceDefinition == null) {
                throw new org.seasar.doma.DomaNullPointerException("serviceDefinition");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.ServiceDefinition> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.ServiceDefinition>(com.founder.eds.entity._ServiceDefinition.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(serviceDefinition);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("externalDataServeSave");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "externalDataServeSave", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "externalDataServeSave", __e);
            throw __e;
        }
    }

    @Override
    public int externalDataServeUpdate(com.founder.eds.entity.ServiceDefinition serviceDefinition) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "externalDataServeUpdate", serviceDefinition);
        try {
            if (serviceDefinition == null) {
                throw new org.seasar.doma.DomaNullPointerException("serviceDefinition");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.ServiceDefinition> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.ServiceDefinition>(com.founder.eds.entity._ServiceDefinition.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(config);
            __query.setEntity(serviceDefinition);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("externalDataServeUpdate");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "externalDataServeUpdate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "externalDataServeUpdate", __e);
            throw __e;
        }
    }

    @Override
    public int groupManageDelete(com.founder.eds.entity.DictServiceGroup dictServiceGroup) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageDelete", dictServiceGroup);
        try {
            if (dictServiceGroup == null) {
                throw new org.seasar.doma.DomaNullPointerException("dictServiceGroup");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.DictServiceGroup> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(config);
            __query.setEntity(dictServiceGroup);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("groupManageDelete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageDelete", __e);
            throw __e;
        }
    }

    @Override
    public int groupManageSave(com.founder.eds.entity.DictServiceGroup dictServiceGroup) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageSave", dictServiceGroup);
        try {
            if (dictServiceGroup == null) {
                throw new org.seasar.doma.DomaNullPointerException("dictServiceGroup");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.DictServiceGroup> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(dictServiceGroup);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("groupManageSave");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageSave", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageSave", __e);
            throw __e;
        }
    }

    @Override
    public com.founder.eds.entity.DictServiceGroup groupManageUpdate(java.lang.Integer groupSn) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageUpdate", groupSn);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/groupManageUpdate.sql");
            __query.addParameter("groupSn", java.lang.Integer.class, groupSn);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("groupManageUpdate");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.entity.DictServiceGroup> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.entity.DictServiceGroup>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal()));
            com.founder.eds.entity.DictServiceGroup __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageUpdate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "groupManageUpdate", __e);
            throw __e;
        }
    }

    @Override
    public int inputParamDele(com.founder.eds.entity.InputParam inputParam) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "inputParamDele", inputParam);
        try {
            if (inputParam == null) {
                throw new org.seasar.doma.DomaNullPointerException("inputParam");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.InputParam> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.InputParam>(com.founder.eds.entity._InputParam.getSingletonInternal());
            __query.setMethod(__method8);
            __query.setConfig(config);
            __query.setEntity(inputParam);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("inputParamDele");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "inputParamDele", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "inputParamDele", __e);
            throw __e;
        }
    }

    @Override
    public int inputSave(com.founder.eds.entity.InputParam inputParam) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "inputSave", inputParam);
        try {
            if (inputParam == null) {
                throw new org.seasar.doma.DomaNullPointerException("inputParam");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.InputParam> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.InputParam>(com.founder.eds.entity._InputParam.getSingletonInternal());
            __query.setMethod(__method9);
            __query.setConfig(config);
            __query.setEntity(inputParam);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("inputSave");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "inputSave", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "inputSave", __e);
            throw __e;
        }
    }

    @Override
    public int resultParamDele(com.founder.eds.entity.ResultParam resultParam) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "resultParamDele", resultParam);
        try {
            if (resultParam == null) {
                throw new org.seasar.doma.DomaNullPointerException("resultParam");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.ResultParam> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.ResultParam>(com.founder.eds.entity._ResultParam.getSingletonInternal());
            __query.setMethod(__method10);
            __query.setConfig(config);
            __query.setEntity(resultParam);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("resultParamDele");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "resultParamDele", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "resultParamDele", __e);
            throw __e;
        }
    }

    @Override
    public int resultSave(com.founder.eds.entity.ResultParam resultParam) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "resultSave", resultParam);
        try {
            if (resultParam == null) {
                throw new org.seasar.doma.DomaNullPointerException("resultParam");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.ResultParam> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.founder.eds.entity.ResultParam>(com.founder.eds.entity._ResultParam.getSingletonInternal());
            __query.setMethod(__method11);
            __query.setConfig(config);
            __query.setEntity(resultParam);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("resultSave");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "resultSave", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "resultSave", __e);
            throw __e;
        }
    }

    @Override
    public com.founder.eds.entity.DataSourceEntity selectAllDataSourceId(java.lang.Integer dataSourceSn) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectAllDataSourceId", dataSourceSn);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectAllDataSourceId.sql");
            __query.addParameter("dataSourceSn", java.lang.Integer.class, dataSourceSn);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectAllDataSourceId");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.entity.DataSourceEntity> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.entity.DataSourceEntity>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.founder.eds.entity.DataSourceEntity>(com.founder.eds.entity._DataSourceEntity.getSingletonInternal()));
            com.founder.eds.entity.DataSourceEntity __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectAllDataSourceId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectAllDataSourceId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.DataSourceDto> selectDataSource(com.founder.eds.dto.DataSourceDto cond, org.seasar.doma.jdbc.SelectOptions selectOptions) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSource", cond, selectOptions);
        try {
            if (cond == null) {
                throw new org.seasar.doma.DomaNullPointerException("cond");
            }
            if (selectOptions == null) {
                throw new org.seasar.doma.DomaNullPointerException("selectOptions");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectDataSource.sql");
            __query.setOptions(selectOptions);
            __query.addParameter("cond", com.founder.eds.dto.DataSourceDto.class, cond);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectDataSource");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.DataSourceDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.DataSourceDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.DataSourceDto>(com.founder.eds.dto._DataSourceDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.DataSourceDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSource", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSource", __e);
            throw __e;
        }
    }

    @Override
    public com.founder.eds.dto.DataSourceDto selectDataSourceId(java.lang.Integer dataSourceSn) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSourceId", dataSourceSn);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectDataSourceId.sql");
            __query.addParameter("dataSourceSn", java.lang.Integer.class, dataSourceSn);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectDataSourceId");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.dto.DataSourceDto> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.dto.DataSourceDto>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.founder.eds.dto.DataSourceDto>(com.founder.eds.dto._DataSourceDto.getSingletonInternal()));
            com.founder.eds.dto.DataSourceDto __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSourceId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSourceId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DataSourceEntity> selectDataSourcebyId(java.lang.Integer integer, java.util.List<java.lang.Integer> list) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSourcebyId", integer, list);
        try {
            if (list == null) {
                throw new org.seasar.doma.DomaNullPointerException("list");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectDataSourcebyId.sql");
            __query.addParameter("integer", java.lang.Integer.class, integer);
            __query.addParameter("list", java.util.List.class, list);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectDataSourcebyId");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DataSourceEntity>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DataSourceEntity>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DataSourceEntity>(com.founder.eds.entity._DataSourceEntity.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DataSourceEntity> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSourcebyId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectDataSourcebyId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.InputParam> selectInputParam(java.lang.Integer key) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectInputParam", key);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectInputParam.sql");
            __query.addParameter("key", java.lang.Integer.class, key);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectInputParam");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.InputParam>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.InputParam>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.InputParam>(com.founder.eds.entity._InputParam.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.InputParam> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectInputParam", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectInputParam", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DataSource> selectPullDown() {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectPullDown");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectPullDown.sql");
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectPullDown");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DataSource>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DataSource>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DataSource>(com.founder.eds.entity._DataSource.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DataSource> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectPullDown", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectPullDown", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.ResultParamDto> selectResultParam(java.lang.Integer key) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectResultParam", key);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectResultParam.sql");
            __query.addParameter("key", java.lang.Integer.class, key);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectResultParam");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.ResultParamDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.ResultParamDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.ResultParamDto>(com.founder.eds.dto._ResultParamDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.ResultParamDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectResultParam", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectResultParam", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.ResultParam> selectResultParamEntity(java.lang.Integer key) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectResultParamEntity", key);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectResultParamEntity.sql");
            __query.addParameter("key", java.lang.Integer.class, key);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectResultParamEntity");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.ResultParam>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.ResultParam>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.ResultParam>(com.founder.eds.entity._ResultParam.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.ResultParam> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectResultParamEntity", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectResultParamEntity", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.ServiceDefinition> selectServiceById(java.lang.Integer integer, java.util.List<java.lang.Integer> list) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceById", integer, list);
        try {
            if (list == null) {
                throw new org.seasar.doma.DomaNullPointerException("list");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectServiceById.sql");
            __query.addParameter("integer", java.lang.Integer.class, integer);
            __query.addParameter("list", java.util.List.class, list);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectServiceById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.ServiceDefinition>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.ServiceDefinition>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.ServiceDefinition>(com.founder.eds.entity._ServiceDefinition.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.ServiceDefinition> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.dto.monitor.ServiceDeDto> selectServiceDefinition() {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceDefinition");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectServiceDefinition.sql");
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectServiceDefinition");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.monitor.ServiceDeDto>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.dto.monitor.ServiceDeDto>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.dto.monitor.ServiceDeDto>(com.founder.eds.dto.monitor._ServiceDeDto.getSingletonInternal()));
            java.util.List<com.founder.eds.dto.monitor.ServiceDeDto> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceDefinition", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceDefinition", __e);
            throw __e;
        }
    }

    @Override
    public com.founder.eds.entity.ServiceDefinition selectServiceDfinition(java.lang.Integer key) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceDfinition", key);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectServiceDfinition.sql");
            __query.addParameter("key", java.lang.Integer.class, key);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectServiceDfinition");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.entity.ServiceDefinition> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.founder.eds.entity.ServiceDefinition>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.founder.eds.entity.ServiceDefinition>(com.founder.eds.entity._ServiceDefinition.getSingletonInternal()));
            com.founder.eds.entity.ServiceDefinition __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceDfinition", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceDfinition", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DictServiceGroup> selectServiceGroup(com.founder.eds.dto.DictServiceGroupDto dictServiceGroupDto, org.seasar.doma.jdbc.SelectOptions selectOptions) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceGroup", dictServiceGroupDto, selectOptions);
        try {
            if (dictServiceGroupDto == null) {
                throw new org.seasar.doma.DomaNullPointerException("dictServiceGroupDto");
            }
            if (selectOptions == null) {
                throw new org.seasar.doma.DomaNullPointerException("selectOptions");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectServiceGroup.sql");
            __query.setOptions(selectOptions);
            __query.addParameter("dictServiceGroupDto", com.founder.eds.dto.DictServiceGroupDto.class, dictServiceGroupDto);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectServiceGroup");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DictServiceGroup> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceGroup", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceGroup", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DictServiceGroup> selectServiceGroupById(java.lang.Integer integer, java.util.List<java.lang.Integer> list) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceGroupById", integer, list);
        try {
            if (list == null) {
                throw new org.seasar.doma.DomaNullPointerException("list");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectServiceGroupById.sql");
            __query.addParameter("integer", java.lang.Integer.class, integer);
            __query.addParameter("list", java.util.List.class, list);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectServiceGroupById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DictServiceGroup> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceGroupById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectServiceGroupById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DictServiceGroup> selectServicedf() {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectServicedf");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectServicedf.sql");
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectServicedf");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DictServiceGroup> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectServicedf", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectServicedf", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DictServiceGroup> selectgroupName(java.lang.String serviceGroupName) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectgroupName", serviceGroupName);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectgroupName.sql");
            __query.addParameter("serviceGroupName", java.lang.String.class, serviceGroupName);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectgroupName");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DictServiceGroup> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectgroupName", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectgroupName", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.founder.eds.entity.DictServiceGroup> selectgroupNameSn(com.founder.eds.dto.DictServiceGroupDto dictServiceGroupDto) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "selectgroupNameSn", dictServiceGroupDto);
        try {
            if (dictServiceGroupDto == null) {
                throw new org.seasar.doma.DomaNullPointerException("dictServiceGroupDto");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/founder/eds/dao/ExternalDataDao/selectgroupNameSn.sql");
            __query.addParameter("dictServiceGroupDto", com.founder.eds.dto.DictServiceGroupDto.class, dictServiceGroupDto);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("selectgroupNameSn");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.founder.eds.entity.DictServiceGroup>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal()));
            java.util.List<com.founder.eds.entity.DictServiceGroup> __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "selectgroupNameSn", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "selectgroupNameSn", __e);
            throw __e;
        }
    }

    @Override
    public int serviceDefinitionDele(com.founder.eds.entity.ServiceDefinition serviceDefinition) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "serviceDefinitionDele", serviceDefinition);
        try {
            if (serviceDefinition == null) {
                throw new org.seasar.doma.DomaNullPointerException("serviceDefinition");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.ServiceDefinition> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.founder.eds.entity.ServiceDefinition>(com.founder.eds.entity._ServiceDefinition.getSingletonInternal());
            __query.setMethod(__method28);
            __query.setConfig(config);
            __query.setEntity(serviceDefinition);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("serviceDefinitionDele");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "serviceDefinitionDele", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "serviceDefinitionDele", __e);
            throw __e;
        }
    }

    @Override
    public int updateGroupManage(com.founder.eds.entity.DictServiceGroup dictServiceGroup) {
        entering("com.founder.eds.dao.ExternalDataDaoImpl", "updateGroupManage", dictServiceGroup);
        try {
            if (dictServiceGroup == null) {
                throw new org.seasar.doma.DomaNullPointerException("dictServiceGroup");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.DictServiceGroup> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.founder.eds.entity.DictServiceGroup>(com.founder.eds.entity._DictServiceGroup.getSingletonInternal());
            __query.setMethod(__method29);
            __query.setConfig(config);
            __query.setEntity(dictServiceGroup);
            __query.setCallerClassName("com.founder.eds.dao.ExternalDataDaoImpl");
            __query.setCallerMethodName("updateGroupManage");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.founder.eds.dao.ExternalDataDaoImpl", "updateGroupManage", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.founder.eds.dao.ExternalDataDaoImpl", "updateGroupManage", __e);
            throw __e;
        }
    }

}
