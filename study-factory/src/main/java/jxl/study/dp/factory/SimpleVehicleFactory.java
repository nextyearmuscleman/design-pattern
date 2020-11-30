package jxl.study.dp.factory;


/**
 * 简单工厂的可扩展性不好， 若是新增交通工具，那么简单工厂需要修改。
 */
public class SimpleVehicleFactory {

    Car getCar() {
        return new Car();
    }

    Plane getPlane() {
        return new Plane();
    }
}
