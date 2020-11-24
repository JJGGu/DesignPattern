package com.xhr.designpattern.Factory;

abstract class FactoryMethod {
    abstract Product getInstance();
}

// Product 使用的还是SimpleFactory中的结构
// 工厂方法模式与简单工厂区别在于，对于每一种Product工厂方法模式都要有自己的一个工厂创建具体的Product，便于扩展
class Product1FactoryMethod extends FactoryMethod{

    @Override
    Product getInstance() {
        return new Product1();
    }
}
class Product2FactoryMethod extends FactoryMethod{

    @Override
    Product getInstance() {
        return new Product2();
    }
}
