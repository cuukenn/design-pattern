package com.cgg.structpattern.decorate;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午9:47
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Decorate implements Drink{
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public long price() {
        return drink.price();
    }

    @Override
    public String name() {
        return drink.name();
    }
}
