package com.atguigu.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("5 - 3 = " + a.fun1(5, 3));
        System.out.println("8 + 2 = " + a.fun2(8, 2));
        //试想这样的一种情况，我们的B类无意间复写了我们A类的方法，这时候在调用A的类的方法，已经是调用了复写后的方法，但是开发人员可能还是以为调用了A了的方法，出现了问题
        B b = new B();
        System.out.println("9 + 1 = " + b.fun1(9, 1));
        //这个时候我们应该使用遵循里氏原则，将A和B之间的依赖关系减少，抽取更基础的类让两个基础，然后再重写自己的方法。
        //倘若这个时候我们还想要在B类中调用A类的方法应该怎么办呐？我们可以使用聚合，依赖，组合来解决问题，这里我们使用的是聚合（在B中建立一个A的实例）

    }
}

class Base {

}

class A extends Base {
    public int fun1(int a, int b) {
        return a - b;
    }

    public int fun2(int a, int b) {
        return a + b;
    }
}

class B extends Base {
    private A a = new A();//聚合对象

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}
