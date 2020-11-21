package com.xhr.designpattern.Observer;

import java.util.LinkedList;
import java.util.List;

// 观察者模式：多个观察者监听发布者调用的方法，当发布者调用方法后观察者做出响应
public class Publisher {
    // 存放观察者的list
    List<Observer> observerList = new LinkedList<Observer>();
    // 观察者的添加
    public void add(Observer observer) {
        observerList.add(observer);
    }
    // 观察者的删除
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update();
        }
    }
}
