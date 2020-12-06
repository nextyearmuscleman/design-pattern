package jxl.study.dp.protorype;


import java.util.concurrent.TimeUnit;

/**
 * 简历-- ConcretePrototype角色
 * @author jixuelei
 * @date 2020/12/4
 */
public class ResumeDemo implements Cloneable {
    private String name;
    private int age;


    public ResumeDemo(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    @Override
    protected ResumeDemo clone() {

        ResumeDemo resumeDemo = null;
        try {
            resumeDemo = (ResumeDemo) super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return resumeDemo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
