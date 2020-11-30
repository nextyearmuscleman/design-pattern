package jxl.study.dp.strategy.demo3.material;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class TomatoMaterial extends Material{
    private String egg;

    public TomatoMaterial(String material) {
        super(material);
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "TomatoMaterial{" +
                "egg='" + egg + '\'' +
                '}';
    }

    public TomatoMaterial(){}
}
