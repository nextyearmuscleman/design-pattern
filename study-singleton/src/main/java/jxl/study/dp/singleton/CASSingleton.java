package jxl.study.dp.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author jixuelei
 * @date 2020/12/10
 */
public class CASSingleton {
    /** 利用AtomicReference */
    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<>();

    // 私有化constructor
    private CASSingleton() {}

    /**
     * 用CAS确保线程安全
     */
    public static CASSingleton getInstance() {
        for (;;){
            CASSingleton singleton = INSTANCE.get();
            if (singleton != null) {
                return singleton;
            }
            singleton = new CASSingleton();
            // INSTANCE和null比较，第一次null == null， 因此将singleton赋值给INSTANCE
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }

    public static void main(String[] args) {
        CASSingleton.getInstance();
    }
}
