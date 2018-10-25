package com.cgg.createpattern.factory.simple;

import com.cgg.createpattern.factory.AodiCar;
import com.cgg.createpattern.factory.BWMCar;
import com.cgg.createpattern.factory.Car;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-25 下午10:39
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class CarFactory {
    public static Car produce(String type){
        switch (type){
            case "宝马":return new BWMCar();
            case "大众":return new AodiCar();
            default:return null;
        }
    }
}
