package com.example.springboot.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int suma(int number) {
        return number + 1;
    }
}
