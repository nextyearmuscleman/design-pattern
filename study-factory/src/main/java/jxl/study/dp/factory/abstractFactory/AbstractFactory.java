package jxl.study.dp.factory.abstractFactory;

/**
 * 抽象工厂里面生产抽象的产品， 一簇产品族
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();
}
