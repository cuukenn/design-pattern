package com.cgg.createpattern.factory.method.factory;

import com.cgg.createpattern.factory.simple.product.BWMCar;
import com.cgg.createpattern.factory.simple.product.Car;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-25 下午11:06
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class BWMCarFactory implements CarFactory{
    @Override
    public Car produce() {
        return new BWMCar();
    }
}
