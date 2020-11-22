package com.xhr.designpattern.Proxy.DynamicProxy;

public class DynamicProxyJDKTest {
    public static void main(String[] args) {
        // JDK实现
//        DynamicProxyJDK dynamicProxyJDK = new DynamicProxyJDK(new ConcreteSubject());
//        Subject subject = (Subject) dynamicProxyJDK.getProxyObject(dynamicProxyJDK);
//        subject.fun1();

        // CGLIB实现
        ConcreteSubject concreteSubject = new ConcreteSubject();
        DynamicProxyCGLIB dynamicProxyCGLIB = new DynamicProxyCGLIB(concreteSubject);
        ConcreteSubject proxyObject = (ConcreteSubject) dynamicProxyCGLIB.getProxyObject(concreteSubject);
        proxyObject.fun1();
    }
}
