package com.example.springboot.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

  private MyOperation myOperation;

  public MyBeanWithDependencyImplement(MyOperation myOperation) {
    this.myOperation = myOperation;
  }

  @Override
  public void printWithDependency() {
    System.out.println("Hola desde mi implementacion propia de bean con dependencia");
    int numero = 1;
    System.out.println(myOperation.suma(numero));
  }
}
