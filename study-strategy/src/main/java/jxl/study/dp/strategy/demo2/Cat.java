package jxl.study.dp.strategy.demo2;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class Cat implements Comparable<Cat>{
    int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}
