package jxl.study.dp.singleton;

/**
 * @author jixuelei
 * @date 2020/12/10
 */
public class ThreadLocalSingleton {

    /**
     * 通过ThreadLocal以空间换时间来保证单例，
     */
    private static final ThreadLocal<ThreadLocalSingleton> singleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getSingletonIns() {
        return singleton.get();
    }
}
