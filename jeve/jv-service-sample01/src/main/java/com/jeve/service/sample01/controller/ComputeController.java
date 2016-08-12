/**
 * @Title: ComputeController.java
 * @Package: com.jeve.service.sample01.controller
 * @Description: 用于存放模块的控制器方法，组装对外 API 服务
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午5:52:03
 */
package com.jeve.service.sample01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ComputeController
 * @Description: 计算器实现类
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午5:52:03
 */
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        System.out.println("/add, host:" + instance.getHost() + ", service_id:"
                + instance.getServiceId() + ", result:" + r);
        return r;
    }

}
