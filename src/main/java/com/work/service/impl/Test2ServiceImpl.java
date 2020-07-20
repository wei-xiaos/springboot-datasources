package com.work.service.impl;

import com.work.entity.UserInfo;
import com.work.mapper2.Test2Mapper;
import com.work.service.ITest2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Test2ServiceImpl implements ITest2Service {

    @Autowired
    private Test2Mapper test2Mapper;


    @Transactional(transactionManager = "test2TransactionManager",rollbackFor = Exception.class)
    @Override
    public List<UserInfo> queryUserInfo(){
        return test2Mapper.queryUserInfo();
    }


}
