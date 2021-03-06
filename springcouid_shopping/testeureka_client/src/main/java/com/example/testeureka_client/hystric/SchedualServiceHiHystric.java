package com.example.testeureka_client.hystric;

import com.example.testeureka_client.consumer.TestFeign;
import org.springframework.stereotype.Component;

/**
 * 熔断器 ：当调用服务没有 成功时返回
 */
@Component
public class SchedualServiceHiHystric implements TestFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "还调用都死了你还调用，你发的参数："+name;
    }
}
