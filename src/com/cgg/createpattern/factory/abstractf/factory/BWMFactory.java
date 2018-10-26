package com.cgg.createpattern.factory.abstractf.factory;

import com.cgg.createpattern.factory.abstractf.product.BWMSedan;
import com.cgg.createpattern.factory.abstractf.product.BWMTrunck;
import com.cgg.createpattern.factory.abstractf.product.Sedan;
import com.cgg.createpattern.factory.abstractf.product.Trunck;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-26 下午2:29
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class BWMFactory implements Factory {
    @Override
    public Sedan produceSedan() {
        return new BWMSedan();
    }

    @Override
    public Trunck produceTrunck() {
        return new BWMTrunck();
    }
}
