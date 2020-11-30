package jxl.study.dp.strategy.demo1;

/**
 * @author jixuelei
 * @date 2020/11/30
 */

/**
 * 充当Strtegy角色, 参考 java.util.Comparator接口
 * @param <T>
 */
@FunctionalInterface
public interface ComparatorStrategy<T> {

    int compare(T o1, T o2);
}
