package com.example.springboot;

import com.example.springboot.bean.MyBean;
import com.example.springboot.bean.MyBeanWithDependencyImplement;
import com.example.springboot.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoApplication implements CommandLineRunner {

  private ComponentDependency componentDependency;
  private MyBean myBean;
  private MyBeanWithDependencyImplement myBeanWithDependencyImplement;

  public HolaMundoApplication(
          @Qualifier("componentTwoImplement") ComponentDependency componentDependency,
          MyBean myBean,
          MyBeanWithDependencyImplement myBeanWithDependencyImplement
  ) {
    this.componentDependency = componentDependency;
    this.myBean = myBean;
    this.myBeanWithDependencyImplement = myBeanWithDependencyImplement;

  }

  public static void main(String[] args) {
    SpringApplication.run(HolaMundoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    componentDependency.saludar();
    myBean.print();
    myBeanWithDependencyImplement.printWithDependency();
  }
}
