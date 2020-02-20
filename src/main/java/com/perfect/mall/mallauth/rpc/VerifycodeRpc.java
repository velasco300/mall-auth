package com.perfect.mall.mallauth.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "mall-sys")
public interface VerifycodeRpc {

    @GetMapping(value = "/verifycodes/receiver")
    public Map<String, Object> getCode(@RequestParam("codeType") Integer codeType, @RequestParam("receiver") String receiver);

}
