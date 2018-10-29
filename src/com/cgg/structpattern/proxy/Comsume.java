package com.cgg.structpattern.proxy;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午9:57
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Comsume {
    public static void main(String[] args) {
        StarProxy starProxy = new StarProxy();
        starProxy.seal();
    }
}
