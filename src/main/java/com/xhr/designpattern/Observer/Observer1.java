package com.xhr.designpattern.Observer;

// 具体的Observer
public class Observer1 implements Observer{
    public void update() {
        System.out.println("我是observer1 我收到通知了");
    }
}
