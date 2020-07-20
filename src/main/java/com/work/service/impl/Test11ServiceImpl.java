package com.work.service.impl;

import com.work.entity.UserInfo;
import com.work.mapper1.Test1Mapper;
import com.work.service.ITest1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Test11ServiceImpl implements ITest1Service {

    @Autowired
    private Test1Mapper test1Mapper;

    @Transactional(transactionManager = "test1TransactionManager",rollbackFor = Exception.class)
    @Override
    public List<UserInfo> queryUserInfo(){
        return test1Mapper.queryUserInfo();
    }


}
