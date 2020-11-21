package com.xhr.designpattern.TemplateMethod;

public class MainClass {
    public static void main(String[] args) {
        // 未使用模板方法
//        Library library = new Library();
//        library.fun1();
//        library.fun2();
        // 下面还有需要自定义实现的部分
        // library.fun3(); 对应templateMethod

        // 使用模板方法设计模式
        AbstractLibrary lib = new SubClassLibrary();
        // 直接调用run（骨架）
        lib.run();
    }
}
