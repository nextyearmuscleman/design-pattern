package jxl.study.dp.strategy.demo3.material;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class OnionMaterial extends Material{
    private String meat;

    public OnionMaterial(String material) {
        super(material);
    }
    public OnionMaterial() {}

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "OnionMaterial{" +
                "meat='" + meat + '\'' +
                '}';
    }
}
