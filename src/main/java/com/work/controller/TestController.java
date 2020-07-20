package com.work.controller;

import com.work.entity.UserInfo;
import com.work.service.ITest1Service;
import com.work.service.ITest2Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private ITest1Service test1Service;

    @Autowired
    private ITest2Service test2Service;

    @RequestMapping("/queryUserInfo1")
    public List<UserInfo> queryUserInfo1(){
        return test1Service.queryUserInfo();
    }
    @RequestMapping("/queryUserInfo2")
    public List<UserInfo> queryUserInfo2(){
        return test2Service.queryUserInfo();
    }

}
