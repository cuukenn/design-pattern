package com.cgg.createpattern.factory.abstractf.factory;

import com.cgg.createpattern.factory.abstractf.product.AodiSedan;
import com.cgg.createpattern.factory.abstractf.product.AodiTrunck;
import com.cgg.createpattern.factory.abstractf.product.Sedan;
import com.cgg.createpattern.factory.abstractf.product.Trunck;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-26 下午2:29
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class AodiFactory implements Factory {
    @Override
    public Sedan produceSedan() {
        return new AodiSedan();
    }

    @Override
    public Trunck produceTrunck() {
        return new AodiTrunck();
    }
}
