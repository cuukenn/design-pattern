package com.cgg.structpattern.decorate;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午9:45
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Beer implements Drink {
    @Override
    public long price() {
        return 500;
    }

    @Override
    public String name() {
        return "啤酒";
    }
}
