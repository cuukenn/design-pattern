package com.cgg.structpattern.decorate;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午9:49
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class QinDaoBeerDecorate extends Decorate {
    public QinDaoBeerDecorate(Drink drink) {
        super(drink);
    }

    @Override
    public long price() {
        return super.price() + 100;
    }

    @Override
    public String name() {
        return "青岛" + super.name();
    }
}
