package jxl.study.dp.chainOfResp.demo1;

/**
 * @author jixuelei
 * @date 2020/12/1
 */
public class MainTest {

    public static void main(String[] args) {
        Approver staff = new Staff("职员", 12);
        // 创建责任链
        staff.setNextApprover(new Manager("经理"))
                .setNextApprover(new CEO("CEO"));

        // pass
        //staff.approve(1000);

        //staff.approve(2000);

        staff.approve(9000);
    }
}
