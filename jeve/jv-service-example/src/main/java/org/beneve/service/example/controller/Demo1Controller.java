/**
 * @Title: Demo1Controller.java
 * @Package: org.beneve.service.example.controller
 * @Description: 测试 Eureka 的服务
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午10:52:52
 */
package org.beneve.service.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: Demo1Controller
 * @Description: 测试 Eureka 服务调用
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午10:52:52
 */
@RestController
public class Demo1Controller {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {

        List<String> servicesList = client.getServices();
        for (String serviceId : servicesList) {
            List<ServiceInstance> instanceList = client.getInstances(serviceId);
            for (ServiceInstance instance : instanceList) {
            System.out.println("#######################################");
            System.out.println("ServiceId: " + instance.getServiceId());
            System.out.println("Host: " + instance.getHost());
            System.out.println("Port: " + instance.getPort());
            System.out.println("Uri: " + instance.getUri());
            System.out.println("Metadata: " + instance.getMetadata().toString());
            System.out.println("isHttps: " + instance.isSecure());
            }
        }

        ServiceInstance ThisInstance = client.getLocalServiceInstance();

        Integer r = a + b;
        System.out.println("/add, host:" + ThisInstance.getHost() + ", service_id:"
                + ThisInstance.getServiceId() + ", result:" + r);

        System.out.println("_____________________________________");
        return r;
    }
}
