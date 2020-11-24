package com.xhr.designpattern.Factory;

public class FactoryTest {
    public static void main(String[] args) {
        // 简单工厂
//        SimpleFactory simpleFactory = new SimpleFactory();
//        Product product1 = simpleFactory.getInstance(1);
//        product1.fun();
//        Product product2 = simpleFactory.getInstance(2);
//        product2.fun();

        // 工厂方法模式
        FactoryMethod factoryMethod = new Product1FactoryMethod();
        Product product1 = factoryMethod.getInstance();
        product1.fun();

    }
}
