package com.founder.eds.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;
import com.founder.eds.util.DateUtils;
import com.founder.eds.core.Constants;
import com.founder.eds.dto.DefaultUserDetails;

public class SystemAccessIpListener implements EntityListener<SystemAccessIp>
{
    DefaultUserDetails userDetails;

    @Override
    public void preInsert(SystemAccessIp entity, PreInsertContext context)
    {
        entity.setCreateTime(DateUtils.getSystemTime());
        entity.setUpdateTime(DateUtils.getSystemTime());
        entity.setDeleteFlag(Constants.DELETE_FLAG_NONDEFAULT);
    }

    @Override
    public void preUpdate(SystemAccessIp entity, PreUpdateContext context)
    {
        if (entity.getDeleteFlag() == null
            || Constants.DELETE_FLAG_NONDEFAULT.equals(entity.getDeleteFlag()))
        {
            entity.setUpdateTime(DateUtils.getSystemTime());
        }
        else
        {
            entity.setDeleteTime(DateUtils.getSystemTime());
        }
    }

    @Override
    public void preDelete(SystemAccessIp entity, PreDeleteContext context)
    {

    }

    @Override
    public void postInsert(SystemAccessIp entity, PostInsertContext context)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void postUpdate(SystemAccessIp entity, PostUpdateContext context)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void postDelete(SystemAccessIp entity, PostDeleteContext context)
    {
        // TODO Auto-generated method stub

    }

}
