package jxl.study.dp.strategy.demo1;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class Cat {
    private int age;

    public Cat(int age){this.age = age;}

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
