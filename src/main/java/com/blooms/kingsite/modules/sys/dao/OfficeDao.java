package com.blooms.kingsite.modules.sys.dao;

import com.blooms.kingsite.common.persistence.TreeDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author Blooms
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
