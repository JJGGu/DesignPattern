package com.xhr.designpattern.Proxy.StaticProxy;

public interface subject {
    void fun1();
}
class ConcreteSubject implements subject{

    @Override
    public void fun1() {
        // 以租房为例,这是房东
        System.out.println("我要出租房");
    }
}

class SubjectProxy implements subject {
    ConcreteSubject concreteSubject;

    SubjectProxy(ConcreteSubject subjectProxy) {
        this.concreteSubject = subjectProxy;
    }
    @Override
    public void fun1() {
        before();
        concreteSubject.fun1();
        after();
    }

    // 代理类提供一些其他的额外操作
    private void before() {
        System.out.println("租房之前");
    }
    private void after() {
        System.out.println("租房之后");
    }
}