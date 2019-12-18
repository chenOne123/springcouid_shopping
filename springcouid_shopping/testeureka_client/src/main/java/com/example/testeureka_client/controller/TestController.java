package com.example.testeureka_client.controller;

import com.example.testeureka_client.consumer.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private TestFeign testFeign;
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    /**
     * @RequestParam 注解 设置请求参数名称
     */
    public String test(@RequestParam("name") String name){
        return "测试 eureka client 端口:"+port +" 请求参数："+name;
    }

    @GetMapping("/hi")
    public String hi(String name){
        String str = testFeign.sayHiFromClientOne(name);
        str +=" 调用成功";
        return str;
    }
}
