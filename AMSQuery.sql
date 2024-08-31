
create database if not exists airlinesManagementSystem;
use airlinesManagementSystem;

-- create table for admin login --
create table if not exists adminlogin(
id int primary key,
name varchar(200),
username varchar(50),
password varchar(50)
);

-- insert data in table adminlogin --
insert into adminlogin(id, name, username, password) values (1, 'Kirti', 'admin', '123456');
select * from adminlogin;

-- create table for flight --
create table flights(
flight_code varchar(100) primary key,
flight_name varchar(200),
capacity varchar(200)
);

-- create table for flight details --
create table flightDetails(
id int primary key auto_increment,
flight_code varchar(200),
source varchar(100),
destination varchar(100),
class_name varchar(100),
price varchar(50),
depart_time varchar(50),
arrival_time varchar(50),
foreign key(flight_code) references flights(flight_code)
);


-- table for employee --
create table if not exists employee(
id int primary key auto_increment,
username varchar(50),
empname varchar(100),
email varchar(100),
phone varchar(15),
gender varchar(10),
dob varchar(20),
password varchar(50)
);

-- table for passenger --
create table if not exists passenger(
userid varchar(20) primary key,
name varchar(200),
gender varchar(20),
dob varchar(20),
phone varchar(15),
email varchar(50),
address varchar(200),
nationality varchar(50),
passport_no varchar(50) not null unique
);

-- table for booking ticket --
create table bookFlight(
ticket_id varchar(50) primary key,
user_id varchar(50),
name varchar(100),
flight_code varchar(50),
flight_name varchar(50),
source varchar(50),
destination varchar(50),
class varchar(20),
price varchar(100),
journey_date varchar(20),
depart_time varchar(20),
arrival_time varchar(20),
status varchar(10),
foreign key(user_id) references passenger(userid)
);