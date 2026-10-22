package MoTaNghiepVu;

public class SanPham {
    // Thuộc tính private
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    // Constructor không tham số
    public SanPham(){}

    // Constructor có 2 tham số(maSP, tenSP)
    public SanPham(String maSP, String tenSP){
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    // Constructor đủ 4 tham số(dùng this để gọi constructor 2 tham số)
    public SanPham(String maSP, String tenSP, double donGia, int soLuongTon){
        this(maSP, tenSP); // Gọi lại constructor(tenSP, maSP)
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    // Các phương thức Getter and Setter
    public String getMaSp(){
        return maSP;
    }

    public void setMaSP(String maSP){
        this.maSP = maSP;
    }

    public String getTenSP(){
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia){
        this.donGia = donGia;
    }

    public void setSoLuongTon(int soLuongTon){
        this.soLuongTon = soLuongTon;
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void hienThi(){
        System.out.printf("%-5s %-17s %,10.0f tồn %d\n", maSP, tenSP, donGia, soLuongTon);
    }
}

