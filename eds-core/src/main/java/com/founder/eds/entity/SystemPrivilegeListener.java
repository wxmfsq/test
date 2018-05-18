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

public class SystemPrivilegeListener implements EntityListener<SystemPrivilege>
{
    DefaultUserDetails userDetails;

    @Override
    public void preInsert(SystemPrivilege entity, PreInsertContext context)
    {
        entity.setCreateTime(DateUtils.getSystemTime());
        entity.setUpdateTime(DateUtils.getSystemTime());
        entity.setDeleteFlag(Constants.DELETE_FLAG_NONDEFAULT);
    }

    @Override
    public void preUpdate(SystemPrivilege entity, PreUpdateContext context)
    {
        entity.setUpdateTime(DateUtils.getSystemTime());
    }

    @Override
    public void preDelete(SystemPrivilege entity, PreDeleteContext context)
    {

    }

    @Override
    public void postInsert(SystemPrivilege entity, PostInsertContext context)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void postUpdate(SystemPrivilege entity, PostUpdateContext context)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void postDelete(SystemPrivilege entity, PostDeleteContext context)
    {
        // TODO Auto-generated method stub

    }

}
