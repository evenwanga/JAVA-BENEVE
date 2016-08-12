/**
 * @Title: Application.java
 * @Package: com.jeve.server.config
 * @Description: 模块入口
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:30:28
 */
package com.jeve.server.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Title: Application
 * @Description: Config 服务器模块启动类
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:30:28
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

    /**
     * @Description: 模块启动方法：该模块需在联网状态下才能正常运行
     * @param args
     * @Author: WangYiwen
     * @Date: 2016年8月3日 下午8:30:28
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
