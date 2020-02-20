package com.perfect.mall.mallauth.controller;

import com.perfect.mall.mallgeneric.utils.ThreadParam;

public class BaseController {

    protected String msg(String msg) {
        return ThreadParam.logMsg(msg);
    }

}
