package com.xhr.designpattern.Strategy;

public class Main {
    public static void main(String[] args) {
        MilkTea milkTea = new NormalMilkTea(new NormalMake());
        milkTea.make();
        milkTea.setMakable(new AdvanceMake());
        milkTea.make();
    }
}
// 策略模式：用于算法簇（相同的算法名称，但是具体实现不同），不同的对象使用的是不同的算法
// 这里以制作奶茶为例
// 有不同的奶茶
abstract class MilkTea {
    Makable makable;
    public MilkTea(Makable makable) {
        this.makable = makable;
    }
    public void setMakable(Makable makable) {
        this.makable = makable;
    }
    abstract void make();
}
// 普通奶茶
class NormalMilkTea extends MilkTea {

    public NormalMilkTea(Makable makable) {
        super(makable);
    }
    void make() {
        makable.make();
    }
}
// 高级奶茶
class AdvanceMilkTea extends MilkTea {

    public AdvanceMilkTea(Makable makable) {
        super(makable);
    }

    void make() {
        makable.make();
    }
}


// 制作方法
interface Makable {
    // 不同的制作方法都需要重写该函数
    void make();
}

// 普通奶茶的制作方法
class NormalMake implements Makable{
    public void make() {
        System.out.println("我是普通奶茶的制作方法");
    }
}
// 高级奶茶
class AdvanceMake implements Makable {

    public void make() {
        System.out.println("我是高级奶茶的制作方法");
    }
}

