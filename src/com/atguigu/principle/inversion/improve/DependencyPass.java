package com.atguigu.principle.inversion.improve;

/**
 * 演示依赖倒置的三种方式
 *  1.接口依赖
 *  2.构造方法依赖
 *  3.set方法依赖
 */
public class DependencyPass {
    public static void main(String[] args) {
        Changhong changhong = new Changhong();
        //方式1  接口依赖
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changhong);
        //方式2
//        OpenAndClose openAndClose = new OpenAndClose(changhong);
//        openAndClose.open();
        //方式3
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changhong);
        openAndClose.open();

    }
}

//方式一：通过接口传递实现依赖
//开关的接口
//interface IopenAndClose {
//    void open(ITV tv);
//
//}
//
//interface ITV {//ITV接口
//
//    void play();
//}
//class OpenAndClose implements IopenAndClose {
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}
class Changhong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机打开了");
    }
}

//方式二，通过构造方法传递
//interface IopenAndClose {
//    void open();
//
//}
//
//interface ITV {//ITV接口
//
//    void play();
//}
//
//class OpenAndClose implements IopenAndClose {
//    public ITV tv;
//
//    public void open() {
//        this.tv.play();
//    }
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//}

interface IopenAndClose {
    void open();

}

interface ITV {//ITV接口

    void play();
}

class OpenAndClose implements IopenAndClose {
    public ITV tv;

    public void open() {
        this.tv.play();
    }

    public void setTv(ITV tv) {
        this.tv = tv;
    }
}



