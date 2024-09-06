/*
SQLyog Community
MySQL - 8.0.28 : Database - db_perpus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_perpus` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `db_perpus`;

/*Table structure for table `anggota` */

DROP TABLE IF EXISTS `anggota`;

CREATE TABLE `anggota` (
  `ID_Anggota` char(10) NOT NULL,
  `Nama_Anggota` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Telepon` varchar(15) NOT NULL,
  `Tanggal_Bergabung` date DEFAULT NULL,
  `Jenis_Kelamin` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_Anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `anggota` */

insert  into `anggota`(`ID_Anggota`,`Nama_Anggota`,`Email`,`Telepon`,`Tanggal_Bergabung`,`Jenis_Kelamin`) values 
('AGT2310001','Nama15123','email48@example.com','081234567843','0008-01-12','Laki - Laki'),
('AGT2310002','Nama41','email4@example.com','081234567848','1999-08-30','Perempuan'),
('AGT2310003','Nama15','email27@example.com','081234567843','2004-10-11','Perempuan'),
('AGT2310004','Nama11','email13@example.com','081234567832','1990-10-29','Laki - Laki'),
('AGT2310005','Nama40','email22@example.com','081234567839','1999-08-15','Laki - Laki'),
('AGT2310006','Nama43','email30@example.com','081234567818','1970-09-12','Laki - Laki'),
('AGT2310007','Nama37','email45@example.com','081234567817','2020-10-28','Perempuan'),
('AGT2310008','Nama21','email13@example.com','08123456783','1993-05-24','Laki - Laki'),
('AGT2310009','Nama44','email21@example.com','081234567824','1977-03-16','Laki - Laki'),
('AGT2310010','Nama10','email47@example.com','08123456782','1992-07-28','Perempuan'),
('AGT2310011','Nama15','email32@example.com','081234567812','1983-10-20','Perempuan'),
('AGT2310012','Nama48','email19@example.com','081234567849','2011-07-15','Perempuan'),
('AGT2310013','Nama25','email19@example.com','081234567821','2022-01-28','Perempuan'),
('AGT2310014','Nama15','email8@example.com','081234567844','2019-01-31','Perempuan'),
('AGT2310015','Nama12','email19@example.com','08123456786','1992-05-30','Perempuan'),
('AGT2310016','Nama25','email4@example.com','081234567844','1979-09-01','Laki - Laki'),
('AGT2310017','Nama12','email27@example.com','081234567848','1978-04-25','Perempuan'),
('AGT2310018','Nama22','email40@example.com','081234567832','2014-08-03','Laki - Laki'),
('AGT2310019','Nama8','email48@example.com','081234567817','2015-08-11','Laki - Laki'),
('AGT2310020','Nama8','email37@example.com','08123456788','2004-06-07','Perempuan'),
('AGT2310021','Nama8','email47@example.com','081234567810','1981-08-11','Laki - Laki'),
('AGT2310022','Nama33','email30@example.com','08123456781','1984-01-30','Laki - Laki'),
('AGT2310023','Nama23','email21@example.com','081234567836','1984-03-18','Laki - Laki'),
('AGT2310024','Nama15','email40@example.com','08123456785','1975-02-09','Laki - Laki'),
('AGT2310025','Nama11','email14@example.com','081234567836','2011-04-25','Perempuan'),
('AGT2310026','Nama5','email19@example.com','081234567831','2020-01-06','Perempuan'),
('AGT2310027','Nama27','email31@example.com','081234567823','1993-02-10','Perempuan'),
('AGT2310028','Nama13','email29@example.com','08123456786','2016-06-08','Perempuan'),
('AGT2310029','Nama19','email1@example.com','081234567847','2004-10-30','Laki - Laki'),
('AGT2310030','Nama32','email9@example.com','081234567850','1992-08-13','Laki - Laki'),
('AGT2310031','Nama3','email12@example.com','081234567850','1986-07-04','Perempuan'),
('AGT2310032','Nama44','email47@example.com','08123456784','1999-07-09','Laki - Laki'),
('AGT2310033','Nama26','email33@example.com','081234567837','2007-11-14','Laki - Laki'),
('AGT2310034','Nama36','email44@example.com','081234567813','2001-09-18','Laki - Laki'),
('AGT2310035','Nama22','email47@example.com','081234567819','1971-07-08','Laki - Laki'),
('AGT2310036','Nama23','email39@example.com','081234567827','1987-12-09','Laki - Laki'),
('AGT2310037','Nama18','email14@example.com','081234567815','2006-02-04','Laki - Laki'),
('AGT2310038','Nama49','email24@example.com','081234567824','2020-04-27','Laki - Laki'),
('AGT2310039','Nama27','email40@example.com','081234567818','1990-11-22','Perempuan'),
('AGT2310040','Nama46','email41@example.com','081234567818','1985-08-01','Laki - Laki'),
('AGT2310041','Nama2','email32@example.com','08123456782','1983-10-15','Laki - Laki'),
('AGT2310042','Nama21','email11@example.com','081234567840','1987-05-07','Laki - Laki'),
('AGT2310043','Nama20','email19@example.com','081234567835','1989-10-24','Perempuan'),
('AGT2310044','Nama35','email13@example.com','08123456789','1975-10-08','Laki - Laki'),
('AGT2310045','Nama48','email32@example.com','081234567817','2009-08-10','Perempuan'),
('AGT2310046','Nama39','email49@example.com','081234567827','2010-09-06','Laki - Laki'),
('AGT2310047','Nama21','email38@example.com','081234567824','1978-09-30','Laki - Laki'),
('AGT2310048','Nama4','email38@example.com','081234567829','2000-06-10','Laki - Laki'),
('AGT2310049','Nama25','email27@example.com','08123456789','1984-01-02','Perempuan'),
('USK2405001','asdf','sadf','1234','0018-11-14','Laki - Laki');

/*Table structure for table `buku` */

DROP TABLE IF EXISTS `buku`;

CREATE TABLE `buku` (
  `ID_Buku` char(10) NOT NULL,
  `Judul_Buku` varchar(900) NOT NULL,
  `Pengarang_Buku` varchar(45) NOT NULL,
  `Tahun_Terbit` varchar(10) NOT NULL,
  `ID_Kategori` char(10) NOT NULL,
  `ID_Penerbit` char(10) NOT NULL,
  `Stok` int DEFAULT NULL,
  PRIMARY KEY (`ID_Buku`),
  KEY `fk_Buku_Kategori1` (`ID_Kategori`),
  KEY `fk_Buku_Penerbit1` (`ID_Penerbit`),
  CONSTRAINT `fk_Buku_Kategori1` FOREIGN KEY (`ID_Kategori`) REFERENCES `kategori` (`ID_Kategori`),
  CONSTRAINT `fk_Buku_Penerbit1` FOREIGN KEY (`ID_Penerbit`) REFERENCES `penerbit` (`ID_Penerbit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `buku` */

insert  into `buku`(`ID_Buku`,`Judul_Buku`,`Pengarang_Buku`,`Tahun_Terbit`,`ID_Kategori`,`ID_Penerbit`,`Stok`) values 
('BKU2405001','Skripsi Pengolahan Limbah Plastik Menjadi Cone Block','Yessica Tamara','2022','KTG2405003','PBT2405003',NULL),
('BKU2405003','Pemrograman Junior Mobile Developer','Mei - mei','2022','KTG2405004','PBT2405004',NULL),
('BKU2405004','Pemrograman Junior Web Developer','Ijat','2023','KTG2405004','PBT2405004',NULL),
('BKU2405005','Jaringan Dasar Konfigurasi Miktorik','Chico','2020','KTG2405004','PBT2405004',NULL);

/*Table structure for table `detail_peminjaman` */

DROP TABLE IF EXISTS `detail_peminjaman`;

CREATE TABLE `detail_peminjaman` (
  `ID_Peminjaman` char(10) NOT NULL,
  `ID_Buku` char(10) NOT NULL,
  `Jumlah_Pinjam` int DEFAULT NULL,
  `Status_Peminjaman` varchar(45) NOT NULL,
  KEY `fk_Detail_Peminjaman_Buku1` (`ID_Buku`),
  KEY `detail_peminjaman_ibfk_1` (`ID_Peminjaman`),
  CONSTRAINT `detail_peminjaman_ibfk_1` FOREIGN KEY (`ID_Peminjaman`) REFERENCES `peminjaman` (`ID_Peminjaman`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_peminjaman_ibfk_2` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `detail_peminjaman` */

insert  into `detail_peminjaman`(`ID_Peminjaman`,`ID_Buku`,`Jumlah_Pinjam`,`Status_Peminjaman`) values 
('PMJ2405001','BKU2405005',2,'Sudah dikembalikan'),
('PMJ2405001','BKU2405004',3,'Sudah dikembalikan'),
('PMJ2405002','BKU2405001',3,'Sudah dikembalikan'),
('PMJ2405002','BKU2405003',2,'Sudah dikembalikan'),
('PMJ2405003','BKU2405003',3,'Sudah dikembalikan'),
('PMJ2405003','BKU2405005',2,'Sudah dikembalikan');

/*Table structure for table `detail_pengembalian` */

DROP TABLE IF EXISTS `detail_pengembalian`;

CREATE TABLE `detail_pengembalian` (
  `ID_Pengembalian` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ID_Buku` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Jumlah_Denda` double NOT NULL,
  KEY `fk_Detail_Pengembalian_Buku1` (`ID_Buku`),
  KEY `fk_Detail_Pengembalian_Pengembalian1` (`ID_Pengembalian`),
  CONSTRAINT `fk_Detail_Pengembalian_Buku1` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Detail_Pengembalian_Pengembalian1` FOREIGN KEY (`ID_Pengembalian`) REFERENCES `pengembalian` (`ID_Pengembalian`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `detail_pengembalian` */

insert  into `detail_pengembalian`(`ID_Pengembalian`,`ID_Buku`,`Jumlah_Denda`) values 
('PNG2405001','BKU2405004',0),
('PNG2405002','BKU2405005',0),
('PNG2405003','BKU2405003',0),
('PNG2405004','BKU2405001',0),
('PNG2405005','BKU2405003',1000),
('PNG2405006','BKU2405005',1000);

/*Table structure for table `kategori` */

DROP TABLE IF EXISTS `kategori`;

CREATE TABLE `kategori` (
  `ID_Kategori` char(10) NOT NULL,
  `Nama_Kategori` varchar(45) NOT NULL,
  `Deskripsi_Kategori` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_Kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `kategori` */

insert  into `kategori`(`ID_Kategori`,`Nama_Kategori`,`Deskripsi_Kategori`) values 
('KTG2405001','Non Fiksi','Kisah Nyata'),
('KTG2405002','Fiksi','Tidak Nyata'),
('KTG2405003','Skripsi','Tugas Mahasiswa'),
('KTG2405004','Ilmu Komputer','Mempelajari Tentang Ilmu Komputer');

/*Table structure for table `peminjaman` */

DROP TABLE IF EXISTS `peminjaman`;

CREATE TABLE `peminjaman` (
  `ID_Peminjaman` char(10) NOT NULL,
  `Tanggal_Peminjaman` date DEFAULT NULL,
  `Tanggal_Pengembalian` date DEFAULT NULL,
  `Total_Pinjam` int DEFAULT NULL,
  `ID_User` char(10) NOT NULL,
  `ID_Anggota` char(10) NOT NULL,
  PRIMARY KEY (`ID_Peminjaman`),
  KEY `fk_Peminjaman_User` (`ID_User`),
  KEY `fk_Peminjaman_Anggota1` (`ID_Anggota`),
  CONSTRAINT `fk_id_user` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`),
  CONSTRAINT `fk_Peminjaman_Anggota1` FOREIGN KEY (`ID_Anggota`) REFERENCES `anggota` (`ID_Anggota`),
  CONSTRAINT `fk_Peminjaman_User` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `peminjaman` */

insert  into `peminjaman`(`ID_Peminjaman`,`Tanggal_Peminjaman`,`Tanggal_Pengembalian`,`Total_Pinjam`,`ID_User`,`ID_Anggota`) values 
('PMJ2405001','2024-05-27','2024-05-27',5,'USR2410001','AGT2310010'),
('PMJ2405002','2024-05-27','2024-05-27',5,'USR2410001','AGT2310009'),
('PMJ2405003','2024-05-23','2024-05-25',5,'USR2410001','AGT2310007');

/*Table structure for table `penerbit` */

DROP TABLE IF EXISTS `penerbit`;

CREATE TABLE `penerbit` (
  `ID_Penerbit` char(10) NOT NULL,
  `Nama_Penerbit` varchar(45) DEFAULT NULL,
  `Situs_Penerbit` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Penerbit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `penerbit` */

insert  into `penerbit`(`ID_Penerbit`,`Nama_Penerbit`,`Situs_Penerbit`) values 
('PBT2305001','Ilham Saputra','www.penerbitkesiangan.com'),
('PBT2405001','Afal Khofa','www.pemudaberbakti.com'),
('PBT2405002','Gilang Dwi Surya','www.ilmudata.com'),
('PBT2405003','Universitas Singaperbangsa Karawang','www.unsika.ac.id'),
('PBT2405004','Gudang Ilmu','www.ilmukomputer.id');

/*Table structure for table `pengembalian` */

DROP TABLE IF EXISTS `pengembalian`;

CREATE TABLE `pengembalian` (
  `ID_Pengembalian` char(10) NOT NULL,
  `Tanggal_Dikembalikan` varchar(45) DEFAULT NULL,
  `ID_Peminjaman` char(10) NOT NULL,
  `ID_User` char(10) NOT NULL,
  PRIMARY KEY (`ID_Pengembalian`),
  KEY `fk_Pengembalian_Peminjaman1` (`ID_Peminjaman`),
  KEY `fk_Pengembalian_User1` (`ID_User`),
  CONSTRAINT `fk_Pengembalian_Peminjaman1` FOREIGN KEY (`ID_Peminjaman`) REFERENCES `peminjaman` (`ID_Peminjaman`),
  CONSTRAINT `fk_Pengembalian_User1` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `pengembalian` */

insert  into `pengembalian`(`ID_Pengembalian`,`Tanggal_Dikembalikan`,`ID_Peminjaman`,`ID_User`) values 
('PNG2405001','2024-05-27','PMJ2405001','USR2410001'),
('PNG2405002','2024-05-27','PMJ2405001','USR2410001'),
('PNG2405003','2024-05-27','PMJ2405002','USR2410001'),
('PNG2405004','2024-05-27','PMJ2405002','USR2410001'),
('PNG2405005','2024-05-27','PMJ2405003','USR2410001'),
('PNG2405006','2024-05-27','PMJ2405003','USR2410001');

/*Table structure for table `sementara` */

DROP TABLE IF EXISTS `sementara`;

CREATE TABLE `sementara` (
  `ID_Buku` char(10) NOT NULL,
  `Judul_Buku` varchar(900) DEFAULT NULL,
  `Pengarang_Buku` varchar(900) DEFAULT NULL,
  `Penerbit_Buku` varchar(900) DEFAULT NULL,
  `Jumlah_Pinjam` int DEFAULT NULL,
  `Status_Pinjam` varchar(900) DEFAULT NULL,
  KEY `fk_Sementara_Buku1` (`ID_Buku`),
  CONSTRAINT `fk_Sementara_Buku1` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `sementara` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `ID_User` char(10) NOT NULL,
  `Nama_User` varchar(45) DEFAULT NULL,
  `Username` varchar(150) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`ID_User`,`Nama_User`,`Username`,`Email`,`Password`,`Role`) values 
('USR231000','Afal','afal','afal@gmail.com','4e871ee1a7ca3ed7618bf22228ef8c45','User'),
('USR2405001','bbcc','bbcc','bbcc@gmail.com','08f8e0260c64418510cefb2b06eee5cd','Admin'),
('USR2410001','Administrator','admin','admin@gmail.com','21232f297a57a5a743894a0e4a801fc3','Admin'),
('USR2410002','Ilham','ilham','ilham@gmail.com','b63d204bf086017e34d8bd27ab969f28','User'),
('USR2410003','Abid','abid','abid@gmail.com','fbc2097d2d2310090e007162a34ff628','User'),
('USR2410004','Faqih','faqih','faqih@gmail.com','45fb45aa7a0c763fa7c8349947f5a7cb','User'),
('USR2410005','Panji','panji','panji@gmail.com','d6b16b990a41b83f81a58d38ad7265f1','User');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
