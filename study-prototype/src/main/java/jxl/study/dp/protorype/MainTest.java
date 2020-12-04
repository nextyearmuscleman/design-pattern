package jxl.study.dp.protorype;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jixuelei
 * @date 2020/12/2
 */
public class MainTest {

    @Test
    public void t1() {
        AtomicInteger retryTime = new AtomicInteger(0);
        while (retryTime.getAndIncrement() < 3) {
            System.out.println("retry第" + retryTime + "次");
        }

    }
}
