package com.xhr.designpattern.Proxy.DynamicProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface Subject {
    void fun1();
}

class ConcreteSubject implements Subject{

    @Override
    public void fun1() {
        // 以租房为例,这是房东
        System.out.println("我要出租房");
    }
}

// 使用JDK实现的动态代理
// 有缺点：必须要有
class DynamicProxyJDK implements InvocationHandler {
    // 代理对象
    Object obj;
    DynamicProxyJDK(Object obj) {
        this.obj = obj;
    }

    public Object getProxyObject(InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                invocationHandler);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(obj, args);
        after();
        return null;
    }
    // 定义环绕方法
    private void before() {
        System.out.println("租房之前");
    }
    private void after() {
        System.out.println("租房之后");
    }
}

// 使用JDK的方式实现动态代理必须要有一个接口，然后让被代理对象实现该接口才行
// 而使用CGLIB实现便不需要
// CGLIB主要是通过改变字节码的方法来实现动态代理,它是一个增强java语言的一个类库
class DynamicProxyCGLIB implements MethodInterceptor {
    // 代理对象
    Object obj;
    DynamicProxyCGLIB(Object obj) {
        this.obj = obj;
    }

    public Object getProxyObject(Object obj) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        method.invoke(obj, objects);
        after();
        return null;
    }
    // 定义环绕方法
    private void before() {
        System.out.println("租房之前");
    }
    private void after() {
        System.out.println("租房之后");
    }


}