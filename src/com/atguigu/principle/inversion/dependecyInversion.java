package com.atguigu.principle.inversion;

public class dependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.reveice(new Email());
    }
}

class Email {
    public String getInfo() {
        return "hello,World!";
    }
}

//完成Person接收信息的功能
/*
   方式1分析
   1.简单，比较容易想到
   2.但是如果我们获取信息的对象是微信，短信等等，则需要新增类，同时Person类也要新增相应的接收方法
   3.解决思路：引入一个抽象的接口IReceiver .表示接收者，这样person类和接口IReceiver就有了依赖关系
      其他的类只需要实现这个接口就可以，这样我们就不可以不用在修改源代码了。
 */
class Person{
    public void reveice(Email email){
        System.out.println(email.getInfo());
    }
}