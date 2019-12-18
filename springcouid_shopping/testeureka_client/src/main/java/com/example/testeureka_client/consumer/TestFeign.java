package com.example.testeureka_client.consumer;

import com.example.testeureka_client.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-feign",fallback = SchedualServiceHiHystric.class)
public interface TestFeign {
    @GetMapping("/test/a")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
