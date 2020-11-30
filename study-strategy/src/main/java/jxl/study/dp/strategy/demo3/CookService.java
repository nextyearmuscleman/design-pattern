package jxl.study.dp.strategy.demo3;

import jxl.study.dp.strategy.demo3.factory.CookStrategyFactory;
import jxl.study.dp.strategy.demo3.food.Food;
import jxl.study.dp.strategy.demo3.material.Material;
import jxl.study.dp.strategy.demo3.strategy.CookStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
@Service
public class CookService {

    @Autowired
    CookStrategyFactory strategyFactory;

    public void cook(Material material) {
        CookStrategy strategy = strategyFactory.getStrategy(material.getMainMaterial());

        Food food = strategy.cookie(material);
        System.out.println(food);

    }
}
