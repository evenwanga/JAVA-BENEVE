/**
 * @Title: AccountEntity.java
 * @Package: com.jeve.service.user.entity
 * @Description: 用户管理微服务项目数据结构
 * @Author: WangYiwen
 * @Date: 2016年8月13日 下午2:36:40
 */
package com.jeve.service.user.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jeve.service.user.entity.base.BaseEntity;

/**
 * @Title: AccountEntity
 * @Description: 账号实体结构
 * @Author: WangYiwen
 * @Date: 2016年8月13日 下午2:36:40
 */
@Entity
@Table(name = "user_account")
public class Account extends BaseEntity {

    // 账号名
    private String account;
    // 密码
    private String password;
    // 用户信息关联表
    private UserInfoRelation userInfoRelation;

}
