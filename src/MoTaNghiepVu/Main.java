package MoTaNghiepVu;

public class Main {
    public static void main(String[] args) {
        // --- 1.Tạo các sản phẩm theo kịch bản ---
        // tạo Bàn phím cơ và Chuột không dây bằng constructor đủ tham số
        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuot = new SanPham("SP02", "Chuột không dây", 200000, 50);

        // Tạo tai nghe bằng constructor 2 tham số, rồi dùng setter đặt giá và tồn kho
        SanPham taiNghe = new SanPham("SP03", "Tai nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        // ---2. In danh sách sản phẩm ---
        System.out.println("=====DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();

        System.out.println(); // Dòng trống phân cách

        // --- 3. Tạo các đơn hàng theo kịch bản ---
        // An mua 2 bàn phím
        DonHang don1 = new DonHang("An", banPhim, 2 );
        // Bình mua 5 chuột
        DonHang don2 = new DonHang("Bình", chuot, 5);
        // Chi mua tai nghe nhưng nhập nhầm số lượng 0 (tự động chuyển thành 1)
        DonHang don3 = new DonHang("Chi", taiNghe, 0);

        // --- 4.In danh sách đơn hàng ---
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-7s %-17s %-3s %s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}
