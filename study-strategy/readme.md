
####  2020-11-30 策略模式学习
   * 策略模式属于行为型设计模式，主要用于将每个处理逻辑封装成独立的类。
   * 策略模式的组成角色: `Strategy / Context / ConcreteStrategy`
```java
// 抽象的策略角色
public interface Strategy {
    void doSomething();
}

// 具体策略角色
public class ConcreteStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("ConcreteStrategy doSomething !");
    }
}

// 上下文角色
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
``` 
> JDK和策略模式 
```
Comparator ---> Strategy角色 
 int compare(T o1, T o2);

Collections ---> Context角色
public static <T> void sort(List<T> list, Comparator<? super T> c) {
        list.sort(c);
    }

Comparatos.NaturalOrderComparator ---> ConcreteStrategy角色
```

* demo1 策略模式demo，使用策略模式进行比较Cat对象的顺序， CatAgeComparator

