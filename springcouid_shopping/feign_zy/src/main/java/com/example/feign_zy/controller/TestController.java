package com.example.feign_zy.controller;

import com.example.feign_zy.consumer.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/a")
    public String saTest(@RequestParam("name") String name){
        return  "端口:"+port+"参数"+name;
    }

}
