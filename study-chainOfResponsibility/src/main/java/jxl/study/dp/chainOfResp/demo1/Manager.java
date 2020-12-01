package jxl.study.dp.chainOfResp.demo1;

/**
 * @author jixuelei
 * @date 2020/12/1
 */
public class Manager extends Approver{


    public Manager(String name) {
        super(name);
    }

    @Override
    public void approve(int mount) {
        if (mount <= 5000) {
            System.out.println("审批通过。【经理：" + name + "】");
        } else {
            System.out.println("无权审批，升级处理。【经理：" + name + "】");
            this.nextApprover.approve(mount);
        }
    }
}
