package com.example.feign_zy.consumer;

import com.example.feign_zy.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 这里使用Feign组件调用 服务
 * value：服务名称
 * fallback：熔断器策略
 */
@FeignClient(value = "EUREKACLIENT",fallback = SchedualServiceHiHystric.class)
public interface TestFeign {
    /**
     * json请求 使用post请求
     * @param name
     * @return
     */
    @GetMapping("/test")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
