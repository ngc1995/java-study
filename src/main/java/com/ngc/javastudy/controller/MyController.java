package com.ngc.javastudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.controller
 * @date 2020/3/2 2:54 下午
 */

@RestController
@RequestMapping("/")
public class MyController {

    @Value("${name}")
    private String name;

    @RequestMapping("show")
    public Object show(){
        return name;
    }
}
