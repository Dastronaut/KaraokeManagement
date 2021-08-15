
-- BẢNG PHÒNG

USE KARAOKEMANAGEMENT;

create table PHONG 
(
   ID_Phong             VARCHAR(10) NOT NULL,
   TenPhong        		VARCHAR(50) NOT NULL,
   GiaPhong            	INT DEFAULT NULL,
   TinhTrang			BOOLEAN DEFAULT TRUE,
   PRIMARY KEY (ID_Phong)
);

insert into PHONG values
('P1', 'Phòng 1',default, default),
('P2', 'Phòng 2',default, default),
('P3', 'Phòng 3',default, default),
('P4', 'Phòng 4',default, default),
('P5', 'Phòng 5',default, default),
('P6', 'Phòng 6',default, default),
('P7', 'Phòng 7',default, default),
('P8', 'Phòng 8',default, default),
('P9', 'Phòng 9',default, default),
('P10', 'Phòng 10',default, default),
('P11', 'Phòng 11',default, default),
('P12', 'Phòng 12',default, default),
('P13', 'Phòng 13',default, default),
('P14', 'Phòng 14',default, default),
('P15', 'Phòng 15',default, default),
('P16', 'Phòng 16',default, default);