package com.cgg.createpattern.build;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午6:07
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Director {
    public static Compute constructCom(Builder builder) {
        builder.buildCpu();
        builder.buildAVG();
        builder.buildDisk();
        return builder.buildCompute();
    }
}
