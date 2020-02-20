package com.perfect.mall.mallauth.service.impl;

import com.perfect.mall.mallauth.mapper.UserMapper;
import com.perfect.mall.mallauth.rpc.VerifycodeRpc;
import com.perfect.mall.mallauth.service.UserService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VerifycodeRpc verifycodeRpc;

    @Override
    @GlobalTransactional
    public void index() {
        Map<String, Object> m = verifycodeRpc.getCode(1, "222");
        System.out.println(m);
    }
}
