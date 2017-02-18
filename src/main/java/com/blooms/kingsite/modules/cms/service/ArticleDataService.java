package com.blooms.kingsite.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blooms.kingsite.common.service.CrudService;
import com.blooms.kingsite.modules.cms.dao.ArticleDataDao;
import com.blooms.kingsite.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * @author Blooms
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
