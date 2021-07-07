create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer
(
CID int not null auto_increment primary key,
CName nvarchar(50) not null,
CAge int
);
 create table oder
 (
 oID int not null auto_increment primary key ,
 cID int not null,
 oDate date,
 ototalPrice nvarchar(20),
 foreign key (cID) references Customer(CID)
 );
 create table orderdefaul
 (
  oID int not null,
  pID int not null,
  odQTY nvarchar(30),
  foreign key (oID) references oder(oID),
  foreign key (pID) references product(pID)
  
 );
 create table product
 (
  pID int not null auto_increment primary key ,
  pName nvarchar(50) not null,
  pPrice nvarchar(100)
 );
