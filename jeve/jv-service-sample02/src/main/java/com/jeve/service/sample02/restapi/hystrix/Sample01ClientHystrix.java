/**
 * @Title: ComputeClientHystrix.java
 * @Package: com.jeve.service.sample02.restapi.hystrix
 * @Description: 用于调用服务失败后断路器功能实现
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:24:39
 */
package com.jeve.service.sample02.restapi.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeve.service.sample02.restapi.Sample01Client;

/**
 * @Title: ComputeClientHystrix
 * @Description: 计算器服务调用断路器
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:24:39
 */
@Component
public class Sample01ClientHystrix implements Sample01Client {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}
