package jxl.study.dp.strategy.demo3.concreteStrategy;

import jxl.study.dp.strategy.demo3.MaterialEnum;
import jxl.study.dp.strategy.demo3.food.TomatoFood;
import jxl.study.dp.strategy.demo3.material.TomatoMaterial;
import jxl.study.dp.strategy.demo3.strategy.CookStrategy;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class CookTomatoStrategy implements CookStrategy<TomatoFood, TomatoMaterial> {

    @Override
    public TomatoFood cookie(TomatoMaterial material) {
        TomatoFood tomatoFood = new TomatoFood();
        tomatoFood.setName("西红柿炒蛋");
        tomatoFood.setColor("红的黄的绿的");
        return tomatoFood;
    }

    @Override
    public boolean match(String material) {
        return MaterialEnum.TOMATO.name().equals(material);
    }
}
