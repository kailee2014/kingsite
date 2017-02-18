package com.blooms.kingsite.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blooms.kingsite.common.service.CrudService;
import com.blooms.kingsite.modules.test.entity.Test;
import com.blooms.kingsite.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author Blooms
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
