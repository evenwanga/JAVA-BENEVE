/**
 * @Title: Appliction.java
 * @Package: com.jeve.service.sample01
 * @Description: 模块入口
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午5:37:08
 */
package com.jeve.service.sample02;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Title: Appliction
 * @Description: 示例服务02模块启动类
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午5:37:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Appliction {

    /**
     * @Description: 模块启动方法：该模块需在联网状态下才能正常运行
     * @param args
     * @Author: WangYiwen
     * @Date: 2016年8月3日 下午5:37:08
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Appliction.class).web(true).run(args);
    }

}
