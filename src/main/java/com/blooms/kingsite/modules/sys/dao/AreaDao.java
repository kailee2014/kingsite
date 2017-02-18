package com.blooms.kingsite.modules.sys.dao;

import com.blooms.kingsite.common.persistence.TreeDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author Blooms
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
