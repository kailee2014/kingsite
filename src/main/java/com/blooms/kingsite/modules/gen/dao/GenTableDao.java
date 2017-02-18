package com.blooms.kingsite.modules.gen.dao;

import com.blooms.kingsite.common.persistence.CrudDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 * @author Blooms
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
