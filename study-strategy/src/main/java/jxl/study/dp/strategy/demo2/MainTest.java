package jxl.study.dp.strategy.demo2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jixuelei
 * @date 2020/11/30
 */
public class MainTest {


    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();

        list.add(new Cat(9));
        list.add(new Cat(2));
        list.add(new Cat(1));

        /**
         * static <T extends Comparable<? super T>> void sort(List<T> list) {
         *         list.sort(null);
         *     }
         *  使用sort()方法，其T必须实现 Comparable接口方法，自行实现比较。不然编译不会通过
         */

        Collections.sort(list);

        /**
         * 看到了sort方法，顺带着学习下泛型方法。link(https://www.cnblogs.com/coprince/p/8603492.html)
         * 1- 参考t1()方法编译之后程序会采取去泛型化的措施。也就是说Java中的泛型，只在编译阶段有效。在编译过程中，
         *      正确检验泛型结果后，会将泛型的相关信息擦出，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。
         *      也就是说，泛型信息不会进入到运行时阶段
         * 2- t2():泛型上下边界 【上界通配符主要用于读数据，下界通配符主要用于写数据】
         *      2.1- <? extends T> ?类型必须是T类型orT类型的子类
         *          上边界表示是Tor其子类，使用set方式会有危险，不确定传入的类型是否共存，但是可以getter可以拿到T的引用。
         *      2.2- <? super T> ?类型必须是T类型orT类型的父类
         *          下边界 使用setter是没有问题的，传入的类型只要是Tor父类都是可以的，但是getter不确定返回的是什么类型。
         *
         * 3- 泛型类 / 泛型接口 / 泛型方法： 指的是在实例化or实现接口or调用方法时需要明确的指定参数类型（参数化类型）
         *
         * 4- 泛型通配符的意思：
         *      4.1-    ？ 表示不确定的 java 类型
         *      4.2-    T (type) 表示具体的一个java类型
         *      4.3-    K V (key value) 分别代表java键值中的Key Value
         *      4.4-    E (element) 代表Element
         *
         *  5- T具体的类型参数仅可以使用超类限定 <T extends A>， 通配符？可以使用 <? extends A> / <? super A>
         *      5.1- ? 使用时可以不需要将类声明成泛型类or将方法声明成泛型方法。 表示可以接收任意类型
         */
    }



    public void t2(List<? super Integer> list) {

        list.add(new Integer(1)); // setter方法是可以的
        //Integer object = list.get(0); // ？表示 大于等于Integer， 强转成Integer会报错，可以类型比Integer更宽
        Object o = list.get(0); // 仅可以转化成Object类型
    }

    public void t3(List<? extends Number> list) {
        Number number = list.get(0); // getter方法可以获取一个Numer类型指向其对象引用
//        list.add(new Integer(1)); // setter方法报错， 不确定是Number的哪个类，
    }


    @Test
    public void t1() {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        Class<? extends List> stringListClass = stringList.getClass();
        Class<? extends List> integerListClass = integerList.getClass();

        if (stringListClass.equals(integerListClass)) {
            System.out.println("same result"); // pass
        }
    }


    /**
     * 泛型类
     * @param <T>
     */
    class Generic<T extends Number> {
        T type;

        /**
         * 成员方法，非泛型方法
         * @return
         */
        public T getType() {
            return type;
        }

        /**
         * 泛型方法
         * @param type
         * @param <T>
         */
        public <T> void doSth(T type){
            System.out.println(type);
        }

    }

    /**
     * 泛型接口
     */
    interface Generator<T> {
        public T next();
    }
}
