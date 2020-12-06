package jxl.study.dp.protorype;

import jxl.study.dp.protorype.deep.DeepField;
import jxl.study.dp.protorype.deep.DeepPrototype;

/**
 * @author jixuelei
 * @date 2020/12/4
 */
public class Client {

    public static void main(String[] args) {
//        ResumeDemo resumeDemo = new ResumeDemo("mr.Wang");
//
//        System.out.println(resumeDemo);
//        System.out.println("开始clone");
//
//        // 构造方法中睡眠5s， 模拟创建大对象的时间慢， 使用clone方法在内存中进行二进制拷贝，很快
//        ResumeDemo clone = resumeDemo.clone();
//        System.out.println(clone);

        DeepField deepField = new DeepField("Mr.WANG", "class1");
        DeepPrototype deepPrototype = new DeepPrototype(deepField, "Mr.wang");

        DeepPrototype clone = deepPrototype.clone();

        System.out.println(deepPrototype);
        System.out.println(clone);
        deepField.setCloneName("Mr.JI");
        System.out.println(deepPrototype);
        System.out.println(clone);
    }
}
