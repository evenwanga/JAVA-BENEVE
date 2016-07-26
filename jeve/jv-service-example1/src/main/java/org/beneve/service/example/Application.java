/**
 * @Title: Application.java
 * @Package: org.beneve.service.example
 * @Description: 测试服务构建及各种功能的模块
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午10:48:35
 */
package org.beneve.service.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Title: Application
 * @Description: 用例服务入口
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午10:48:35
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    /**
     * @Description: 启动该子模块的方法(该项目必须在联网状态下使用)
     * @param args
     * @Author: WangYiwen
     * @Date: 2016年7月26日 上午10:48:35
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
