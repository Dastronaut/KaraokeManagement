-- BẢNG CHI TIẾT PHÒNG

use karaokemanagement
CREATE TABLE CHITIETPHONG(
	ID_Order 	INT NOT NULL AUTO_INCREMENT,
	ID_Phong 	VARCHAR(4) NOT NULL,
	GioVao 		DATETIME,
	GioRa 		DATETIME,
	TienGio 	INT,
    TienDV 		INT,
    PhuThu		INT,
    GiamGia		INT,
    TraTruoc	INT,
	PRIMARY KEY (ID_Order),
    FOREIGN KEY (ID_Phong) REFERENCES PHONG(ID_Phong)
)