package com.founder.eds.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.founder.eds.core.Constants;
import com.founder.eds.dto.DefaultUserDetails;
import com.founder.eds.util.DateUtils;

public class InputParamListener implements EntityListener<InputParam>{
	DefaultUserDetails userDetails ;

	@Override
	public void preInsert(InputParam entity, PreInsertContext context) {
		userDetails = (DefaultUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		entity.setCreateby(userDetails.getUsername());
		entity.setUpdateby(userDetails.getUsername());
		entity.setCreateTime(DateUtils.getSystemTime());
		entity.setUpdateTime(DateUtils.getSystemTime());
		entity.setDeleteFlag(Constants.DELETE_FLAG_NONDEFAULT);		
	}

	@Override
	public void preUpdate(InputParam entity, PreUpdateContext context) {
		userDetails = (DefaultUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		if (entity.getDeleteFlag() == null
				|| Constants.DELETE_FLAG_NONDEFAULT.equals(entity.getDeleteFlag())) {
			entity.setUpdateby(userDetails.getUsername());
			entity.setUpdateTime(DateUtils.getSystemTime());
		}else if (Constants.DELETE_FLAG_NONDEFAULT.equals(entity
					.getDeleteFlag())) {
				entity.setDeleteby(userDetails.getUsername());
				entity.setDeleteTime(DateUtils.getSystemTime());
			}	
	}

	@Override
	public void preDelete(InputParam entity, PreDeleteContext context) {
		userDetails = (DefaultUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		if (entity.getDeleteFlag() == null
				|| Constants.DELETE_FLAG_NONDEFAULT.equals(entity.getDeleteFlag())) {
			entity.setUpdateby(userDetails.getUsername());
			entity.setUpdateTime(DateUtils.getSystemTime());
		}else if (Constants.DELETE_FLAG_NONDEFAULT.equals(entity
					.getDeleteFlag())) {
				entity.setDeleteby(userDetails.getUsername());
				entity.setDeleteTime(DateUtils.getSystemTime());
			}	
		
	}

	@Override
	public void postInsert(InputParam entity, PostInsertContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postUpdate(InputParam entity, PostUpdateContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postDelete(InputParam entity, PostDeleteContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
