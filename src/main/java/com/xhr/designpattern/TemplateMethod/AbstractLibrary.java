package com.xhr.designpattern.TemplateMethod;

public abstract class AbstractLibrary {
    // 使用模板方法设计模式，提供一个骨架
    protected void run() {
        // 前面两部是稳定的，不需要改动的
        fun1();
        fun2();
        // 该函数是用户自定义的，具体的实现类需要继承该抽象类并实现该方法
        templateMethod();
    }
    public void fun1() {
        System.out.println("fun1 做一些调用该库的准备工作");
    }
    public void fun2() {
        System.out.println("fun2 继续做准备工作");
    }
    abstract protected void templateMethod();
}
