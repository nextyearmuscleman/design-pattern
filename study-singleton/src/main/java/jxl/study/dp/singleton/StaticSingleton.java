package jxl.study.dp.singleton;

/**
 * @author jixuelei
 * @date 2020/12/10
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用静态类实现单例模式
 * 使用内部类的好处是，静态内部类不会在单例加载时就加载，而是在调用getInstance()方法时才进行加载，
 * 达到了类似懒汉模式的效果，而这种方法又是线程安全的。
 */
public class StaticSingleton {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过反射的方式还是可以破坏静态内部类的单例方式

        StaticSingleton singleton = StaticSingleton.getSingleton();
        StaticSingleton singleton2 = StaticSingleton.getSingleton();
        Constructor<? extends StaticSingleton> constructor = singleton.getClass().getConstructor();
        constructor.setAccessible(true);
        StaticSingleton staticSingleton = constructor.newInstance();
        System.out.println(singleton == singleton2);

    }

    static class SingletonHolder {
        private static StaticSingleton singleton = new StaticSingleton();
    }

    public static StaticSingleton getSingleton() {
        return SingletonHolder.singleton;
    }
}
