package iih.di.db.gen.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:37.101+0800")
public class DiEntityDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements iih.di.db.gen.dao.DiEntityDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "insert", iih.di.db.gen.entity.DiEntity.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "insertExludeNull", iih.di.db.gen.entity.DiEntity.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "update", iih.di.db.gen.entity.DiEntity.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "updateExcludeNull", iih.di.db.gen.entity.DiEntity.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "markDelete", iih.di.db.gen.entity.DiEntity.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "delete", iih.di.db.gen.entity.DiEntity.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "batchInsert", java.util.List.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "batchUpdate", java.util.List.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(iih.di.db.gen.dao.DiEntityDao.class, "batchDelete", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public DiEntityDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public iih.di.db.gen.entity.DiEntity selectById(java.lang.String diSn) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "selectById", diSn);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/iih/di/db/gen/dao/DiEntityDao/selectById.sql");
            __query.addParameter("diSn", java.lang.String.class, diSn);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<iih.di.db.gen.entity.DiEntity> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<iih.di.db.gen.entity.DiEntity>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal()));
            iih.di.db.gen.entity.DiEntity __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(iih.di.db.gen.entity.DiEntity entity) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int insertExludeNull(iih.di.db.gen.entity.DiEntity entity) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "insertExludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("insertExludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "insertExludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "insertExludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int update(iih.di.db.gen.entity.DiEntity entity) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("update");
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
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateExcludeNull(iih.di.db.gen.entity.DiEntity entity) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "updateExcludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("updateExcludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
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
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "updateExcludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "updateExcludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int markDelete(iih.di.db.gen.entity.DiEntity entity) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "markDelete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("markDelete");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
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
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "markDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "markDelete", __e);
            throw __e;
        }
    }

    @Override
    public int delete(iih.di.db.gen.entity.DiEntity entity) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchInsert(java.util.List<iih.di.db.gen.entity.DiEntity> entities) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "batchInsert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchInsertQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchInsertQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("batchInsert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchInsertCommand __command = new org.seasar.doma.internal.jdbc.command.BatchInsertCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "batchInsert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "batchInsert", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchUpdate(java.util.List<iih.di.db.gen.entity.DiEntity> entities) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "batchUpdate", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchUpdateQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchUpdateQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method8);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("batchUpdate");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchUpdateCommand __command = new org.seasar.doma.internal.jdbc.command.BatchUpdateCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "batchUpdate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "batchUpdate", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchDelete(java.util.List<iih.di.db.gen.entity.DiEntity> entities) {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "batchDelete", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchDeleteQuery<iih.di.db.gen.entity.DiEntity> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchDeleteQuery<iih.di.db.gen.entity.DiEntity>(iih.di.db.gen.entity._DiEntity.getSingletonInternal());
            __query.setMethod(__method9);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("batchDelete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchDeleteCommand __command = new org.seasar.doma.internal.jdbc.command.BatchDeleteCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "batchDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "batchDelete", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Clob createClob() {
        entering("iih.di.db.gen.dao.DiEntityDaoImpl", "createClob");
        try {
            org.seasar.doma.internal.jdbc.query.ClobCreateQuery __query = new org.seasar.doma.internal.jdbc.query.ClobCreateQuery();
            __query.setConfig(config);
            __query.setCallerClassName("iih.di.db.gen.dao.DiEntityDaoImpl");
            __query.setCallerMethodName("createClob");
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.CreateCommand<java.sql.Clob> __command = new org.seasar.doma.internal.jdbc.command.CreateCommand<java.sql.Clob>(__query);
            java.sql.Clob __result = __command.execute();
            __query.complete();
            exiting("iih.di.db.gen.dao.DiEntityDaoImpl", "createClob", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("iih.di.db.gen.dao.DiEntityDaoImpl", "createClob", __e);
            throw __e;
        }
    }

}
