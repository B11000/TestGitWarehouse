package com.itheima.pojo.class1;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 15:49:48
 */
public class computer {

    private int band;
    private int size;
    private String color;
    private String cpu;
    private String Gpu;

    public computer() {
        this.band = band;
        this.size = size;
        this.color = color;
        this.cpu = cpu;
        this.Gpu = Gpu;
    }

    public computer(int band, int size, String color, String cpu, String gpu) {
        this.band = band;
        this.size = size;
        this.color = color;
        this.cpu = cpu;
        this.Gpu = gpu;
    }


    public void pri(){
    System.out.println("123");

}



    @Override
    public String toString() {
        return "computer{" +
                "band=" + band +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", cpu='" + cpu + '\'' +
                ", Gpu='" + Gpu + '\'' +
                '}';
    }
}
