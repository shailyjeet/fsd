CREATE DATABASE  IF NOT EXISTS `cheap_o_fly`;
USE `cheap_o_fly`;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;

CREATE TABLE `flights` (
  `Flight_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Source` varchar(45) DEFAULT NULL,
  `Destination` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `To_Day`  datetime DEFAULT NULL,
  `Ticket_Price` float DEFAULT NULL,  
  PRIMARY KEY (`Flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `airlines`
--

DROP TABLE IF EXISTS `airlines`;

CREATE TABLE `airlines` (
  `Air_id` int(11) NOT NULL AUTO_INCREMENT,
  `Air_Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Air_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

insert into airlines(Air_Name ) values('Luftansa');
insert into airlines(Air_Name ) values('Air India');
insert into airlines(Air_Name ) values('Air Canada');
insert into airlines(Air_Name ) values('British Airways');
insert into airlines(Air_Name ) values('Delta Airlines');
insert into airlines(Air_Name ) values('Fly Emirates');
insert into airlines(Air_Name ) values('Air France');


--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `Admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(15) NOT NULL,
  `Password` varchar(15)  NOT NULL,
  PRIMARY KEY(`Admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into admin(Username, Password )       values('cheap_o_user','cheap_o_pass');
insert into admin(Username, Password )       values('root','root');

--
-- Table structure for table `payments`
--

DROP TABLE IF EXISTS `payments`;

CREATE TABLE `payments` (
  `Card_Name` varchar(45) NOT NULL,
  `Card_Number` varchar(20)  NOT NULL,
  `CVV` varchar(3)  NOT NULL,
  `Expiration_Date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `places`
--

CREATE TABLE `places` (
  `place_id` int(11) NOT NULL AUTO_INCREMENT,
  `source` varchar(25) NOT NULL,
  `destination` varchar(25)  NOT NULL,
  PRIMARY KEY(`place_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into places(source, destination ) values('INDIA','USA');
insert into places(source, destination ) values('INDIA','UK');
insert into places(source, destination ) values('INDIA','AUSTRALIA');
insert into places(source, destination ) values('INDIA','CANADA');
insert into places(source, destination ) values('UK','INDIA');
insert into places(source, destination ) values('AUSTRALIA','INDIA');
insert into places(source, destination ) values('CANADA','INDIA');
insert into places(source, destination ) values('UAE','INDIA');
