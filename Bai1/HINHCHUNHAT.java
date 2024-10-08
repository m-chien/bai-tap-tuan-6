
package Bai1;

public class HINHCHUNHAT {
    private double chieudai;
    private double chieurong;
    
    
    //constructor
    public HINHCHUNHAT(double chieudai, double chieurong)
    {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    
    //phương thức tính chu vi
    public double tinhChuVi()
    {
        return (chieudai + chieurong) *2;
    }
    
    //phương thức tính diện tích
    public double tinhDienTich()
    {
        return (chieudai * chieurong);
    }
}

