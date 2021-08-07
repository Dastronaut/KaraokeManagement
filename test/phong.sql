
-- BẢNG PHÒNG

use karaokemanagement

create table PHONG 
(
   ID_Phong             VARCHAR(4)                        not null,
   TenPhong        		NVARCHAR(20)                       not null,
   GiaPhong            	int(3)                        default null,
   TinhTrang			BOOL							default false,
   primary key (ID_Phong)
);