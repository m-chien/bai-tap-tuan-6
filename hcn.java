package bai1;

public class hcn {
    private double chieudai, chieurong;

    public hcn(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double chuvi() {
        return (chieudai + chieurong) * 2;
    }

    public double dientich() {
        return chieudai * chieurong;
    }
}