package jxl.study.dp.strategy.demo1;

/**
 * @author jixuelei
 * @date 2020/11/30
 */

/**
 * 充当策略模式中的Context角色， 引用策略接口
 * 实现排序功能
 */

public class SorterContext<T> {

    private ComparatorStrategy<T> strategy;

    public SorterContext(ComparatorStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public SorterContext (){}

    public void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1 ; j < arr.length; j++) {
                minPos = this.strategy.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }
    public void sort(T[] arr, ComparatorStrategy<T> strategy) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1 ; j < arr.length; j++) {
                minPos = strategy.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }


    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
