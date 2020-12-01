package jxl.study.dp.chainOfResp.demo1;

/**
 * @author jixuelei
 * @date 2020/12/1
 */
public class Staff extends Approver{

    int age;

    // 构造器
    public Staff(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void approve(int mount) {
        if (mount <= 1000) {
             System.out.println("审批通过。【员工：" + name + "】");
        } else {
              System.out.println("无权审批，升级处理。【员工：" + name + "】");
              this.nextApprover.approve(mount);
        }
    }
}


