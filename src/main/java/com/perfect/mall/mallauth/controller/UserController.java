package com.perfect.mall.mallauth.controller;

import com.perfect.mall.mallauth.entity.User;
import com.perfect.mall.mallauth.service.UserService;
import com.perfect.mall.mallgeneric.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "用户模块")
@RestController
@RequestMapping(value = "/users")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户列表")
    @GetMapping
    public Result<User> index() {
        log.debug(msg("参数="));
        Result<User> rs = new Result<>();
        userService.index();
        return rs;
    }

}
