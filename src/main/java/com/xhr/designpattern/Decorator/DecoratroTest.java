package com.xhr.designpattern.Decorator;

public class DecoratroTest {
    public static void main(String[] args) {
//        Camera camera = new BaseCamera();
//        camera.takePhoto();

//        Camera camera1 = new BeautifyCamera(new BaseCamera());
//        camera1.takePhoto();

        Camera camera2 = new FilterCamera(new BeautifyCamera(new BaseCamera()));
        camera2.takePhoto();
    }
}
