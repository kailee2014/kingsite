package com.blooms.kingsite.test.dao;

import com.blooms.kingsite.common.persistence.CrudDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * @author Blooms
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}