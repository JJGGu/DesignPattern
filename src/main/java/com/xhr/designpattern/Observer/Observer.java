package com.xhr.designpattern.Observer;

// 当需要添加不同的处理接受通知的Observer时，只需要增加Observer的实现类，并实现其中的方法即可
public interface Observer {
    // 收到通知以后进行更新
    void update();
}
