package jxl.study.dp.protorype.deep;

import jxl.study.dp.protorype.ResumeDemo;

import java.io.*;

public class DeepPrototype implements Cloneable, Serializable {

    DeepField deepField; // 引用类型，浅拷贝只会拷贝原有对象持有的引用，也就是ResumeDemo对象的内存地址
    String name;

    public DeepPrototype(DeepField deepField, String name) {
        this.deepField = deepField;
        this.name = name;
    }



    /**
     * 深拷贝方式： clone方法
     */
    @Override
    public DeepPrototype clone()  {
        DeepPrototype cloneObject = null;
        try {
            // 此处的clone仅完成原有对象中基础数据类型和String的拷贝
            cloneObject = (DeepPrototype) super.clone();

            // 对引用类型的属性，进行单独处理
            cloneObject.deepField = (DeepField) deepField.clone();
        }catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return cloneObject;
    }

    /**
     * 深拷贝方式2 ：序列化
     */
    public Object deepCLone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化 对象>>>内存
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();


            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }




    @Override
    public String toString() {
        return "DeepPrototype{" +
                "deepField=" + deepField +
                ", name='" + name + '\'' +
                '}';
    }
}
