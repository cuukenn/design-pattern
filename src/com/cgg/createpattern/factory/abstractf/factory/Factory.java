package com.cgg.createpattern.factory.abstractf.factory;

import com.cgg.createpattern.factory.abstractf.product.Sedan;
import com.cgg.createpattern.factory.abstractf.product.Trunck;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-26 下午2:28
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public interface Factory {
    public Sedan produceSedan();

    public Trunck produceTrunck();

}
