package b1;

public class hinhchunhat {
    // Thuộc tính
    private double chieuDai;
    private double chieuRong;

    // Phương thức khởi tạo (constructor)
    public hinhchunhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}