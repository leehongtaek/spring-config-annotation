package me.wonwoo.config;

import me.wonwoo.bean.BeanClass1;
import me.wonwoo.bean.BeanClass2;
import me.wonwoo.bean.BeanClass3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2016. 4. 6..
 */
@Configuration
public class SpringConfig {

  @Bean
  public BeanClass1 beanClass1() {
    return new BeanClass1();
  }

  @Bean
  public BeanClass2 beanClass2() {
    return new BeanClass2(beanClass1());
  }

  @Bean
  public BeanClass3 beanClass3(BeanClass1 beanClass1) {
    BeanClass3 beanClass3 = new BeanClass3();
    beanClass3.setBeanClass1(beanClass1);
    return beanClass3;
  }
}
