package com.lishx.tspring.beans.factory;

/**
 * BeanFactory 是一个可以获取bean的ioc容器
 *
 * @author lishouxian
 * @since 2020/12/1 21:27
 */
public interface BeanFactory {

    /**
     * 获取bean实例
     * @param name
     * @return
     * @throws Exception
     */
    Object getBean(String name);

}
