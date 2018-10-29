package com.cgg.createpattern.build;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午5:57
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Compute {
    private String cpu;
    private String vga;
    private String disk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Compute{" +
                "cpu='" + cpu + '\'' +
                ", vga='" + vga + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
