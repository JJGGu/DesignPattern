package com.xhr.designpattern.TemplateMethod;

// 具体处理template方法的子类
public class SubClassLibrary extends AbstractLibrary{
    protected void templateMethod() {
        System.out.println("templateMethod");
    }
}
