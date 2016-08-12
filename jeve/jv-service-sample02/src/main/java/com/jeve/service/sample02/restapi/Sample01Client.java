/**
 * @Title: ComputeClient.java
 * @Package: com.jeve.service.sample02.restapi
 * @Description: 服务调用类，为项目提供其他服务的调用
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:20:53
 */
package com.jeve.service.sample02.restapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeve.service.sample02.restapi.hystrix.Sample01ClientHystrix;

/**
 * @Title: ComputeClient
 * @Description: 调用 sample01-service 服务的接口
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:20:53
 */
@FeignClient(value = "sample01-service", fallback = Sample01ClientHystrix.class)
public interface Sample01Client {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
