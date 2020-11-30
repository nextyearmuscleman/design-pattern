package jxl.study.dp.strategy.demo3.food;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class TomatoFood extends Food{
    private String name;

    public TomatoFood(String color) {
        super(color);
    }
    public TomatoFood() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TomatoFood{" +
                "name='" + name + '\'' +
                '}';
    }
}
