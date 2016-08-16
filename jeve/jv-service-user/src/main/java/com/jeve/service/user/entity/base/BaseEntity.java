/**
 * @Title: BaseEntity.java
 * @Package: com.jeve.service.user.entity.base
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: WangYiwen
 * @Date: 2016年8月13日 下午2:43:54
 */
package com.jeve.service.user.entity.base;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

/**
 * @Title: BaseEntity
 * @Description: TODO(用一句话描述类的作用)
 * @Author: WangYiwen
 * @Date: 2016年8月13日 下午2:43:54
 */
public class BaseEntity {

    private Long id;

    /**
     * @return: id 这个是 Hibernate 的注解/生成32位UUID
     */
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    public Long getId() {
        return id;
    }


}
