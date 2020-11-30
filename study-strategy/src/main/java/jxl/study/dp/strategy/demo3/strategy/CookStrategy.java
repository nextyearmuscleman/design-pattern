package jxl.study.dp.strategy.demo3.strategy;

import jxl.study.dp.strategy.demo3.food.Food;
import jxl.study.dp.strategy.demo3.material.Material;

/**
 * 策略接口类：strategy
 * @author jixuelei
 * @date 2020/11/30
 */
public interface CookStrategy<T extends Food, E extends Material> {

    /**
     * cookie方法， 原理e进去，返回food
     * @param e
     * @return
     */
    T cookie(E e);

    /**
     * 材料是否匹配
     * @param material
     * @return
     */
    boolean match(String material);
}
