package com.cgg.createpattern.build;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午5:57
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class ComputeBuilder implements Builder {
    private Compute compute;

    public ComputeBuilder() {
        this.compute = new Compute();
    }

    @Override
    public void buildCpu() {
        this.compute.setCpu("intel i5");
    }

    @Override
    public void buildAVG() {
        this.compute.setVga("gtx1080");
    }

    @Override
    public void buildDisk() {
        this.compute.setDisk("Sunsang 860evo");
    }

    @Override
    public Compute buildCompute() {
        return this.compute;
    }
}
