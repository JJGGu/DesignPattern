package com.xhr.designpattern.Decorator;

// 装饰器模式主要是为了不改变原有类的情况下对功能进行扩展  符合开闭原则
interface Camera {
    // 基础功能,其他的类在该基础功能上进行拓展
    void takePhoto();
}

// 实现基础功能的类
class BaseCamera implements Camera{
    @Override
    public void takePhoto() {
        System.out.println("拍照");
    }
}

// 装饰类
abstract class CameraDecorator implements Camera{
    protected Camera camera;
    CameraDecorator(Camera camera) {
        this.camera = camera;
    }
}

// 具体的装饰类
class BeautifyCamera extends CameraDecorator{

    BeautifyCamera(Camera camera) {
        super(camera);
    }

    @Override
    public void takePhoto() {
        System.out.println("增加美颜效果");
        camera.takePhoto();
    }
}

class FilterCamera extends CameraDecorator {

    FilterCamera(Camera camera) {
        super(camera);
    }

    @Override
    public void takePhoto() {
        System.out.println("增加滤镜效果");
        camera.takePhoto();
    }
}
