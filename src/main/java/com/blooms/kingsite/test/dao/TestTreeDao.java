package com.blooms.kingsite.test.dao;

import com.blooms.kingsite.common.persistence.TreeDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author Blooms
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}