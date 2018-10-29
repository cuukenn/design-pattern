package com.cgg.structpattern.adpter;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午7:47
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public interface PlayMovie {
    /**
     * 只有播放AVI的功能接口，适配器模式扩展播放MP4的功能
     */
    public void playAVI();
}
