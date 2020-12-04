package jxl.study.dp.protorype;

/**
 * 简历-- Prototype角色
 * @author jixuelei
 * @date 2020/12/4
 */
public class ResumeDemo implements Cloneable{
    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;

    public ResumeDemo(String name) {
        this.name = name;
    }

    @Override
    public ResumeDemo clone() {
        ResumeDemo resume = null;
        try {
            resume = (ResumeDemo) super.clone();
        }catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return resume;
    }

    public void setPersonInfo(String birthday, String sex, String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }
}
