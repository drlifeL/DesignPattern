package com.atguigu.principle.segregation;

/**
 * 接口隔离原则体现
 * 有接口interface1 其中有五个方法
 * 类C 和 类D都实现了interface1
 * 类A和类B 依赖于interface1 ，但类A使用了其中的123 方法
 * 类B使用了其中的145方法
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

class A { //A 类通过接口interface1 依赖（使用） B类，但是只会用到1、2、3方法。
    public void m1(inteface1 i) {
        i.operation1();
    }

    public void m2(inteface1 i) {
        i.operation2();
    }

    public void m3(inteface1 i) {
        i.operation3();
    }
}

class B {//B 类通过接口interface1 依赖（使用） B类，但是只会用到1、4、5方法。

    public void m1(inteface1 i) {
        i.operation1();
    }

    public void m4(inteface1 i) {
        i.operation4();
    }

    public void m5(inteface1 i) {
        i.operation5();
    }
}


class C implements inteface1 {

    @Override
    public void operation1() {
        System.out.println("c  operation1 run...");
    }

    @Override
    public void operation2() {
        System.out.println("c  operation2 run...");
    }

    @Override
    public void operation3() {
        System.out.println("c  operation3 run...");
    }

    @Override
    public void operation4() {
        System.out.println("c  operation4 run...");
    }

    @Override
    public void operation5() {
        System.out.println("c  operation5 run...");
    }
}

class D implements inteface1 {

    @Override
    public void operation1() {
        System.out.println("d  operation1 run...");
    }

    @Override
    public void operation2() {
        System.out.println("d  operation2 run...");
    }

    @Override
    public void operation3() {
        System.out.println("d  operation3 run...");
    }

    @Override
    public void operation4() {
        System.out.println("d  operation4 run...");
    }

    @Override
    public void operation5() {
        System.out.println("d  operation5 run...");
    }
}


interface inteface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}
