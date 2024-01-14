-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.32-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for test
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `test`;

-- Dumping structure for table test.doanhthutheonam
CREATE TABLE IF NOT EXISTS `doanhthutheonam` (
  `taikhoanid` int(11) DEFAULT NULL,
  `nam` varchar(50) DEFAULT NULL,
  `doanhthu` int(11) DEFAULT NULL,
  `loinhuan` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.doanhthutheonam: ~36 rows (approximately)
REPLACE INTO `doanhthutheonam` (`taikhoanid`, `nam`, `doanhthu`, `loinhuan`) VALUES
	(1, '2034', 0, 0),
	(1, '2033', 0, 0),
	(1, '2032', 0, 0),
	(1, '2031', 0, 0),
	(1, '2030', 0, 0),
	(1, '2029', 0, 0),
	(1, '2028', 0, 0),
	(1, '2027', 0, 0),
	(1, '2026', 0, 0),
	(1, '2025', 0, 0),
	(1, '2024', 12507000, 5780000),
	(1, '2023', 679000000, 372000000),
	(8, '2034', 0, 0),
	(8, '2033', 0, 0),
	(8, '2032', 0, 0),
	(8, '2031', 0, 0),
	(8, '2030', 0, 0),
	(8, '2029', 0, 0),
	(8, '2028', 0, 0),
	(8, '2027', 0, 0),
	(8, '2026', 0, 0),
	(8, '2025', 0, 0),
	(8, '2024', 0, 0),
	(8, '2023', 0, 0),
	(9, '2034', 0, 0),
	(9, '2033', 0, 0),
	(9, '2032', 0, 0),
	(9, '2031', 0, 0),
	(9, '2030', 0, 0),
	(9, '2029', 0, 0),
	(9, '2028', 0, 0),
	(9, '2027', 0, 0),
	(9, '2026', 0, 0),
	(9, '2025', 0, 0),
	(9, '2024', 0, 0),
	(9, '2023', 0, 0);

-- Dumping structure for table test.doanhthutheothang
CREATE TABLE IF NOT EXISTS `doanhthutheothang` (
  `taikhoanid` int(11) DEFAULT NULL,
  `thangnam` varchar(50) DEFAULT NULL,
  `doanhthu` varchar(50) DEFAULT '0',
  `loinhuan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.doanhthutheothang: ~24 rows (approximately)
REPLACE INTO `doanhthutheothang` (`taikhoanid`, `thangnam`, `doanhthu`, `loinhuan`) VALUES
	(1, '12/2023', '15000000', '7500000'),
	(1, '11/2023', '45000000', '25000000'),
	(1, '10/2023', '12000000', '5000000'),
	(1, '09/2023', '70000000', '45000700'),
	(1, '08/2023', '60000000', '32000000'),
	(1, '07/2023', '56000000', '25000000'),
	(1, '06/2023', '78000000', '45000000'),
	(1, '05/2023', '79000000', '35000000'),
	(1, '04/2023', '15000000', '8000000'),
	(1, '03/2023', '23000000', '12000000'),
	(1, '02/2023', '57000000', '35000000'),
	(1, '01/2023', '67000000', '5000000'),
	(1, '12/2024', '0', '0'),
	(1, '11/2024', '0', '0'),
	(1, '10/2024', '0', '0'),
	(1, '09/2024', '0', '0'),
	(1, '08/2024', '0', '0'),
	(1, '07/2024', '0', '0'),
	(1, '06/2024', '0', '0'),
	(1, '05/2024', '0', '0'),
	(1, '04/2024', '0', '0'),
	(1, '03/2024', '0', '0'),
	(1, '02/2024', '0', '0'),
	(1, '01/2024', '60207000', '18680000');

-- Dumping structure for table test.lichsuban
CREATE TABLE IF NOT EXISTS `lichsuban` (
  `taikhoanid` int(11) NOT NULL,
  `TenBan` varchar(50) NOT NULL,
  `ViTri` varchar(50) NOT NULL,
  `HoaDon` longtext NOT NULL,
  `TongTien` int(11) NOT NULL,
  `ThoiGian` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.lichsuban: ~38 rows (approximately)
REPLACE INTO `lichsuban` (`taikhoanid`, `TenBan`, `ViTri`, `HoaDon`, `TongTien`, `ThoiGian`) VALUES
	(1, 'Ban 2', 'Tang 2', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nTra Chanh Gia Tay        30000          1    30000.00\nKhoai Lang Nuong         30000          2    60000.00\nNem Chua Ran             20000          5    100000.00\nnuoc khoang              25000          2    50000.00\n</pre></html>', 265000, '  2023-12-27   17:11:38'),
	(1, 'Ban 3', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nTra Bi Dao               25000          1    25000.00\nKhoai Lang Nuong         30000          2    60000.00\nnuoc khoang              25000          2    50000.00\nHambuger                 30000          2    60000.00\n</pre></html>', 212000, '  2023-12-27   23:37:08'),
	(1, 'Ban 4', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nBanh Sung Bo             35000          1    35000.00\nCafe Dua                 25000          1    25000.00\nCappuchino               40000          1    40000.00\nNem Chua Ran             20000          1    20000.00\nPizza                    75000          1    75000.00\n</pre></html>', 220000, '  2023-12-27   23:39:09'),
	(1, 'Ban 4', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nTra Bi Dao               25000          1    25000.00\nNem Chua Ran             20000          3    60000.00\nPizza                    75000          3    225000.00\n</pre></html>', 327000, '  2023-12-27   23:41:55'),
	(1, 'Ban 10', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe Xoai                40000          1    40000.00\nTra Dao Cam Sa           30000          1    30000.00\nKhoai Lang Nuong         30000          1    30000.00\n</pre></html>', 125000, '  2023-12-28   12:03:47'),
	(1, 'Ban 21', 'Outside', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\n</pre></html>', 0, '  2023-12-28   16:38:58'),
	(1, 'Ban 2', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nCafe May                 25000          1    25000.00\nCafe Dua                 25000          1    25000.00\nNem Chua Ran             20000          1    20000.00\nPizza                    75000          2    150000.00\nGa Vien                  25000          2    50000.00\n</pre></html>', 295000, '  2023-12-28   16:44:44'),
	(1, 'Ban 9', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nCafe May                 25000          2    50000.00\nNem Chua Ran             20000          2    40000.00\nPizza                    75000          1    75000.00\nPho Mai                  35000          1    35000.00\nBanh Sung Bo             35000          1    35000.00\n</pre></html>', 260000, '  2023-12-28   16:48:08'),
	(1, 'Ban 4', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nCafe May                 25000          1    25000.00\nTra Dao Cam Sa           30000          1    30000.00\nNem Chua Ran             20000          3    60000.00\nKhoai Lang Nuong         30000          3    90000.00\n</pre></html>', 230000, '  2023-12-28   16:50:17'),
	(1, 'Ban 5', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nTra Dao Cam Sa           30000          1    30000.00\nGa Vien                  25000          1    25000.00\nnuoc khoang              25000          1    25000.00\nnuoc khoang              25000          1    25000.00\nnuoc khoang              25000          1    25000.00\nnuoc khoang              25000          1    25000.00\n</pre></html>', 180000, '  2023-12-28   16:58:37'),
	(1, 'Ban 7', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nBo Huc                   25000          1    25000.00\nPho Mai                  35000          1    35000.00\nTra Dau                  25000          26   650000.00\n</pre></html>', 735000, '  2023-12-28   17:40:13'),
	(1, 'Ban 7', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Chanh Gia Tay        30000          1    30000.00\nTra Dau                  25000          1    25000.00\nCappuchino               40000          1    40000.00\nCafe Dua                 25000          1    25000.00\n</pre></html>', 120000, '  2023-12-28   17:49:33'),
	(1, 'Ban 6', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nTra Bi Dao               25000          1    25000.00\nPizza                    75000          1    75000.00\nnuoc khoang              25000          1    25000.00\n</pre></html>', 150000, '  2023-12-28   20:58:50'),
	(1, 'Ban 27', 'Tang 3', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\n7up                      15000          1    15000.00\nCafe Dua                 25000          1    25000.00\nNem Chua Ran             20000          1    20000.00\nGa Vien                  25000          1    25000.00\nnuoc khoang              25000          1    25000.00\n</pre></html>', 110000, '  2023-12-28   22:15:42'),
	(1, 'Ban 8', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nCafe Dua                 25000          1    25000.00\nHambuger                 30000          1    30000.00\nPho Mai                  35000          1    35000.00\n</pre></html>', 107000, '  2023-12-29   20:41:44'),
	(1, 'Ban 5', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nBo Huc                   25000          1    25000.00\nPizza                    75000          1    75000.00\nPizza                    75000          1    75000.00\n</pre></html>', 200000, '  2023-12-29   20:42:19'),
	(1, 'Ban 11', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe Dua                 25000          1    25000.00\nTra Dao Cam Sa           30000          1    30000.00\nPho Mai                  35000          1    35000.00\n</pre></html>', 115000, '  2023-12-29   23:29:12'),
	(1, 'Ban 1', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe May                 25000          4    100000.00\nNem Chua Ran             20000          4    80000.00\nKhoai Lang Lac           20000          4    80000.00\nPho Mai                  35000          4    140000.00\n</pre></html>', 425000, '  2023-12-30   22:00:03'),
	(1, 'Ban 28', 'Tang 3', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe May                 25000          1    25000.00\nPho Mai                  35000          2    70000.00\nCafe trung               30000          2    60000.00\nCafe trung               30000          2    60000.00\n</pre></html>', 240000, '  2023-12-30   22:03:15'),
	(1, 'Ban 28', 'Tang 3', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe May                 25000          1    25000.00\nHambuger                 30000          1    30000.00\nPho Mai                  35000          1    35000.00\nnuoc khoang              25000          1    25000.00\n</pre></html>', 140000, '  2023-12-30   22:04:59'),
	(1, 'Ban 10', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCafe Dua                 25000          1    25000.00\nHambuger                 30000          1    30000.00\nGa Vien                  25000          1    25000.00\nnuoc khoang              25000          1    25000.00\n7up                      15000          1    15000.00\nRevice                   15000          1    15000.00\n</pre></html>', 135000, '  2023-12-31   13:12:58'),
	(1, 'Ban 8', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Bi Dao               25000          1    25000.00\nnuoc khoang              25000          2    50000.00\nnuoc khoang              25000          2    50000.00\nnuoc khoang              25000          2    50000.00\nRevice                   15000          2    30000.00\n</pre></html>', 205000, '  2023-12-31   13:20:10'),
	(1, 'Ban 4', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nCafe Dua                 25000          1    25000.00\nCa Vien Chien            15000          3    45000.00\nnuoc khoang              25000          3    75000.00\n</pre></html>', 170000, '  2024-01-02   12:07:34'),
	(1, 'Ban 9', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe Dua                 25000          1    25000.00\nTra Dau                  25000          1    25000.00\nGa Vien                  25000          1    25000.00\n</pre></html>', 100000, '  2024-01-02   23:00:08'),
	(1, 'Ban 1', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe May                 25000          1    25000.00\n</pre></html>', 50000, '  2024-01-03   23:38:16'),
	(1, 'Ban 1', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe May                 25000          1    25000.00\n</pre></html>', 50000, '  2024-01-03   23:41:16'),
	(1, 'Ban 1', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nCafe May                 25000          1    25000.00\n</pre></html>', 50000, '  2024-01-03   23:41:23'),
	(1, 'Ban 8', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\nCafe May                 25000          1    25000.00\nKhoai Lang Lac           20000          1    20000.00\n</pre></html>', 70000, '  2024-01-03   23:43:51'),
	(1, 'Ban 10', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nSting                    20000          1    20000.00\nTra Chanh Gia Tay        30000          1    30000.00\n</pre></html>', 50000, '  2024-01-03   23:45:44'),
	(1, 'Ban 14', 'Tang 2', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra Luc Nhan             25000          1    25000.00\n</pre></html>', 25000, '  2024-01-03   23:46:30'),
	(1, 'Ban 2', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nBo Huc                   25000          1    25000.00\nHambuger                 30000          1    30000.00\n</pre></html>', 80000, '  2024-01-04   00:03:02'),
	(1, 'Ban 9', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nCafe Dua                 25000          1    25000.00\nHambuger                 30000          1    30000.00\n</pre></html>', 72000, '  2024-01-04   00:04:41'),
	(1, 'Ban 10', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nBo Huc                   25000          3    75000.00\n</pre></html>', 92000, '  2024-01-04   00:07:01'),
	(1, 'Ban 9', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nBo Huc                   25000          1    25000.00\nTra Dau                  25000          1    25000.00\n</pre></html>', 75000, '  2024-01-04   00:09:34'),
	(1, 'Ban 5', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nSting                    20000          1    20000.00\nTra Bi Dao               25000          1    25000.00\n</pre></html>', 45000, '  2024-01-04   00:48:18'),
	(1, 'Ban 5', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nBo Huc                   25000          1    25000.00\nKhoai Lang Nuong         30000          1    30000.00\nTra Dau                  25000          1    25000.00\n</pre></html>', 97000, '  2024-01-04   12:23:44'),
	(1, 'Ban 5', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nVang 999                 35000000       20   700000000.00\n</pre></html>', 700000000, '  2024-01-04   12:26:42'),
	(1, 'Ban 8', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nvang 999                 2500000        15   37500000.00\n</pre></html>', 37500000, '  2024-01-04   12:30:08'),
	(1, 'Ban 15', 'Tang 2', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nTra olon                 25000          1    25000.00\nBo Huc                   25000          1    25000.00\nnuoc khoang              25000          1    25000.00\nVang 999                 2500000        1    2500000.00\n</pre></html>', 2575000, '  2024-01-04   22:05:47'),
	(1, 'Ban 3', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nCocacola                 17000          1    17000.00\nCa Vien Chien            15000          1    15000.00\nVang 999                 2500000        1    2500000.00\n</pre></html>', 2532000, '  2024-01-04   22:07:57'),
	(1, 'Ban 3', 'Tang 1', '<html><pre>Ten Mon				Gia Tien	SL	Thanh Tien\nVang 999                 2500000        1    2500000.00\nGa Vien                  25000          4    100000.00\n</pre></html>', 2600000, '  2024-01-04   22:08:31');

-- Dumping structure for table test.quanlyban
CREATE TABLE IF NOT EXISTS `quanlyban` (
  `taikhoanid` int(11) DEFAULT NULL,
  `TenBan` varchar(50) DEFAULT NULL,
  `TrangThai` varchar(50) DEFAULT NULL,
  `ViTri` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.quanlyban: ~33 rows (approximately)
REPLACE INTO `quanlyban` (`taikhoanid`, `TenBan`, `TrangThai`, `ViTri`) VALUES
	(1, 'Ban 1', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 2', 'Con Trong', 'Tang 1'),
	(1, 'Ban 3', 'Con Trong', 'Tang 1'),
	(1, 'Ban 4', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 5', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 6', 'Con Trong', 'Tang 1'),
	(1, 'Ban 7', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 8', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 9', 'Con Trong', 'Tang 1'),
	(1, 'Ban 10', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 11', 'Dang Su Dung', 'Tang 1'),
	(1, 'Ban 12', 'Con Trong', 'Tang 1'),
	(1, 'Ban 13', 'Con Trong', 'Tang 2'),
	(1, 'Ban 14', 'Dang Su Dung', 'Tang 2'),
	(1, 'Ban 15', 'Dang Su Dung', 'Tang 2'),
	(1, 'Ban 16', 'Dang Su Dung', 'Outside'),
	(1, 'Ban 17', 'Con Trong', 'Outside'),
	(1, 'Ban 18', 'Dang Su Dung', 'Outside'),
	(1, 'Ban 19', 'Dang Su Dung', 'Outside'),
	(1, 'Ban 20', 'Dang Su Dung', 'Outside'),
	(1, 'Ban 21', 'Con Trong', 'Outside'),
	(4, 'Ban 1', 'Dang Su Dung', 'Tang1'),
	(1, 'Ban 22', 'Dang Su Dung', 'Tang 3'),
	(1, 'Ban 23', 'Con Trong', 'Tang 3'),
	(1, 'Ban 24', 'Con Trong', 'Tang 3'),
	(1, 'Ban 25', 'Con Trong', 'Tang 3'),
	(1, 'Ban 26', 'Con Trong', 'Tang 3'),
	(1, 'Ban 27', 'Dang Su Dung', 'Tang 3'),
	(1, 'Ban 28', 'Dang Su Dung', 'Tang 3'),
	(1, 'Ban 29', 'Con Trong', 'Tang 3'),
	(1, 'Ban 30', 'Dang Su Dung', 'Tang 4'),
	(1, 'Ban 31', 'Con Trong', 'Tang 4'),
	(1, 'Ban 32', 'Con Trong', 'Tang 4');

-- Dumping structure for table test.sanpham
CREATE TABLE IF NOT EXISTS `sanpham` (
  `taikhoanid` int(11) DEFAULT NULL,
  `Ten` varchar(50) DEFAULT NULL,
  `LoaiSanPham` varchar(50) DEFAULT NULL,
  `GiaNhap` decimal(20,6) DEFAULT NULL,
  `GiaBan` decimal(20,6) DEFAULT NULL,
  `SL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.sanpham: ~29 rows (approximately)
REPLACE INTO `sanpham` (`taikhoanid`, `Ten`, `LoaiSanPham`, `GiaNhap`, `GiaBan`, `SL`) VALUES
	(1, 'Tra Luc Nhan', 'Tra Sua', 15000.000000, 25000.000000, 26),
	(2, 'Tra Gung', 'Tra Sua', 15000.000000, 25000.000000, 30),
	(1, 'Tra olon', 'Tra Sua', 15000.000000, 25000.000000, 27),
	(1, 'Cocacola', 'Nuoc Ngot', 12000.000000, 17000.000000, 15),
	(1, '7up', 'Nuoc Ngot', 10000.000000, 15000.000000, 19),
	(1, 'Sting', 'Nuoc Ngot', 15000.000000, 20000.000000, 27),
	(1, 'Revice', 'Nuoc Ngot', 10000.000000, 15000.000000, 31),
	(1, 'Banh Sung Bo', 'Trang Mieng', 20000.000000, 35000.000000, 27),
	(1, 'Cafe trung', 'Cafe', 15000.000000, 30000.000000, 36),
	(1, 'Cafe Xoai', 'Cafe', 20000.000000, 40000.000000, 12),
	(1, 'Cafe May', 'Cafe', 15000.000000, 25000.000000, 38),
	(1, 'Cafe Dua', 'Cafe', 15000.000000, 25000.000000, 20),
	(1, 'Tra Chanh Gia Tay', 'Do Uong Cao Cap', 15000.000000, 30000.000000, 20),
	(1, 'Bo Huc', 'Nuoc Ngot', 15000.000000, 25000.000000, 23),
	(1, 'Tra Bi Dao', 'Do Uong Cao Cap', 15000.000000, 25000.000000, 23),
	(1, 'Tra Dao Cam Sa', 'Do Uong Cao Cap', 15000.000000, 30000.000000, 21),
	(1, 'Cappuchino', 'Cafe', 20000.000000, 40000.000000, 37),
	(1, 'Ca Vien Chien', 'Do Nhau', 10000.000000, 15000.000000, 24),
	(1, 'Nem Chua Ran', 'Thuc An Nhanh', 10000.000000, 20000.000000, 18),
	(1, 'Hambuger', 'Thuc An Nhanh', 15000.000000, 30000.000000, 18),
	(1, 'Khoai Lang Lac', 'Thuc An Nhanh', 10000.000000, 20000.000000, 22),
	(1, 'Khoai Lang Nuong', 'Thuc An Nhanh', 15000.000000, 30000.000000, 17),
	(1, 'Tra Dau', 'Do Uong Cao Cap', 15000.000000, 25000.000000, 18),
	(1, 'Pizza', 'Thuc An Nhanh', 50000.000000, 75000.000000, 32),
	(1, 'Ga Vien', 'Do Nhau', 15000.000000, 25000.000000, 12),
	(1, 'Pho Mai', 'Thuc An Nhanh', 15000.000000, 35000.000000, 50),
	(4, 'pizza', 'Do an nhanh', 15000.000000, 25000.000000, 30),
	(1, 'nuoc khoang', 'Nuoc Ngot', 15000.000000, 25000.000000, 15),
	(1, 'Vang 999', 'Do Cao Cap', 1500000.000000, 2500000.000000, 82);

-- Dumping structure for table test.taikhoan
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `DoanhThu` decimal(20,6) DEFAULT NULL,
  `LoiNhuan` decimal(20,6) DEFAULT NULL,
  `DonTonKho` int(11) DEFAULT NULL,
  `DuLieuAnh` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.taikhoan: ~9 rows (approximately)
REPLACE INTO `taikhoan` (`ID`, `email`, `password`, `DoanhThu`, `LoiNhuan`, `DonTonKho`, `DuLieuAnh`) VALUES
	(1, 'test', 'test', 627271000.000000, 320105000.000000, 8, 'C:\\Users\\anhtu\\Downloads\\giaodien1.jpg'),
	(2, 'cuoiky', 'cuoiky123', 200000.000000, 90000.000000, 4, 'C:\\Users\\anhtu\\Downloads\\AnhDoanhThu (2).jpg'),
	(3, 'ktck', 'ktck123', NULL, NULL, NULL, 'C:\\Users\\anhtu\\Downloads\\giaodien1.jpg'),
	(4, 'Thinh', 'thinh123', NULL, NULL, NULL, 'C:\\Users\\anhtu\\Downloads\\giaodien3.jpg'),
	(5, 't', 't', NULL, NULL, NULL, 'C:\\Users\\anhtu\\Downloads\\giaodien3.jpg'),
	(6, 'Thaythanh', 'Thaythanh', NULL, NULL, NULL, 'C:\\Users\\anhtu\\Downloads\\giaodien1.jpg'),
	(7, 'nhat123', 'nhat123', NULL, NULL, NULL, 'C:\\Users\\anhtu\\Downloads\\giaodien3.jpg'),
	(8, 'hhh', 'hhh', NULL, NULL, NULL, NULL),
	(12, 'jjj', 'jjj', NULL, NULL, NULL, NULL);

-- Dumping structure for table test.thongtin
CREATE TABLE IF NOT EXISTS `thongtin` (
  `taikhoanid` int(11) NOT NULL,
  `ngaytaotaikhoan` varchar(50) NOT NULL DEFAULT '',
  `TenChuTaiKhoan` varchar(50) NOT NULL DEFAULT '',
  `NgaySinh` varchar(50) NOT NULL DEFAULT '',
  `Email` varchar(50) NOT NULL DEFAULT '',
  `Sdt` varchar(50) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.thongtin: ~1 rows (approximately)
REPLACE INTO `thongtin` (`taikhoanid`, `ngaytaotaikhoan`, `TenChuTaiKhoan`, `NgaySinh`, `Email`, `Sdt`) VALUES
	(1, '2024-01-04 00:39:50', 'le trung viet', '18072005', 'vit', '0702349310');

-- Dumping structure for table test.thucdon
CREATE TABLE IF NOT EXISTS `thucdon` (
  `taikhoanid` int(11) NOT NULL,
  `DanhMucThucPham` varchar(50) NOT NULL DEFAULT '',
  `NgayThang` varchar(50) DEFAULT NULL,
  `SoLuongDonHang` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table test.thucdon: ~15 rows (approximately)
REPLACE INTO `thucdon` (`taikhoanid`, `DanhMucThucPham`, `NgayThang`, `SoLuongDonHang`) VALUES
	(1, 'Tra Sua', '0', 12),
	(1, 'Nuoc Ngot', '0', 20),
	(1, 'Thuc An Nhanh', '1012023', 15),
	(1, 'Xuc Xich', '1022023', 15),
	(0, 'Ga', '24', 234),
	(1, 'Trang Mieng', '2012023', 12),
	(1, 'Mon Dac Biet', '3123', 20),
	(1, 'Do Cao Cap', '2032023', 15),
	(1, 'Cafe', '12122022', 30),
	(1, 'Mon Chay', '2122023', 30),
	(1, 'Do Uong Cao Cap', '2122023', 35),
	(1, 'Do Nhau', '12122023', 30),
	(4, 'tra sua', '25122023', 30),
	(4, 'Do an nhanh', '25122023', 30),
	(1, 'Do An Cham', '25122023', 30);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
