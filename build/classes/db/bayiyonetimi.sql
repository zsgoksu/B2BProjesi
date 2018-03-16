/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 100129
 Source Host           : localhost:3306
 Source Schema         : bayiyonetimi

 Target Server Type    : MySQL
 Target Server Version : 100129
 File Encoding         : 65001

 Date: 09/01/2018 02:59:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bayiler
-- ----------------------------
DROP TABLE IF EXISTS `bayiler`;
CREATE TABLE `bayiler`  (
  `tedarikciId` int(11) NOT NULL AUTO_INCREMENT,
  `tedarikciFirma` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciYetkili` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciFax` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciCep` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciEposta` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciLimit` decimal(10, 2) NULL DEFAULT NULL,
  `tedarikciBakiye` decimal(10, 2) NULL DEFAULT NULL,
  `tedarikciVergiDairesi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciVergiNo` varchar(20) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciAdres` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciIl` tinyint(255) NULL DEFAULT NULL,
  `tedarikciIlce` smallint(255) NULL DEFAULT NULL,
  `tedarikciGrup` smallint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`tedarikciId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bayisiparisler
-- ----------------------------
DROP TABLE IF EXISTS `bayisiparisler`;
CREATE TABLE `bayisiparisler`  (
  `satisId` int(11) NOT NULL AUTO_INCREMENT,
  `siparisTedarikciId` int(11) NULL DEFAULT NULL,
  `siparisAciklama` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `siparisTarihi` date NULL DEFAULT NULL,
  `siparisOdemeTarihi` date NULL DEFAULT NULL,
  `siparisPesinat` decimal(10, 2) NULL DEFAULT NULL,
  `siparisTamamiPesin` binary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`satisId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for carigruplari
-- ----------------------------
DROP TABLE IF EXISTS `carigruplari`;
CREATE TABLE `carigruplari`  (
  `grupId` int(11) NOT NULL,
  `tedarikci` binary(255) NULL DEFAULT NULL,
  `bayi` binary(255) NULL DEFAULT NULL,
  `grupAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`grupId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for firmaayarlar
-- ----------------------------
DROP TABLE IF EXISTS `firmaayarlar`;
CREATE TABLE `firmaayarlar`  (
  `firmaAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaUnvan` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaFax` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaCep` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaEposta` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaWeb` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaSehir` tinyint(255) NULL DEFAULT NULL,
  `firmaVergiDairesi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaVergiNo` varchar(30) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaAcikAdres` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `firmaFaturaSeriNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for giderler
-- ----------------------------
DROP TABLE IF EXISTS `giderler`;
CREATE TABLE `giderler`  (
  `giderId` int(11) NOT NULL,
  `giderAciklama` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `giderKategori` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `giderTutar` decimal(10, 2) NULL DEFAULT NULL,
  `giderTarih` date NULL DEFAULT NULL,
  `giderTeklifId` int(11) NULL DEFAULT NULL,
  `giderKasaId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`giderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for harcamagruplari
-- ----------------------------
DROP TABLE IF EXISTS `harcamagruplari`;
CREATE TABLE `harcamagruplari`  (
  `grupId` int(11) NOT NULL,
  `harcamaAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`grupId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for il
-- ----------------------------
DROP TABLE IF EXISTS `il`;
CREATE TABLE `il`  (
  `il_id` int(2) NOT NULL COMMENT 'plaka kodu',
  `il_adi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`il_id`) USING BTREE,
  INDEX `il_adi`(`il_adi`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ilce
-- ----------------------------
DROP TABLE IF EXISTS `ilce`;
CREATE TABLE `ilce`  (
  `ilce_id` int(10) NOT NULL AUTO_INCREMENT,
  `il_id` int(2) NOT NULL COMMENT 'il plaka kodu',
  `ilce_adi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`ilce_id`) USING BTREE,
  INDEX `il_id`(`il_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 958 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kampanyalar
-- ----------------------------
DROP TABLE IF EXISTS `kampanyalar`;
CREATE TABLE `kampanyalar`  (
  `kampanyaId` int(11) NOT NULL,
  `kampanyaUrunId` int(11) NULL DEFAULT NULL,
  `kampanyaUrunKatergoriId` int(11) NULL DEFAULT NULL,
  `kampanyaUrunMarkaId` int(11) NULL DEFAULT NULL,
  `kampanyaKullaniciGrupId` int(11) NULL DEFAULT NULL,
  `kampanyaKullaniciId` int(11) NULL DEFAULT NULL,
  `kampanyaAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `kampanyaBaslangicTarihi` date NULL DEFAULT NULL,
  `kampanyaBitisTarihi` date NULL DEFAULT NULL,
  `kampanyaStokSiniri` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`kampanyaId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for kullanicilar
-- ----------------------------
DROP TABLE IF EXISTS `kullanicilar`;
CREATE TABLE `kullanicilar`  (
  `kullaniciId` int(11) NOT NULL,
  `kullaniciSifre` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `rolBayiIslemleri` binary(255) NULL DEFAULT NULL,
  `rolPersonelIslemleri` binary(255) NULL DEFAULT NULL,
  `rolTedarikciIslemleri` binary(255) NULL DEFAULT NULL,
  `rolUrunIslemleri` binary(255) NULL DEFAULT NULL,
  `rolKampanyalar` binary(255) NULL DEFAULT NULL,
  `rolGiderler` binary(255) NULL DEFAULT NULL,
  `rolKasaIslemleri` binary(255) NULL DEFAULT NULL,
  `rolRaporlar` binary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`kullaniciId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for personelbilgi
-- ----------------------------
DROP TABLE IF EXISTS `personelbilgi`;
CREATE TABLE `personelbilgi`  (
  `personelId` int(11) NOT NULL AUTO_INCREMENT,
  `personelTC` varchar(11) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `personelAdi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `personelAdres` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `personelEposta` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `personelTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `personelMaas` decimal(9, 2) NULL DEFAULT NULL,
  `personelMesaiUcreti` decimal(9, 2) NULL DEFAULT NULL,
  `personelIL` tinyint(255) NULL DEFAULT NULL,
  `personelIlce` smallint(255) NULL DEFAULT NULL,
  `personelBaslamaTarihi` date NULL DEFAULT NULL,
  `personelAyrilmaTarihi` date NULL DEFAULT NULL,
  PRIMARY KEY (`personelId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tedarikciler
-- ----------------------------
DROP TABLE IF EXISTS `tedarikciler`;
CREATE TABLE `tedarikciler`  (
  `tedarikciId` int(11) NOT NULL AUTO_INCREMENT,
  `tedarikciFirma` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciYetkili` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciFax` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciCep` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciEposta` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciLimit` decimal(10, 2) NULL DEFAULT NULL,
  `tedarikciBakiye` decimal(10, 2) NULL DEFAULT NULL,
  `tedarikciVergiDairesi` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciVergiNo` varchar(20) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciAdres` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `tedarikciIl` tinyint(255) NULL DEFAULT NULL,
  `tedarikciIlce` smallint(255) NULL DEFAULT NULL,
  `tedarikciGrup` smallint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`tedarikciId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tedariksiparisler
-- ----------------------------
DROP TABLE IF EXISTS `tedariksiparisler`;
CREATE TABLE `tedariksiparisler`  (
  `satisId` int(11) NOT NULL AUTO_INCREMENT,
  `siparisTedarikciId` int(11) NULL DEFAULT NULL,
  `siparisAciklama` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `siparisTarihi` date NULL DEFAULT NULL,
  `siparisOdemeTarihi` date NULL DEFAULT NULL,
  `siparisPesinat` decimal(10, 2) NULL DEFAULT NULL,
  `siparisTamamiPesin` binary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`satisId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for teklifler
-- ----------------------------
DROP TABLE IF EXISTS `teklifler`;
CREATE TABLE `teklifler`  (
  `teklifId` int(11) NOT NULL AUTO_INCREMENT,
  `teklifTedarikciId` int(11) NULL DEFAULT NULL,
  `teklifAciklama` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `teklifTarihi` date NULL DEFAULT NULL,
  `teklifOdemeTarihi` date NULL DEFAULT NULL,
  `teklifPesinat` decimal(10, 2) NULL DEFAULT NULL,
  `teklifTamamiPesin` binary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`teklifId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Procedure structure for birimGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `birimGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `birimGetir`(IN `sube` int,IN `kor` int)
BEGIN
	SELECT * FROM birimler WHERE subeId=sube and kordinatorlukId=kor;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for ilceGetir

-- ----------------------------
DROP PROCEDURE IF EXISTS `ilceGetir\r\n`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ilceGetir
`(IN `il` int)
BEGIN
	SELECT*from ilce where ilid=il;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for ilceGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `ilceGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ilceGetir`(IN `il` int)
BEGIN
	SELECT*from ilce where il_id=il;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for korGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `korGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `korGetir`(IN `sube` int)
BEGIN
	SELECT*FROM kordinatorluk WHERE subeId=sube;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for koyGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `koyGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `koyGetir`(IN `il` int,IN `ilce` int)
BEGIN

SELECT*FROM mahalle where il_id=il and ilce_id=ilce;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc`(IN `il` int,IN `ilce` int)
BEGIN

SELECT*FROM mahalle where il_id=il and ilce_id=ilce;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for tumVeriGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `tumVeriGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tumVeriGetir`()
BEGIN
	SELECT p.pid, p.padi, p.psoyadi, p.pmeslek, d.dadi, s.sadi FROM personeller AS p
	INNER JOIN departmanlar AS d ON d.did = p.pdid
	INNER JOIN subeler AS s ON s.sid = p.psid
	WHERE p.pdurum = 0
	ORDER BY p.pid ASC;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for veriGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `veriGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `veriGetir`(IN `adi` varchar(255),IN `soyadi` varchar(255),IN `meslek` varchar(255),IN `departman` int,IN `sube` int,IN ayrilan int)
BEGIN
	SELECT p.pid, p.padi, p.psoyadi, p.pmeslek, d.dadi, s.sadi FROM personeller AS p
	INNER JOIN departmanlar AS d ON d.did = p.pdid
	INNER JOIN subeler AS s ON s.sid = p.psid
	WHERE p.padi LIKE CONCAT('%', adi, '%')
	AND p.pmeslek LIKE CONCAT('%', meslek, '%')
	AND p.pdid = departman
	AND p.psid = sube
	AND p.pdurum = ayrilan;
	

END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
