package com.blooms.kingsite.modules.sys.dao;

import java.util.List;

import com.blooms.kingsite.common.persistence.CrudDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author Blooms
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
