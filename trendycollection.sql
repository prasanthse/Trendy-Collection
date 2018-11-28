-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2018 at 03:47 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trendycollection`
--

-- --------------------------------------------------------

--
-- Table structure for table `accessories`
--

CREATE TABLE `accessories` (
  `ItemCode` varchar(200) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accessories`
--

INSERT INTO `accessories` (`ItemCode`, `ItemName`, `Price`) VALUES
('TRCLAG001', 'GENTS SUN GLASSES', 4500),
('TRCLAGB1', 'GENTS BRACELET', 5000),
('TRCLAGW1', 'GENTS WALLAT', 2500),
('TRCLAH001', 'Unisex Hat', 1090),
('TRCLALB1', 'LADIES BRACELET', 7500),
('TRCLALW1', 'LADIES WALLAT', 4800);

-- --------------------------------------------------------

--
-- Table structure for table `gentsitems`
--

CREATE TABLE `gentsitems` (
  `ItemCode` varchar(200) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gentsitems`
--

INSERT INTO `gentsitems` (`ItemCode`, `ItemName`, `Price`) VALUES
('TRCGB001', 'GENTS OFFICE BAG', 3290),
('TRCLGC001', 'MENS CAP', 990),
('TRCLGD001', 'GENTS DENIM', 3500),
('TRCLGLS001', 'LINEN SHIRT', 2390),
('TRCLGS001', 'CASUAL SHIRT', 2190),
('TRCLGSH01', 'CASUAL SHOES', 2500),
('TRCLGSH02', 'OFFICE SHOES', 3500),
('TRCLGT001', 'T- SHIRT', 690),
('TRCLGT002', 'T- SHIRT', 750),
('TRCLGTB01', 'TRACK BOTTOM', 990);

-- --------------------------------------------------------

--
-- Table structure for table `kidsitems`
--

CREATE TABLE `kidsitems` (
  `ItemCode` varchar(200) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kidsitems`
--

INSERT INTO `kidsitems` (`ItemCode`, `ItemName`, `Price`) VALUES
('TRCLBBP01', 'BOYS BACK-PACK', 2850),
('TRCLGBP01', 'GIRLS BACK-PACK', 2100),
('TRCLKBP01', 'BABY PILLOW', 1990),
('TRCLKBS01', 'BOYS SHIRT', 1490),
('TRCLKF001', 'GIRLS FROCK', 2190);

-- --------------------------------------------------------

--
-- Table structure for table `ladiesitems`
--

CREATE TABLE `ladiesitems` (
  `ItemCode` varchar(200) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ladiesitems`
--

INSERT INTO `ladiesitems` (`ItemCode`, `ItemName`, `Price`) VALUES
('TRCLB0001', 'LADIES HAND BAGS', 2590),
('TRCLJ001', 'LADIES JEANS', 1990),
('TRCLLD001', 'LONG DRESS', 1650),
('TRCLLS001', 'LONG SKIRT', 1690),
('TRCLS0001', 'LADIES CASUAL SHOES', 1890),
('TRCLS0002', 'LADIES CASUAL SHOES', 1990),
('TRCLSH001', 'LADIES SHOES', 2000),
('TRCLSL001', 'LADIES SLIPPERS', 510.25),
('TRCLT0001', 'LADIES T SHIRT ( with collar)', 750),
('TRCLT002', 'LADIES T SHIRT (collarless)', 800);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `ItemCode` varchar(200) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Price` float NOT NULL,
  `TotalPrice` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accessories`
--
ALTER TABLE `accessories`
  ADD PRIMARY KEY (`ItemCode`);

--
-- Indexes for table `gentsitems`
--
ALTER TABLE `gentsitems`
  ADD PRIMARY KEY (`ItemCode`);

--
-- Indexes for table `kidsitems`
--
ALTER TABLE `kidsitems`
  ADD PRIMARY KEY (`ItemCode`);

--
-- Indexes for table `ladiesitems`
--
ALTER TABLE `ladiesitems`
  ADD PRIMARY KEY (`ItemCode`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`ItemCode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
