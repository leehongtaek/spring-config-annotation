package me.wonwoo.config;

import me.wonwoo.bean.BeanClass1;
import me.wonwoo.bean.BeanClass2;
import me.wonwoo.bean.BeanClass3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wonwoo on 2016. 4. 6..
 */
public class SpringConfigTest {

  @Test
  public void springXmlConfig() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-servlet.xml");
    BeanClass1 beanClass1 = context.getBean(BeanClass1.class);
    System.out.println(beanClass1.getName());
  }

  @Test
  public void springAnnotationConfig() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    BeanClass1 beanClass1 = context.getBean(BeanClass1.class);
    System.out.println(beanClass1.getName());
  }

  @Test
  public void springXmlConfig1() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-servlet.xml");
    BeanClass2 beanClass2 = context.getBean(BeanClass2.class);
    System.out.println(beanClass2.getName());
  }

  @Test
  public void springAnnotationConfig1() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    BeanClass2 BeanClass2 = context.getBean(BeanClass2.class);
    System.out.println(BeanClass2.getName());
  }

  @Test
  public void springXmlConfig2() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-servlet.xml");
    BeanClass3 beanClass3 = context.getBean(BeanClass3.class);
    System.out.println(beanClass3.getName());
  }

  @Test
  public void springAnnotationConfig2() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    BeanClass3 beanClass3 = context.getBean(BeanClass3.class);
    System.out.println(beanClass3.getName());
  }
}