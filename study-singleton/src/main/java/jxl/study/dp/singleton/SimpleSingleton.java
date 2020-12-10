package jxl.study.dp.singleton;

/**
 * @author jixuelei
 * @date 2020/12/10
 */
public class SimpleSingleton {

    public SimpleSingleton(){}

    //1- 饿汉式，不管是否使用先创建。 此种方式是有类加载方式保证线程安全
//    private static SimpleSingleton singleton = new SimpleSingleton();

//    public static SimpleSingleton getSingleton() {
//        return singleton;
//    }

    // 2- 懒汉式- 使用时在创建
    private static SimpleSingleton singleton = null;

    public static synchronized SimpleSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }
}
