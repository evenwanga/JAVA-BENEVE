/**
 * @Title: Application.java
 * @Package: com.jeve.service.user
 * @Description: 用户管理微服务项目入口
 * @Author: WangYiwen
 * @Date: 2016年8月13日 下午2:31:44
 */
package com.jeve.service.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Title: Application
 * @Description: 用户管理微服务启动类
 * @Author: WangYiwen
 * @Date: 2016年8月13日 下午2:31:44
 */
@SpringBootApplication
public class Application {

    /**
     * @Description: 模块启动方法：该模块需在联网状态下才能正常运行
     * @param args
     * @Author: WangYiwen
     * @Date: 2016年8月13日 下午2:31:44
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
