/**
 * @Title: Application.java
 * @Package: com.jeve.server
 * @Description: 模块入口
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午5:03:04
 */
package com.jeve.server.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: Application
 * @Description: Eureka 服务器模块启动类
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午5:03:04
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    /**
     * @Description: 模块启动方法：该模块需在联网状态下才能正常运行
     * @param args
     * @Author: WangYiwen
     * @Date: 2016年8月3日 下午5:03:05
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
