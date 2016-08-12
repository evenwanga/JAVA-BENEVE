/**
 * @Title: ConsumerController.java
 * @Package: com.jeve.service.sample02.controller
 * @Description: 模块的业务实现
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:18:31
 */
package com.jeve.service.sample02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeve.service.sample02.restapi.Sample01Client;

/**
 * @Title: ConsumerController
 * @Description: 计算器业务实现
 * @Author: WangYiwen
 * @Date: 2016年8月3日 下午8:18:31
 */
@RestController
public class ConsumerController {
    @Autowired
    Sample01Client sample01Client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return sample01Client.add(10, 20);
    }
}
