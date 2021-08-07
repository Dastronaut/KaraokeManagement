-- BẢNG MẶT HÀNG

use karaokemanagement
CREATE TABLE SANPHAM(
	ID_SanPham 			INT NOT NULL AUTO_INCREMENT,
	TenSanPham 			VARCHAR(20) NOT NULL,
	DonVi	 			VARCHAR(10) NOT NULL,
	SoLuong 			INT,
	GiaNhap 			INT,
    GiaBan				INT,
	PRIMARY KEY (ID_SanPham)
)