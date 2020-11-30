package jxl.study.dp.strategy.demo1;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class DogComparable implements Comparable<DogComparable>{

    int age;

    public DogComparable(int age) {this.age = age;};

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(DogComparable o) {
        if (this.getAge() < o.getAge()) return -1;
        else if (this.getAge() > o.getAge()) return 1;
        else return 0;
    }
}
