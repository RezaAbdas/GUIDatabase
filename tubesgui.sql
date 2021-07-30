-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jul 2021 pada 07.07
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubesgui`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `absensi`
--

CREATE TABLE `absensi` (
  `nama` varchar(50) NOT NULL,
  `nip` varchar(50) NOT NULL,
  `jumlah_jam_lembur` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `absensi`
--

INSERT INTO `absensi` (`nama`, `nip`, `jumlah_jam_lembur`) VALUES
('employee1', '12345', 5),
('employee4', '123456pi', 5),
('nama', 'nip', 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `gaji_karyawan`
--

CREATE TABLE `gaji_karyawan` (
  `NIP` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Pemasukan` int(50) NOT NULL,
  `Pengurangan` int(50) NOT NULL,
  `Gaji_Bersih` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `gaji_karyawan`
--

INSERT INTO `gaji_karyawan` (`NIP`, `Nama`, `Jabatan`, `Pemasukan`, `Pengurangan`, `Gaji_Bersih`) VALUES
('12321234', 'employee2', 'mobiledev', 300000, 100000, 200000),
('12345', 'employee1', 'webdev', 100000, 70000, 30000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `nama` varchar(50) NOT NULL,
  `nip` varchar(10) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `id` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`nama`, `nip`, `jabatan`, `alamat`, `email`, `telepon`, `id`, `password`) VALUES
('employee1', '12345', 'webdev', 'jakarta', 'emplyee1@gmail.com', '12345678765', 'emplyee1', '12345'),
('employee4', '123456pi', 'securenet', 'papuaaa', 'empoyee4@gmail.com', '08765434567', 'employee6', 'papua'),
('employee3', '123908', 'webdev', 'palembang', 'employee3@gmail.com', '167676393898', 'employee3', 'palembang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_admin`
--

CREATE TABLE `login_admin` (
  `id` varchar(10) NOT NULL,
  `password` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login_admin`
--

INSERT INTO `login_admin` (`id`, `password`) VALUES
('Admin', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `absensi`
--
ALTER TABLE `absensi`
  ADD PRIMARY KEY (`nip`);

--
-- Indeks untuk tabel `gaji_karyawan`
--
ALTER TABLE `gaji_karyawan`
  ADD PRIMARY KEY (`NIP`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
