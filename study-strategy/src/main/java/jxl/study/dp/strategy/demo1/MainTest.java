package jxl.study.dp.strategy.demo1;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class MainTest {

    public static void main(String[] args) {
        Cat[] cats = {new Cat(5), new Cat(3), new Cat(1)};

        // 1- 创建具体的策略模式
        ComparatorStrategy<Cat> strategy = new CatAgeComparator();
        // 2- 创建Context， 将具体的策略模式作为参数传递进去
        // SorterContext<Cat> sorterContext = new SorterContext<>(strategy);
        // sorterContext.sort(cats);

        // 简单的具体策略， 作为参数使用lambda进行使用， 负责的使用上面的方式，封装成一个处理逻辑类，作为参数传递
        SorterContext<Cat> sorterContext = new SorterContext<>();
        sorterContext.sort(cats, (o1, o2) -> {
            if (o1.getAge() < o2.getAge()) return -1;
            else if (o1.getAge() > o2.getAge()) return 1;
            else return 0;
        });
        System.out.println(Arrays.asList(cats));


        //-------------------------- 使用Comparable接口实现比较排序
        DogComparable[] dogs = {new DogComparable(3), new DogComparable(1)};

        /**
         * [java.util.]Comparator可以在不修改原有实体类的基础上通过实现Comparator接口新建比较器实现比较的功能，实现扩展功能，（开闭原则）
         * [java.lang]Comparable对代码有侵入性，若新建的对象一开始就有排序的需求，可以在创建对象时就去实现该接口，
         *
         * 调用: Collections.sort(List<T> arg1); 使用对象自身的比较规则
         *      Collections.sort(List<T> arg1, Comparator<? super T> c);
         */

    }
}
