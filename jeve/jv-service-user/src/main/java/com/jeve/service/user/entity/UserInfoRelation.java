/**
 * @Title: UserInfo.java
 * @Package: com.jeve.service.user.entity
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: WangYiwen
 * @Date: 2016年8月15日 上午10:17:01
 */
package com.jeve.service.user.entity;

import com.jeve.service.user.entity.base.BaseEntity;

/**
 * @Title: UserInfo
 * @Description: TODO(用一句话描述类的作用)
 * @Author: WangYiwen
 * @Date: 2016年8月15日 上午10:17:01
 */
public class UserInfoRelation extends BaseEntity {
    // 对应账号实体（一对一）
    private Account account;
    // 对应用户信息（一对一）
    // private UserInfo userInfo;
    // 对应角色信息（一对多）

}
