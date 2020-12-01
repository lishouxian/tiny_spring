package com.lishx.tspring.beans.factory;

import com.lishx.tspring.beans.BeanDefinition;

import java.util.HashMap;

/**
 * AbstractBeanFactory 使用一个HashMap来存Bean的信息
 *
 * @author lishouxian
 * @since 2020/12/1 21:34
 */
public class AbstractBeanFactory implements BeanFactory{

    private HashMap<String, BeanDefinition> beanDefinitions ;

    public AbstractBeanFactory() {
        this.beanDefinitions = new HashMap<>();
    }

    @Override
    public Object getBean(String name){
        return beanDefinitions.get(name).getBean();
    }

    public void setBean(BeanDefinition beanDefinition){
        beanDefinitions.put(beanDefinition.getBeanName(),beanDefinition);
    }

}
