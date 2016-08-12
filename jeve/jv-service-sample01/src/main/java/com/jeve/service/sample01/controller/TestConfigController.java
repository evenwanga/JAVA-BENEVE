/**
 * @Title: ConfigController.java
 * @Package: com.jeve.service.sample01.controller
 * @Description: 用于存放模块的控制器方法，组装对外 API 服务
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:57:06
 */
package com.jeve.service.sample01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ConfigController
 * @Description: 测试统一配置服务器参数调用类
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:57:06
 */
@RefreshScope
@RestController
public class TestConfigController {
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }
}
