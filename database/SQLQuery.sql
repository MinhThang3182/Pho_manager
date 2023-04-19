creaate database qlyQuanPho

use qlQuanPho

create table BAN
(
	MABAN int not null ,
	LOAIBAN nvarchar(100) ,
	TRANGTHAI NVARCHAR (100) ,

)
GO
/*	
	ALTER TABLE BAN
	ADD DTBAN int,
		LOAIBAN nvarchar(100);


	ALTER TABLE BAN
	DROP COLUMN SOTODAGOI;

*/	

create table THONGKE
(
	MAHD int not null,
	MABAN int not null,
	DTBAN int,
	CACMONANDAGOI nvarchar not null,
	THOIGIAN datetime,
	TONGSOTIEN int,
	TONGDOANHTHU int,
)

create table NVIEN
(
	MANV int not null,
	TENNV nvarchar(100) ,
	NAMSINH int,
	SDT nvarchar(10)  ,
)


GO

create table CTHD
(
	MACTHD int not null IDENTITY(1, 1),
	MAHD int ,
	MABAN int ,
	MAMONAN int ,
	TENMONAN nvarchar(500),
	TONGSOTIEN int,
)
go



create table HD
(
	MAHD int not null IDENTITY(1, 1),
	MABAN int,
	MANV int ,
	TENNV nvarchar(100) ,
	TENMONAN nvarchar(500),
	THOIGIAN datetime,
	TONGTIEN int,
)
GO



create table THUCDON
(
	MAMONAN int not null,
	TENMONAN nvarchar(100) not null,
	DONGIA int,
	LOAITO NVARCHAR(100),

)
GO



create table DANGNHAP
(
	TAIKHOAN nvarchar(100) not null,
	MATKHAU nvarchar(100) not null,
)
GO

--TAO KHOA CHINH
alter table dbo.BAN add constraint PK_BAN primary key (MABAN)
alter table dbo.NVIEN add constraint PK_NVIEN primary key (MANV)
alter table dbo.HD add constraint PK_HD primary key (MAHD)
alter table dbo.CTHD add constraint PK_CTHD primary key (MACTHD)
alter table dbo.THUCDON add constraint PK_MAMONAN primary key (MAMONAN)


--TAO KHOA NGOAI
alter table dbo.HD add constraint FK_NVIEN_HD foreign key (MANV) references dbo.NVIEN(MANV)
alter table dbo.HD add constraint FK_BAN_HD foreign key (MABAN) references dbo.BAN(MABAN)
alter table dbo.CTHD add constraint FK_CTHD_HD foreign key (MAHD) references dbo.HD(MAHD)
alter table dbo.CTHD add constraint FK_CTHD_THUCDON foreign key (MAMONAN) references dbo.THUCDON(MAMONAN)
--XOA KHOA NGOAI
/*
ALTER TABLE HOADON
DROP CONSTRAINT FK_BAN_HOADON;

ALTER TABLE TOPHO
DROP CONSTRAINT FK_BAN_TOPHO;

*/



--NHAP DU LIEU
--NHAP DU LIEU TABLE: BAN
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('1',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('2',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('3',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('4',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('5',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('6',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('7',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('8',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('9',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('10',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('11',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('12',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('13',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('14',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('15',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('16',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('17',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('18',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('19',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('20',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('21',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('22',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('23',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('24',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('25',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('26',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('27',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('28',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('29',N'Bàn Nhỏ',N'Trống')
insert into BAN(MABAN,LOAIBAN,TRANGTHAI) values ('30',N'Bàn Nhỏ',N'Trống')


--NHAP DU LIEU TABLE: NVIEN
insert into NVIEN(MANV,TENNV,NAMSINH,SDT) values ('1',N'Nguyen Van A','2000','0912345678')
insert into NVIEN(MANV,TENNV,NAMSINH,SDT) values ('2',N'Nguyen Van B','1999','0123456789')
insert into NVIEN(MANV,TENNV,NAMSINH,SDT) values ('3',N'Nguyen Van C','2001','0213456789')




--NHAP DU LIEU TABLE: HD
 insert into HD(MABAN,MANV,TENNV,TENMONAN,THOIGIAN,TONGTIEN) values ('1','1',N'Nguyen Van A',N'PHO TAI NAM GAU','1/1/2020','90000')


 --NHAP DU LIEU TABLE: CTHD
insert into CTHD(MAHD,MABAN,MAMONAN,TENMONAN,TONGSOTIEN) values ('1','1','1',N'PHO TAI NAM GAU','90000')

--NHAP DU LIEU TABLE: THUCDON
insert into THUCDON(MAMONAN,TENMONAN,LOAITO,DONGIA) values ('1','PHO','TONHO','45000')
insert into THUCDON(MAMONAN,TENMONAN,LOAITO,DONGIA) values ('2','PHO','TOLON','60000')
insert into THUCDON(MAMONAN,TENMONAN,LOAITO,DONGIA) values ('3','PHO','TODACBIET','75000')


