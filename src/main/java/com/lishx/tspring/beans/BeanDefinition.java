package com.lishx.tspring.beans;

import lombok.Data;

/**
 * BeanDefinition
 *
 * @author lishouxian
 * @since 2020/12/1 21:32
 */

@Data
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanName;


}
