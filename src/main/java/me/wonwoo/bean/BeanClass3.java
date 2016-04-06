package me.wonwoo.bean;

/**
 * Created by wonwoo on 2016. 4. 6..
 */
public class BeanClass3 {

  private BeanClass1 beanClass1;

  public void setBeanClass1(BeanClass1 beanClass1) {
    this.beanClass1 = beanClass1;
  }

  public String getName() {
    return beanClass1.getName() + ". my name is wonwoo!";
  }
}
