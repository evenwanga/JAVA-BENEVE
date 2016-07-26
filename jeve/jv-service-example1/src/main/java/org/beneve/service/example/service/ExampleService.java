/**
 * @Title: ExampleService.java
 * @Package: org.beneve.service.example.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午11:38:33
 */
package org.beneve.service.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: ExampleService
 * @Description: TODO(用一句话描述类的作用)
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午11:38:33
 */
@FeignClient("example-service")
public interface ExampleService {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
