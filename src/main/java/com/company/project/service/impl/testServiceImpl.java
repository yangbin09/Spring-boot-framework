package com.company.project.service.impl;

import com.company.project.dao.testMapper;
import com.company.project.model.test;
import com.company.project.service.testService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/03.
 */
@Service
@Transactional
public class testServiceImpl extends AbstractService<test> implements testService {
    @Resource
    private testMapper user2Mapper;

}
