package com.example.springboot.configuration;

import com.example.springboot.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
  @Bean
  public MyBean beanOperation() {
    return new MyBean2Implement();
  }

  @Bean
  public MyOperation beanOperationOperation() {
    return new MyOperationImplement();
  }

  @Bean
  public MyBeanWithDependencyImplement beanOperationOperationWhiteDependency(MyOperation myOperation) {
    return new MyBeanWithDependencyImplement(myOperation);
  }
}
