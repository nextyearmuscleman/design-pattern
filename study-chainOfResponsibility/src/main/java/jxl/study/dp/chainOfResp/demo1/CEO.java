package jxl.study.dp.chainOfResp.demo1;

/**
 * @author jixuelei
 * @date 2020/12/1
 */
public class CEO extends Approver{

    public CEO(String name) {
        super(name);
    }

    @Override
    public void approve(int mount) {
        if (mount <= 10000) {
            System.out.println("审批通过。【CEO：" + name + "】");
        } else {
            System.out.println("驳回申请。【CEO：" + name + "】");
        }
    }
}
