package com.founder.eds.dao;

import java.util.List;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.founder.eds.dto.DictionaryCacheDto;


/**
 * @author jin_peng
 * @version 1.0
 */
@Dao
@AnnotateWith(annotations = {
        @Annotation(target = AnnotationTarget.CLASS, type = Component.class),
        @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class) })
public interface DictionaryCacheDao
{
    /**
     * @return 字典列表
     */
    @Select
    public List<DictionaryCacheDto> selectDictionaries();

}
