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

insert into flights(Name, Source, Destinatio7n, email, To_Day, Ticket_Price)
		values ('Air Canada','BOMBAY','NEW YORK','frontdesk@aircanada.com','2021-09-01 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','BOMBAY','LONDON','frontdesk@britishairways.com','2021-09-01 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','BOMBAY','ABU DHABI','frontdesk@flyemirates.com','2021-09-01 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','BOMBAY','TORANTO','frontdesk@deltaairlines.com','2021-09-01 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','BOMBAY','SYDNEY','frontdesk@airfrance.com','2021-09-01 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','HYDRABAD','NEW YORK','frontdesk@aircanada.com','2021-09-02 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','HYDRABAD','LONDON','frontdesk@britishairways.com','2021-09-02 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','HYDRABAD','ABU DHABI','frontdesk@flyemirates.com','2021-09-02 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','HYDRABAD','TORANTO','frontdesk@deltaairlines.com','2021-09-02 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','HYDRABAD','SYDNEY','frontdesk@airfrance.com','2021-09-02 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','CHENNAI','NEW YORK','frontdesk@aircanada.com','2021-09-03 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','CHENNAI','LONDON','frontdesk@britishairways.com','2021-09-03 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','CHENNAI','ABU DHABI','frontdesk@flyemirates.com','2021-09-03 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','CHENNAI','TORANTO','frontdesk@deltaairlines.com','2021-09-03 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','CHENNAI','SYDNEY','frontdesk@airfrance.com','2021-09-03 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','KOLKOTA','NEW YORK','frontdesk@aircanada.com','2021-09-04 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','KOLKOTA','LONDON','frontdesk@britishairways.com','2021-09-04 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','KOLKOTA','ABU DHABI','frontdesk@flyemirates.com','2021-09-04 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','KOLKOTA','TORANTO','frontdesk@deltaairlines.com','2021-09-04 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','KOLKOTA','SYDNEY','frontdesk@airfrance.com','2021-09-04 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','NEW DELHI','NEW YORK','frontdesk@aircanada.com','2021-09-05 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','NEW DELHI','LONDON','frontdesk@britishairways.com','2021-09-05 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','NEW DELHI','ABU DHABI','frontdesk@flyemirates.com','2021-09-05 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','NEW DELHI','TORANTO','frontdesk@deltaairlines.com','2021-09-05 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','NEW DELHI','SYDNEY','frontdesk@airfrance.com','2021-09-05 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','NEW YORK','BOMBAY','frontdesk@aircanada.com','2021-09-06 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','NEW YORK','HYDRABAD','frontdesk@britishairways.com','2021-09-06 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','NEW YORK','CHENNAI','frontdesk@flyemirates.com','2021-09-06 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','NEW YORK','KOLKOTA','frontdesk@deltaairlines.com','2021-09-06 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','NEW YORK','NEW DELHI','frontdesk@airfrance.com','2021-09-06 00:00:00',100.00);		
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','LONDON','BOMBAY','frontdesk@aircanada.com','2021-09-07 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','LONDON','HYDRABAD','frontdesk@britishairways.com','2021-09-07 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','LONDON','CHENNAI','frontdesk@flyemirates.com','2021-09-07 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','LONDON','KOLKOTA','frontdesk@deltaairlines.com','2021-09-07 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','LONDON','NEW DELHI','frontdesk@airfrance.com','2021-09-07 00:00:00',100.00);		
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','ABU DHABI','BOMBAY','frontdesk@aircanada.com','2021-09-08 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','ABU DHABI','HYDRABAD','frontdesk@britishairways.com','2021-09-08 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','ABU DHABI','CHENNAI','frontdesk@flyemirates.com','2021-09-08 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','ABU DHABI','KOLKOTA','frontdesk@deltaairlines.com','2021-09-08 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','ABU DHABI','NEW DELHI','frontdesk@airfrance.com','2021-09-08 00:00:00',100.00);		
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','TORANTO','BOMBAY','frontdesk@aircanada.com','2021-09-09 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','TORANTO','HYDRABAD','frontdesk@britishairways.com','2021-09-09 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','TORANTO','CHENNAI','frontdesk@flyemirates.com','2021-09-09 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','TORANTO','KOLKOTA','frontdesk@deltaairlines.com','2021-09-09 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','TORANTO','NEW DELHI','frontdesk@airfrance.com','2021-09-09 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','SYDNEY','BOMBAY','frontdesk@aircanada.com','2021-09-10 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','SYDNEY','HYDRABAD','frontdesk@britishairways.com','2021-09-10 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','SYDNEY','CHENNAI','frontdesk@flyemirates.com','2021-09-10 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','SYDNEY','KOLKOTA','frontdesk@deltaairlines.com','2021-09-10 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','SYDNEY','NEW DELHI','frontdesk@airfrance.com','2021-09-10 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','BOMBAY','NEW YORK','frontdesk@aircanada.com','2021-09-11 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','BOMBAY','LONDON','frontdesk@britishairways.com','2021-09-11 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','BOMBAY','ABU DHABI','frontdesk@flyemirates.com','2021-09-11 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','BOMBAY','TORANTO','frontdesk@deltaairlines.com','2021-09-11 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','BOMBAY','SYDNEY','frontdesk@airfrance.com','2021-09-11 00:00:00',100.00);			
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','HYDRABAD','NEW YORK','frontdesk@aircanada.com','2021-09-12 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','HYDRABAD','LONDON','frontdesk@britishairways.com','2021-09-12 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','HYDRABAD','ABU DHABI','frontdesk@flyemirates.com','2021-09-12 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','HYDRABAD','TORANTO','frontdesk@deltaairlines.com','2021-09-12 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','HYDRABAD','SYDNEY','frontdesk@airfrance.com','2021-09-12 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','CHENNAI','NEW YORK','frontdesk@aircanada.com','2021-09-13 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','CHENNAI','LONDON','frontdesk@britishairways.com','2021-09-13 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','CHENNAI','ABU DHABI','frontdesk@flyemirates.com','2021-09-13 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','CHENNAI','TORANTO','frontdesk@deltaairlines.com','2021-09-13 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','CHENNAI','SYDNEY','frontdesk@airfrance.com','2021-09-13 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','KOLKOTA','NEW YORK','frontdesk@aircanada.com','2021-09-14 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','KOLKOTA','LONDON','frontdesk@britishairways.com','2021-09-14 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','KOLKOTA','ABU DHABI','frontdesk@flyemirates.com','2021-09-14 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','KOLKOTA','TORANTO','frontdesk@deltaairlines.com','2021-09-14 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','KOLKOTA','SYDNEY','frontdesk@airfrance.com','2021-09-14 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','NEW DELHI','NEW YORK','frontdesk@aircanada.com','2021-09-15 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','NEW DELHI','LONDON','frontdesk@britishairways.com','2021-09-15 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','NEW DELHI','ABU DHABI','frontdesk@flyemirates.com','2021-09-15 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','NEW DELHI','TORANTO','frontdesk@deltaairlines.com','2021-09-15 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','NEW DELHI','SYDNEY','frontdesk@airfrance.com','2021-09-15 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','NEW YORK','BOMBAY','frontdesk@aircanada.com','2021-09-16 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','NEW YORK','HYDRABAD','frontdesk@britishairways.com','2021-09-16 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','NEW YORK','CHENNAI','frontdesk@flyemirates.com','2021-09-16 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','NEW YORK','KOLKOTA','frontdesk@deltaairlines.com','2021-09-16 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','NEW YORK','NEW DELHI','frontdesk@airfrance.com','2021-09-16 00:00:00',100.00);		
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','LONDON','BOMBAY','frontdesk@aircanada.com','2021-09-17 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','LONDON','HYDRABAD','frontdesk@britishairways.com','2021-09-17 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','LONDON','CHENNAI','frontdesk@flyemirates.com','2021-09-17 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','LONDON','KOLKOTA','frontdesk@deltaairlines.com','2021-09-17 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','LONDON','NEW DELHI','frontdesk@airfrance.com','2021-09-17 00:00:00',100.00);		
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','ABU DHABI','BOMBAY','frontdesk@aircanada.com','2021-09-18 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','ABU DHABI','HYDRABAD','frontdesk@britishairways.com','2021-09-18 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','ABU DHABI','CHENNAI','frontdesk@flyemirates.com','2021-09-18 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','ABU DHABI','KOLKOTA','frontdesk@deltaairlines.com','2021-09-18 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','ABU DHABI','NEW DELHI','frontdesk@airfrance.com','2021-09-18 00:00:00',100.00);		
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','TORANTO','BOMBAY','frontdesk@aircanada.com','2021-09-19 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','TORANTO','HYDRABAD','frontdesk@britishairways.com','2021-09-19 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','TORANTO','CHENNAI','frontdesk@flyemirates.com','2021-09-19 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','TORANTO','KOLKOTA','frontdesk@deltaairlines.com','2021-09-19 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','TORANTO','NEW DELHI','frontdesk@airfrance.com','2021-09-19 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air Canada','SYDNEY','BOMBAY','frontdesk@aircanada.com','2021-09-20 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('British Airways','SYDNEY','HYDRABAD','frontdesk@britishairways.com','2021-09-20 00:00:00',100.00);        
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Fly Emirates','SYDNEY','CHENNAI','frontdesk@flyemirates.com','2021-09-20 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Delta Airlines','SYDNEY','KOLKOTA','frontdesk@deltaairlines.com','2021-09-20 00:00:00',100.00);
insert into flights(Name, Source, Destination, email, To_Day, Ticket_Price)
		values ('Air France','SYDNEY','NEW DELHI','frontdesk@airfrance.com','2021-09-20 00:00:00',100.00);


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

insert into places (source, destination) values ('BOMBAY','NEW YORK');
insert into places (source, destination) values ('BOMBAY','LONDON');
insert into places (source, destination) values ('BOMBAY','ABU DHABI');
insert into places (source, destination) values ('BOMBAY','TORANTO');
insert into places (source, destination) values ('BOMBAY','SYDNEY');

insert into places (source, destination) values ('HYDRABAD','NEW YORK');
insert into places (source, destination) values ('HYDRABAD','LONDON');
insert into places (source, destination) values ('HYDRABAD','ABU DHABI');
insert into places (source, destination) values ('HYDRABAD','TORANTO');
insert into places (source, destination) values ('HYDRABAD','SYDNEY');


insert into places (source, destination) values ('CHENNAI','NEW YORK');
insert into places (source, destination) values ('CHENNAI','LONDON');
insert into places (source, destination) values ('CHENNAI','ABU DHABI');
insert into places (source, destination) values ('CHENNAI','TORANTO');
insert into places (source, destination) values ('CHENNAI','SYDNEY');

insert into places (source, destination) values ('KOLKOTA','NEW YORK');
insert into places (source, destination) values ('KOLKOTA','LONDON');
insert into places (source, destination) values ('KOLKOTA','ABU DHABI');
insert into places (source, destination) values ('KOLKOTA','TORANTO');
insert into places (source, destination) values ('KOLKOTA','SYDNEY');

insert into places (source, destination) values ('NEW DELHI','NEW YORK');
insert into places (source, destination) values ('NEW DELHI','LONDON');
insert into places (source, destination) values ('NEW DELHI','ABU DHABI');
insert into places (source, destination) values ('NEW DELHI','TORANTO');
insert into places (source, destination) values ('NEW DELHI','SYDNEY');

insert into places (source, destination) values ('NEW YORK','BOMBAY');
insert into places (source, destination) values ('NEW YORK','HYDRABAD');
insert into places (source, destination) values ('NEW YORK','CHENNAI');
insert into places (source, destination) values ('NEW YORK','KOLKOTA');
insert into places (source, destination) values ('NEW YORK','NEW DELHI');

insert into places (source, destination) values ('LONDON','BOMBAY');
insert into places (source, destination) values ('LONDON','HYDRABAD');
insert into places (source, destination) values ('LONDON','CHENNAI');
insert into places (source, destination) values ('LONDON','KOLKOTA');
insert into places (source, destination) values ('LONDON','NEW DELHI');

insert into places (source, destination) values ('ABU DHABI','BOMBAY');
insert into places (source, destination) values ('ABU DHABI','HYDRABAD');
insert into places (source, destination) values ('ABU DHABI','CHENNAI');
insert into places (source, destination) values ('ABU DHABI','KOLKOTA');
insert into places (source, destination) values ('ABU DHABI','NEW DELHI');

insert into places (source, destination) values ('TORANTO','BOMBAY');
insert into places (source, destination) values ('TORANTO','HYDRABAD');
insert into places (source, destination) values ('TORANTO','CHENNAI');
insert into places (source, destination) values ('TORANTO','KOLKOTA');
insert into places (source, destination) values ('TORANTO','NEW DELHI');

insert into places (source, destination) values ('SYDNEY','BOMBAY');
insert into places (source, destination) values ('SYDNEY','HYDRABAD');
insert into places (source, destination) values ('SYDNEY','CHENNAI');
insert into places (source, destination) values ('SYDNEY','KOLKOTA');
insert into places (source, destination) values ('SYDNEY','NEW DELHI');
