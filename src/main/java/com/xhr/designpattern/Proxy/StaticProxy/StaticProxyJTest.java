package com.xhr.designpattern.Proxy.StaticProxy;

import java.util.concurrent.CopyOnWriteArrayList;

public class StaticProxyJTest {
    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy(new ConcreteSubject());
        subjectProxy.fun1();
    }
}
