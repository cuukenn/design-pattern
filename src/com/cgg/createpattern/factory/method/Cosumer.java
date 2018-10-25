package com.cgg.createpattern.factory.method;

import com.cgg.createpattern.factory.Car;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-25 下午10:41
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Cosumer {
    public static void main(String[] args) {
        Car car=null;
        car= new BWMCarFactory().produce();
        car.run();
        car= new AodiCarFactory().produce();
        car.run();
    }
}
