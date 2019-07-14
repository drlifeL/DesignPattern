package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.roadRun("汽车");
        vehicle2.airRun("飞机");
        vehicle2.waterRun("轮船");
    }
}

/**
 * 方式3的分析
 * 1.这种修改方法没有对原来的类做大的修改，只是增加犯法
 * 2.这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责原则
 */
class Vehicle2 {
    public void roadRun(String vehicle) {
        System.out.println(vehicle + "在公路上运行！");
    }

    public void airRun(String vehicle) {
        System.out.println(vehicle + "在空中运行！");
    }

    public void waterRun(String vehicle) {
        System.out.println(vehicle + "在水中运行！");
    }


}
