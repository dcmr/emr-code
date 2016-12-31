package pkuhit.iih.qa.dao.qacustom;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2016-12-28T22:24:26.432+0800")
public class CusQaStatisticsDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public CusQaStatisticsDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> selectAmrLevelRate() {
        entering("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl", "selectAmrLevelRate");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/pkuhit/iih/qa/dao/qacustom/CusQaStatisticsDao/selectAmrLevelRate.sql");
            __query.setCallerClassName("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl");
            __query.setCallerMethodName("selectAmrLevelRate");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>(__query, new org.seasar.doma.internal.jdbc.command.MapResultListHandler(org.seasar.doma.MapKeyNamingType.NONE));
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl", "selectAmrLevelRate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl", "selectAmrLevelRate", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> selectAmrCounts() {
        entering("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl", "selectAmrCounts");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/pkuhit/iih/qa/dao/qacustom/CusQaStatisticsDao/selectAmrCounts.sql");
            __query.setCallerClassName("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl");
            __query.setCallerMethodName("selectAmrCounts");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>(__query, new org.seasar.doma.internal.jdbc.command.MapResultListHandler(org.seasar.doma.MapKeyNamingType.NONE));
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl", "selectAmrCounts", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.qacustom.CusQaStatisticsDaoImpl", "selectAmrCounts", __e);
            throw __e;
        }
    }

}