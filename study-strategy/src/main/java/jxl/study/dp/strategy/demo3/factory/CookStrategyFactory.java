package jxl.study.dp.strategy.demo3.factory;

import jxl.study.dp.strategy.demo3.strategy.CookStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
@Component
public class CookStrategyFactory {

    // spring bean支持使用List集合的方式获取到所有的实现类bean实例

    @Autowired
    List<CookStrategy> cookStrategyList;


    public CookStrategy getStrategy(String material) {
        for (CookStrategy strategy : cookStrategyList) {
            if (strategy.match(material)) {
                return strategy;
            }
        }
        throw new UnsupportedOperationException("不支持的材料: " + material);
    }
}
