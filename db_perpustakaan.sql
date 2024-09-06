-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Sep 2024 pada 17.59
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `ID_Anggota` char(10) NOT NULL,
  `Nama_Anggota` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Telepon` varchar(15) NOT NULL,
  `Tanggal_Bergabung` date DEFAULT NULL,
  `Jenis_Kelamin` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`ID_Anggota`, `Nama_Anggota`, `Email`, `Telepon`, `Tanggal_Bergabung`, `Jenis_Kelamin`) VALUES
('AGT2310001', 'Nama15123', 'email48@example.com', '081234567843', '0008-01-12', 'Laki - Laki'),
('AGT2310002', 'Nama41', 'email4@example.com', '081234567848', '1999-08-30', 'Perempuan'),
('AGT2310003', 'Nama15', 'email27@example.com', '081234567843', '2004-10-11', 'Perempuan'),
('AGT2310004', 'Nama11', 'email13@example.com', '081234567832', '1990-10-29', 'Laki - Laki'),
('AGT2310005', 'Nama40', 'email22@example.com', '081234567839', '1999-08-15', 'Laki - Laki'),
('AGT2310006', 'Nama43', 'email30@example.com', '081234567818', '1970-09-12', 'Laki - Laki'),
('AGT2310007', 'Nama37', 'email45@example.com', '081234567817', '2020-10-28', 'Perempuan'),
('AGT2310008', 'Nama21', 'email13@example.com', '08123456783', '1993-05-24', 'Laki - Laki'),
('AGT2310009', 'Nama44', 'email21@example.com', '081234567824', '1977-03-16', 'Laki - Laki'),
('AGT2310010', 'Nama10', 'email47@example.com', '08123456782', '1992-07-28', 'Perempuan'),
('AGT2310011', 'Nama15', 'email32@example.com', '081234567812', '1983-10-20', 'Perempuan'),
('AGT2310012', 'Nama48', 'email19@example.com', '081234567849', '2011-07-15', 'Perempuan'),
('AGT2310013', 'Nama25', 'email19@example.com', '081234567821', '2022-01-28', 'Perempuan'),
('AGT2310014', 'Nama15', 'email8@example.com', '081234567844', '2019-01-31', 'Perempuan'),
('AGT2310015', 'Nama12', 'email19@example.com', '08123456786', '1992-05-30', 'Perempuan'),
('AGT2310016', 'Nama25', 'email4@example.com', '081234567844', '1979-09-01', 'Laki - Laki'),
('AGT2310017', 'Nama12', 'email27@example.com', '081234567848', '1978-04-25', 'Perempuan'),
('AGT2310018', 'Nama22', 'email40@example.com', '081234567832', '2014-08-03', 'Laki - Laki'),
('AGT2310019', 'Nama8', 'email48@example.com', '081234567817', '2015-08-11', 'Laki - Laki'),
('AGT2310020', 'Nama8', 'email37@example.com', '08123456788', '2004-06-07', 'Perempuan'),
('AGT2310021', 'Nama8', 'email47@example.com', '081234567810', '1981-08-11', 'Laki - Laki'),
('AGT2310022', 'Nama33', 'email30@example.com', '08123456781', '1984-01-30', 'Laki - Laki'),
('AGT2310023', 'Nama23', 'email21@example.com', '081234567836', '1984-03-18', 'Laki - Laki'),
('AGT2310024', 'Nama15', 'email40@example.com', '08123456785', '1975-02-09', 'Laki - Laki'),
('AGT2310025', 'Nama11', 'email14@example.com', '081234567836', '2011-04-25', 'Perempuan'),
('AGT2310026', 'Nama5', 'email19@example.com', '081234567831', '2020-01-06', 'Perempuan'),
('AGT2310027', 'Nama27', 'email31@example.com', '081234567823', '1993-02-10', 'Perempuan'),
('AGT2310028', 'Nama13', 'email29@example.com', '08123456786', '2016-06-08', 'Perempuan'),
('AGT2310029', 'Nama19', 'email1@example.com', '081234567847', '2004-10-30', 'Laki - Laki'),
('AGT2310030', 'Nama32', 'email9@example.com', '081234567850', '1992-08-13', 'Laki - Laki'),
('AGT2310031', 'Nama3', 'email12@example.com', '081234567850', '1986-07-04', 'Perempuan'),
('AGT2310032', 'Nama44', 'email47@example.com', '08123456784', '1999-07-09', 'Laki - Laki'),
('AGT2310033', 'Nama26', 'email33@example.com', '081234567837', '2007-11-14', 'Laki - Laki'),
('AGT2310034', 'Nama36', 'email44@example.com', '081234567813', '2001-09-18', 'Laki - Laki'),
('AGT2310035', 'Nama22', 'email47@example.com', '081234567819', '1971-07-08', 'Laki - Laki'),
('AGT2310036', 'Nama23', 'email39@example.com', '081234567827', '1987-12-09', 'Laki - Laki'),
('AGT2310037', 'Nama18', 'email14@example.com', '081234567815', '2006-02-04', 'Laki - Laki'),
('AGT2310038', 'Nama49', 'email24@example.com', '081234567824', '2020-04-27', 'Laki - Laki'),
('AGT2310039', 'Nama27', 'email40@example.com', '081234567818', '1990-11-22', 'Perempuan'),
('AGT2310040', 'Nama46', 'email41@example.com', '081234567818', '1985-08-01', 'Laki - Laki'),
('AGT2310041', 'Nama2', 'email32@example.com', '08123456782', '1983-10-15', 'Laki - Laki'),
('AGT2310042', 'Nama21', 'email11@example.com', '081234567840', '1987-05-07', 'Laki - Laki'),
('AGT2310043', 'Nama20', 'email19@example.com', '081234567835', '1989-10-24', 'Perempuan'),
('AGT2310044', 'Nama35', 'email13@example.com', '08123456789', '1975-10-08', 'Laki - Laki'),
('AGT2310045', 'Nama48', 'email32@example.com', '081234567817', '2009-08-10', 'Perempuan'),
('AGT2310046', 'Nama39', 'email49@example.com', '081234567827', '2010-09-06', 'Laki - Laki'),
('USK2405001', 'asdf', 'sadf', '1234', '0018-11-14', 'Laki - Laki'),
('USK2407001', 'gilang', 'gilang@gmail.com', '12323432', '0008-01-14', 'Laki - Laki');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `ID_Buku` char(10) NOT NULL,
  `Judul_Buku` varchar(900) NOT NULL,
  `Pengarang_Buku` varchar(45) NOT NULL,
  `Tahun_Terbit` varchar(10) NOT NULL,
  `ID_Kategori` char(10) NOT NULL,
  `ID_Penerbit` char(10) NOT NULL,
  `Stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`ID_Buku`, `Judul_Buku`, `Pengarang_Buku`, `Tahun_Terbit`, `ID_Kategori`, `ID_Penerbit`, `Stok`) VALUES
('BKU2405003', 'Pemrograman Junior Mobile Developer', 'Mei - mei', '2022', 'KTG2405004', 'PBT2405004', 12),
('BKU2405004', 'Pemrograman Junior Web Developer', 'Ijat', '2023', 'KTG2405004', 'PBT2405004', 9),
('BKU2405006', 'Dasar - dasar Tailwind Css', 'Juniper', '2022', 'KTG2405004', 'PBT2405004', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_peminjaman`
--

CREATE TABLE `detail_peminjaman` (
  `ID_Peminjaman` char(10) NOT NULL,
  `ID_Buku` char(10) NOT NULL,
  `Jumlah_Pinjam` int(11) DEFAULT NULL,
  `Status_Peminjaman` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `detail_peminjaman`
--

INSERT INTO `detail_peminjaman` (`ID_Peminjaman`, `ID_Buku`, `Jumlah_Pinjam`, `Status_Peminjaman`) VALUES
('PMJ2405001', 'BKU2405004', 3, 'Sudah dikembalikan'),
('PMJ2405002', 'BKU2405003', 2, 'Sudah dikembalikan'),
('PMJ2405003', 'BKU2405003', 3, 'Sudah dikembalikan'),
('PMJ2405006', 'BKU2405006', 1, 'Sudah dikembalikan'),
('PMJ2405007', 'BKU2405003', 2, 'Sudah dikembalikan'),
('PMJ2405008', 'BKU2405003', 1, 'Sudah dikembalikan'),
('PMJ2407001', 'BKU2405003', 1, 'Sedang Dipinjam'),
('PMJ2407001', 'BKU2405004', 1, 'Sudah dikembalikan');

--
-- Trigger `detail_peminjaman`
--
DELIMITER $$
CREATE TRIGGER `peminjaman_buku` AFTER INSERT ON `detail_peminjaman` FOR EACH ROW BEGIN
    UPDATE buku SET Stok = Stok - NEW.Jumlah_Pinjam
    WHERE ID_Buku = NEW.ID_Buku;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_stok_pinjam` AFTER INSERT ON `detail_peminjaman` FOR EACH ROW BEGIN
UPDATE buku SET Stok = Stok-NEW.Jumlah_Pinjam
WHERE ID_Buku=NEW.ID_Buku;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_pengembalian`
--

CREATE TABLE `detail_pengembalian` (
  `ID_Pengembalian` char(10) NOT NULL,
  `ID_Buku` char(10) NOT NULL,
  `Jumlah_Kembali` int(11) DEFAULT NULL,
  `Jumlah_Denda` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `detail_pengembalian`
--

INSERT INTO `detail_pengembalian` (`ID_Pengembalian`, `ID_Buku`, `Jumlah_Kembali`, `Jumlah_Denda`) VALUES
('PNG2405001', 'BKU2405004', NULL, 0),
('PNG2405003', 'BKU2405003', NULL, 0),
('PNG2405005', 'BKU2405003', NULL, 1000),
('PNG2405008', 'BKU2405006', NULL, 1000),
('PNG2405010', 'BKU2405003', 1, 0),
('PNG2407001', 'BKU2405004', 1, 1500);

--
-- Trigger `detail_pengembalian`
--
DELIMITER $$
CREATE TRIGGER `update_stok_kembali` AFTER INSERT ON `detail_pengembalian` FOR EACH ROW BEGIN
UPDATE buku SET Stok = Stok+NEW.Jumlah_Kembali
WHERE ID_Buku=NEW.ID_Buku;

END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `ID_Kategori` char(10) NOT NULL,
  `Nama_Kategori` varchar(45) NOT NULL,
  `Deskripsi_Kategori` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`ID_Kategori`, `Nama_Kategori`, `Deskripsi_Kategori`) VALUES
('KTG2405001', 'Non Fiksi', 'Kisah Nyata'),
('KTG2405002', 'Fiksi', 'Tidak Nyata'),
('KTG2405003', 'Skripsi', 'Tugas Mahasiswa'),
('KTG2405004', 'Ilmu Komputer', 'Mempelajari Tentang Ilmu Komputer');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `ID_Peminjaman` char(10) NOT NULL,
  `Tanggal_Peminjaman` date DEFAULT NULL,
  `Tanggal_Pengembalian` date DEFAULT NULL,
  `Total_Pinjam` int(11) DEFAULT NULL,
  `ID_User` char(10) NOT NULL,
  `ID_Anggota` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`ID_Peminjaman`, `Tanggal_Peminjaman`, `Tanggal_Pengembalian`, `Total_Pinjam`, `ID_User`, `ID_Anggota`) VALUES
('PMJ2405001', '2024-05-27', '2024-05-27', 5, 'USR2410001', 'AGT2310010'),
('PMJ2405002', '2024-05-27', '2024-05-27', 5, 'USR2410001', 'AGT2310009'),
('PMJ2405003', '2024-05-23', '2024-05-25', 5, 'USR2410001', 'AGT2310007'),
('PMJ2405004', '2024-05-28', '2024-05-28', 5, 'USR2410001', 'USK2405001'),
('PMJ2405005', '2024-05-28', '2024-05-28', 3, 'USR2410001', 'AGT2310001'),
('PMJ2405006', '2024-05-28', '2024-05-28', 1, 'USR2410001', 'AGT2310001'),
('PMJ2405007', '2024-05-30', '2024-05-31', 2, 'USR2410001', 'AGT2310001'),
('PMJ2405008', '2024-05-30', '2024-05-30', 1, 'USR2410001', 'AGT2310001'),
('PMJ2407001', '2024-07-02', '2024-07-02', 2, 'USR2410001', 'USK2407001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerbit`
--

CREATE TABLE `penerbit` (
  `ID_Penerbit` char(10) NOT NULL,
  `Nama_Penerbit` varchar(45) DEFAULT NULL,
  `Situs_Penerbit` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penerbit`
--

INSERT INTO `penerbit` (`ID_Penerbit`, `Nama_Penerbit`, `Situs_Penerbit`) VALUES
('PBT2305001', 'Ilham Saputra', 'www.penerbitkesiangan.com'),
('PBT2405001', 'Afal Khofa', 'www.pemudaberbakti.com'),
('PBT2405002', 'Gilang Dwi Surya', 'www.ilmudata.com'),
('PBT2405003', 'Universitas Singaperbangsa Karawang', 'www.unsika.ac.id'),
('PBT2405004', 'Gudang Ilmu', 'www.ilmukomputer.id');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `ID_Pengembalian` char(10) NOT NULL,
  `Tanggal_Dikembalikan` varchar(45) DEFAULT NULL,
  `ID_Peminjaman` char(10) NOT NULL,
  `ID_User` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pengembalian`
--

INSERT INTO `pengembalian` (`ID_Pengembalian`, `Tanggal_Dikembalikan`, `ID_Peminjaman`, `ID_User`) VALUES
('PNG2405001', '2024-05-27', 'PMJ2405001', 'USR2410001'),
('PNG2405002', '2024-05-27', 'PMJ2405001', 'USR2410001'),
('PNG2405003', '2024-05-27', 'PMJ2405002', 'USR2410001'),
('PNG2405004', '2024-05-27', 'PMJ2405002', 'USR2410001'),
('PNG2405005', '2024-05-27', 'PMJ2405003', 'USR2410001'),
('PNG2405006', '2024-05-27', 'PMJ2405003', 'USR2410001'),
('PNG2405007', '2024-05-30', 'PMJ2405004', 'USR2410001'),
('PNG2405008', '2024-05-30', 'PMJ2405006', 'USR2410001'),
('PNG2405009', '2024-06-27', 'PMJ2405007', 'USR2410001'),
('PNG2405010', '2024-06-30', 'PMJ2405008', 'USR2410001'),
('PNG2407001', '2024-07-05', 'PMJ2407001', 'USR2410001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sementara`
--

CREATE TABLE `sementara` (
  `ID_Buku` char(10) NOT NULL,
  `Judul_Buku` varchar(900) DEFAULT NULL,
  `Pengarang_Buku` varchar(900) DEFAULT NULL,
  `Penerbit_Buku` varchar(900) DEFAULT NULL,
  `Jumlah_Pinjam` int(11) DEFAULT NULL,
  `Status_Pinjam` varchar(900) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `ID_User` char(10) NOT NULL,
  `Nama_User` varchar(45) DEFAULT NULL,
  `Username` varchar(150) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Role` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`ID_User`, `Nama_User`, `Username`, `Email`, `Password`, `Role`) VALUES
('USR2410001', 'Administrator', 'admin', 'admin@gmail.com', '21232f297a57a5a743894a0e4a801fc3', 'Admin'),
('USR2410002', 'Ilham', 'ilham', 'ilham@gmail.com', 'b63d204bf086017e34d8bd27ab969f28', 'User');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`ID_Anggota`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`ID_Buku`),
  ADD KEY `fk_Buku_Kategori1` (`ID_Kategori`),
  ADD KEY `fk_Buku_Penerbit1` (`ID_Penerbit`);

--
-- Indeks untuk tabel `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
  ADD KEY `fk_Detail_Peminjaman_Buku1` (`ID_Buku`),
  ADD KEY `detail_peminjaman_ibfk_1` (`ID_Peminjaman`);

--
-- Indeks untuk tabel `detail_pengembalian`
--
ALTER TABLE `detail_pengembalian`
  ADD KEY `fk_Detail_Pengembalian_Buku1` (`ID_Buku`),
  ADD KEY `fk_Detail_Pengembalian_Pengembalian1` (`ID_Pengembalian`);

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`ID_Kategori`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`ID_Peminjaman`),
  ADD KEY `fk_Peminjaman_User` (`ID_User`),
  ADD KEY `fk_Peminjaman_Anggota1` (`ID_Anggota`);

--
-- Indeks untuk tabel `penerbit`
--
ALTER TABLE `penerbit`
  ADD PRIMARY KEY (`ID_Penerbit`);

--
-- Indeks untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`ID_Pengembalian`),
  ADD KEY `fk_Pengembalian_Peminjaman1` (`ID_Peminjaman`),
  ADD KEY `fk_Pengembalian_User1` (`ID_User`);

--
-- Indeks untuk tabel `sementara`
--
ALTER TABLE `sementara`
  ADD KEY `fk_Sementara_Buku1` (`ID_Buku`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID_User`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `fk_Buku_Kategori1` FOREIGN KEY (`ID_Kategori`) REFERENCES `kategori` (`ID_Kategori`),
  ADD CONSTRAINT `fk_Buku_Penerbit1` FOREIGN KEY (`ID_Penerbit`) REFERENCES `penerbit` (`ID_Penerbit`);

--
-- Ketidakleluasaan untuk tabel `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
  ADD CONSTRAINT `detail_peminjaman_ibfk_1` FOREIGN KEY (`ID_Peminjaman`) REFERENCES `peminjaman` (`ID_Peminjaman`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_peminjaman_ibfk_2` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `detail_pengembalian`
--
ALTER TABLE `detail_pengembalian`
  ADD CONSTRAINT `fk_Detail_Pengembalian_Buku1` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Detail_Pengembalian_Pengembalian1` FOREIGN KEY (`ID_Pengembalian`) REFERENCES `pengembalian` (`ID_Pengembalian`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `fk_Peminjaman_Anggota1` FOREIGN KEY (`ID_Anggota`) REFERENCES `anggota` (`ID_Anggota`),
  ADD CONSTRAINT `fk_Peminjaman_User` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`),
  ADD CONSTRAINT `fk_id_user` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`);

--
-- Ketidakleluasaan untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD CONSTRAINT `fk_Pengembalian_Peminjaman1` FOREIGN KEY (`ID_Peminjaman`) REFERENCES `peminjaman` (`ID_Peminjaman`),
  ADD CONSTRAINT `fk_Pengembalian_User1` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`);

--
-- Ketidakleluasaan untuk tabel `sementara`
--
ALTER TABLE `sementara`
  ADD CONSTRAINT `fk_Sementara_Buku1` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
