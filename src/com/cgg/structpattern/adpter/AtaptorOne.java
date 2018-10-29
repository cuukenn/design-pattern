package com.cgg.structpattern.adpter;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午7:48
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class AtaptorOne extends Adaptee implements PlayMovie {

    @Override
    public void playAVI() {
        super.playMP4();
    }
}
