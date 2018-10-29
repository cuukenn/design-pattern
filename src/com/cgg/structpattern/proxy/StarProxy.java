package com.cgg.structpattern.proxy;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午9:56
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class StarProxy implements Star {
    @Override
    public void seal() {
        new StarImp().seal();
    }
}
