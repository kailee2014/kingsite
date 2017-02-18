package com.blooms.kingsite.modules.sys.dao;

import com.blooms.kingsite.common.persistence.CrudDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author Blooms
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
