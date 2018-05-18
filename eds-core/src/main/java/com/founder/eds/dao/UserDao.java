package com.founder.eds.dao;

import java.util.List;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;

import com.founder.eds.dto.LoginDto;

@Dao
@AnnotateWith(annotations = {@Annotation(target = AnnotationTarget.CLASS, type = Component.class),
@Annotation(target=AnnotationTarget.CONSTRUCTOR, type= Autowired.class)})
public interface UserDao {
	
	@Select
	public List<LoginDto> selectUserByUserId(String userId);
}
