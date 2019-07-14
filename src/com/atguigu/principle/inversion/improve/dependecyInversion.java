package com.atguigu.principle.inversion.improve;

/**
 * 方式二，通过接口来对实例进行抽象处理
 */
public class dependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.reveice(new Email());
        //新增一个微信
        person.reveice(new WeChat());
    }
}

class WeChat implements IReveice {

    @Override
    public String getInfo() {
        return "from Wechat Info!";
    }
}

interface IReveice {
    String getInfo();

}

class Email implements IReveice {
    public String getInfo() {
        return "hello,World!";
    }
}

class Person {
    public void reveice(IReveice reveice) {
        System.out.println(reveice.getInfo());
    }
}