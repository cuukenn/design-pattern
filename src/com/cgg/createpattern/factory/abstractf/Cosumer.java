package com.cgg.createpattern.factory.abstractf;

import com.cgg.createpattern.factory.abstractf.factory.AodiFactory;
import com.cgg.createpattern.factory.abstractf.factory.BWMFactory;
import com.cgg.createpattern.factory.abstractf.product.Car;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-25 下午10:41
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Cosumer {
    public static void main(String[] args) {
        Car car = null;
        BWMFactory bwmFactory = new BWMFactory();
        AodiFactory aodiFactory = new AodiFactory();
        car = bwmFactory.produceSedan();
        car.run();

        car = bwmFactory.produceTrunck();
        car.run();

        car = aodiFactory.produceSedan();
        car.run();

        car = aodiFactory.produceTrunck();
        car.run();
    }
}
