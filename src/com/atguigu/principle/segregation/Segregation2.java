package com.atguigu.principle.segregation;

public class Segregation2 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.m1(new C1());
        a1.m4(new C1());
        a1.m5(new C1());

        B1 b1 = new B1();
        b1.m1(new D1());
        b1.m2(new D1());
        b1.m3(new D1());

    }
}

class A1 { //A 类通过接口interface1 依赖（使用） C类，但是只会用到1、4、5方法。
    public void m1(Interface1 i) {
        i.operation1();
    }

    public void m4(Interface3 i) {
        i.operation4();
    }

    public void m5(Interface3 i) {
        i.operation5();
    }
}

class B1 { // B类通过接口interface 依赖（使用）  D类，只使用1、2、3方法

    public void m1(Interface1 i) {
        i.operation1();
    }

    public void m2(Interface2 i) {
        i.operation2();
    }

    public void m3(Interface2 i) {
        i.operation3();
    }
}


class C1 implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("c  operation1 run...");
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

class D1 implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("D1  operation1 run...");
    }

    @Override
    public void operation2() {
        System.out.println("D1  operation2 run...");
    }

    @Override
    public void operation3() {
        System.out.println("D1  operation3 run...");
    }
}


interface Interface1 {
    void operation1();

}

interface Interface2 {
    void operation2();

    void operation3();

}

interface Interface3 {
    void operation4();

    void operation5();

}