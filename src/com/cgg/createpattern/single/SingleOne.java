package com.cgg.createpattern.single;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午5:54
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class SingleOne {
    private static SingleOne ourInstance = new SingleOne();

    public static SingleOne getInstance() {
        return ourInstance;
    }

    private SingleOne() {
    }
}
