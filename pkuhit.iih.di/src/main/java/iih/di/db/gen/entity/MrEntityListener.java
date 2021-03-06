package iih.di.db.gen.entity;

import java.sql.Timestamp;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import pkuhit.xap.ac.Session;

/**
 * 
 */
public class MrEntityListener implements EntityListener<MrEntity> {

    @Override
    public void preInsert(MrEntity entity, PreInsertContext<MrEntity> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(MrEntity entity, PreUpdateContext<MrEntity> context) {
    	Session session = Session.get();
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    }

    @Override
    public void preDelete(MrEntity entity, PreDeleteContext<MrEntity> context) {
    }

    @Override
    public void postInsert(MrEntity entity, PostInsertContext<MrEntity> context) {
    }

    @Override
    public void postUpdate(MrEntity entity, PostUpdateContext<MrEntity> context) {
    }

    @Override
    public void postDelete(MrEntity entity, PostDeleteContext<MrEntity> context) {
    }
    

}