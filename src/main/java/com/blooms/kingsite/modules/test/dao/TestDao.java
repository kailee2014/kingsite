package com.blooms.kingsite.modules.test.dao;

import com.blooms.kingsite.common.persistence.CrudDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.test.entity.Test;

/**
 * 测试DAO接口
 * @author Blooms
 * @version 2013-10-17
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
