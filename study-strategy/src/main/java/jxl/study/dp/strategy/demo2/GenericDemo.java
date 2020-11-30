package jxl.study.dp.strategy.demo2;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class GenericDemo {

    public static void main(String[] args) {
        A a = new A();

        a.setAclass(GenericDemo.class);
        System.out.println(a.getAclass());
    }

    void sss(Class<?> aclass) {
    }
}


class A {
    Class<?> aclass;

    public Class<?> getAclass() {
        return aclass;
    }

    public void setAclass(Class<?> aclass) {
        this.aclass = aclass;
    }
}