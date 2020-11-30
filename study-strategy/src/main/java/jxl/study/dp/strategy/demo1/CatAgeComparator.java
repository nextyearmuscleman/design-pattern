package jxl.study.dp.strategy.demo1;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class CatAgeComparator implements ComparatorStrategy<Cat>{

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() < o2.getAge()) return -1;
        else if (o1.getAge() > o2.getAge()) return 1;
        else return 0;
    }
}
