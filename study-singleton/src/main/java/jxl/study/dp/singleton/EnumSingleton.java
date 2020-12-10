package jxl.study.dp.singleton;

/**
 * @author jixuelei
 * @date 2020/12/10
 */
public class EnumSingleton {


    /**
     * 枚举方式实现单例模式
     * 枚举学习：
     * 1- 枚举对象默认继承 java.lang.Enum
     * 2- 其属性默认是 public static final
     * 3- 其构造方法限制为private
     *
     * enum Type{
     *     A,B,
     *     ;
     * }
     * 等同于
     * enum Type extends Enum{
     *     public static final Type A;
     *     public static final Type B;
     * }
     * 其A，B表示是Type枚举类型的实例，不可使用new。
     */


    enum SingletonEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE {
            @Override
            public String getType() {
                return "";
            }
        };
        public void doSth() {
            System.out.println("....");
        }

        public abstract String getType();
    }


    public static void main(String[] args) {
        SingletonEnum.INSTANCE.doSth();
        SingletonEnum.INSTANCE.getType();
    }
}
