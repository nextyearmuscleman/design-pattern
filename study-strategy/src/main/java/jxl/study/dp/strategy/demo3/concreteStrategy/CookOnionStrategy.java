package jxl.study.dp.strategy.demo3.concreteStrategy;

import jxl.study.dp.strategy.demo3.MaterialEnum;
import jxl.study.dp.strategy.demo3.food.OnionFood;
import jxl.study.dp.strategy.demo3.material.OnionMaterial;
import jxl.study.dp.strategy.demo3.strategy.CookStrategy;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class CookOnionStrategy implements CookStrategy<OnionFood, OnionMaterial> {

    @Override
    public OnionFood cookie(OnionMaterial onionMaterial) {
        OnionFood onionFood = new OnionFood();
        onionFood.setSize("好大一碗");
        onionFood.setColor("乱七八糟的颜色");
        return onionFood;
    }

    @Override
    public boolean match(String material) {
        return MaterialEnum.ONION.name().equals(material);
    }
}
