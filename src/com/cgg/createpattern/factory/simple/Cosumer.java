package com.cgg.createpattern.factory.simple;

import com.cgg.createpattern.factory.simple.factory.CarFactory;
import com.cgg.createpattern.factory.simple.product.Car;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-25 下午10:41
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Cosumer {
    public static void main(String[] args) {
        Car car=null;
        car= CarFactory.produce("宝马");
        car.run();
        car=CarFactory.produce("大众");
        car.run();
    }
}
