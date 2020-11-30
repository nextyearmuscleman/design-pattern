package jxl.study.dp.strategy.demo3.food;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class OnionFood extends Food{
    private String size;

    public OnionFood(String color) {
        super(color);
    }

    public OnionFood(){};

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "OnionFood{" +
                "size='" + size + '\'' +
                '}';
    }
}
