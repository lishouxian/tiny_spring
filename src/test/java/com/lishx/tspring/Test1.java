package com.lishx.tspring;

import com.lishx.tspring.beans.BeanDefinition;
import com.lishx.tspring.beans.factory.AbstractBeanFactory;
import com.lishx.tspring.beans.factory.BeanFactory;

/**
 * Test1
 *
 * @author lishouxian
 * @since 2020/12/1 21:37
 */
public class Test1 {
    public static void main(String[] args) {
        AbstractBeanFactory beanFactory = new AbstractBeanFactory();
        User user = new User("小白",12);
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBean(user);
        beanDefinition.setBeanClass(User.class);
        beanDefinition.setBeanName("User");
        beanFactory.setBean(beanDefinition);

        User user1 = (User) beanFactory.getBean("User");
        System.out.println(user1);

    }
}
