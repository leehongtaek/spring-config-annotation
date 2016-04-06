package me.wonwoo.bean;

/**
 * Created by wonwoo on 2016. 4. 6..
 */
public class BeanClass2 {

  private final BeanClass1 beanClass1;

  public BeanClass2(BeanClass1 beanClass1) {
    this.beanClass1 = beanClass1;
  }

  public String getName() {
    return beanClass1.getName() + "!!!!";
  }
}
