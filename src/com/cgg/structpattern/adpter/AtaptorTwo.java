package com.cgg.structpattern.adpter;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午7:48
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class AtaptorTwo implements PlayMovie {
    private Adaptee adaptee;

    public AtaptorTwo() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void playAVI() {
        this.adaptee.playMP4();
    }
}
