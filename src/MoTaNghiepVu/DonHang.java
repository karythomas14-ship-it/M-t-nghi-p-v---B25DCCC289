package MoTaNghiepVu;

public class DonHang {
    // Thuộc tính private
    private String tenKhach;
    private SanPham sanPham; // Kiểu SanPham
    private int soLuong;

    // Constructor nhận đủ 3 giá trị; nếu số lượng <1 thì tự sửa thành 1
    public DonHang(String tenKhach, SanPham sanPham, int soLuong){
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        if (soLuong < 1){
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    // Phương thức tính thành tiền: đơn giá * số lượng, từ 5 cái trở lên giảm 10%
    public double tinhThanhTien(){
        double thanhTien = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) {
            thanhTien = thanhTien * 0.9; // giảm 10%
        }
        return thanhTien;
    }

    // Phương tức in thông tin đơn hàng
    public void inDonHang(){
        System.out.printf("%-7s %-17s %-3d %,10.0f\n", tenKhach, sanPham.getTenSP(), soLuong, tinhThanhTien());
        if (soLuong >= 5) {
            System.out.println("   (đã giảm 10%)");
        }
    }
}
