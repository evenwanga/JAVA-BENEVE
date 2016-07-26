/**
 * @Title: Application.java
 * @Package: org.beneve.server.cloud
 * @Description: Spring Cloud 服务器
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午10:36:20
 */
package org.beneve.server.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: Application
 * @Description: Cloud 服务管理器入口
 * @Author: WangYiwen
 * @Date: 2016年7月26日 上午10:36:20
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    /**
     * @Description: 启动该子模块的方法(该项目必须在联网状态下使用)
     * @param args
     * @Author: WangYiwen
     * @Date: 2016年7月26日 上午10:36:20
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
