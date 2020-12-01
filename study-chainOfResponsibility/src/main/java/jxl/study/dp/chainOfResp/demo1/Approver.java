package jxl.study.dp.chainOfResp.demo1;

/**
 * @author jixuelei
 * @date 2020/12/1
 */

// 审批角色抽象类
public abstract class Approver {

    protected String name;
    protected Approver nextApprover; // 当前审批对象持有的下一级审批对象引用

    public Approver(String name) {
        this.name = name;
    }

    protected Approver setNextApprover(Approver next) {
        this.nextApprover = next;
        return this.nextApprover;
    }

    /**
     * 审批角色的审批方法
     * @param mount
     */
    public abstract void approve(int mount);
}
