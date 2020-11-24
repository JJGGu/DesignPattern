package com.xhr.designpattern.Factory;

// 简单工厂 不能算作一种设计模式，而是一种实现方式
public class SimpleFactory {
    // 根据不同的类型创建具体的实例
    Product getInstance(int type) {
        if (type == 1) {
            return new Product1();
        } else  if (type == 2) {
            return new Product2();
        } else {
            return null;
        }
    }
}

abstract class Product {
    abstract public void fun();
}
class Product1 extends Product {

    @Override
    public void fun() {
        System.out.println("product1");
    }
}
class Product2 extends Product {

    @Override
    public void fun() {
        System.out.println("product2");
    }
}