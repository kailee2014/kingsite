package com.blooms.kingsite.modules.cms.dao;

import com.blooms.kingsite.common.persistence.CrudDao;
import com.blooms.kingsite.common.persistence.annotation.MyBatisDao;
import com.blooms.kingsite.modules.cms.entity.Site;

/**
 * 站点DAO接口
 * @author Blooms
 * @version 2013-8-23
 */
@MyBatisDao
public interface SiteDao extends CrudDao<Site> {

}
