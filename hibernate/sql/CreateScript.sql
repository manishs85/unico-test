
CREATE DATABASE `unico` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `request` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NUM1` int(11) NOT NULL,
  `NUM2` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

CREATE TABLE `gcd` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `gcd` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

