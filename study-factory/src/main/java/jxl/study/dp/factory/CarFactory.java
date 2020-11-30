package jxl.study.dp.factory;


/**
 * 每个交通工具都需要新建一个工厂，专门生产对象
 */
public class CarFactory {

    Car getCar() {
        System.out.println("start create a new Car");
        return new Car();
    }
}
