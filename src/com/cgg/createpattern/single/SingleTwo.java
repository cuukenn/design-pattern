package com.cgg.createpattern.single;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午5:54
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class SingleTwo {
    private static SingleTwo ourInstance;

    public static SingleTwo getInstance() {
        if (SingleTwo.ourInstance == null) {
            synchronized (SingleTwo.class) {
                if (SingleTwo.ourInstance == null) {
                    SingleTwo.ourInstance = new SingleTwo();
                }
            }
        }
        return ourInstance;
    }

    private SingleTwo() {
    }
}
