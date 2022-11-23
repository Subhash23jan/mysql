create database sbi123;
use sbi123;
create table branch(
name varchar(20) primary key,
city varchar(20),
assets real);
create table bank_Account(
account_no int,
branch_name varchar(20) , balance real,
primary key(account_no,branch_name),
foreign key(branch_name) references branch(name));
create table customer(
customer_name varchar(20),
customer_street varchar(20),
city varchar(20));
alter table customer
add primary key(customer_name);
create table depositor(
customer_name varchar(20),
account_no int,
primary key(customer_name,account_no),
foreign key(customer_name) references customer(customer_name) on delete cascade,
foreign key(account_no) references bank_account(account_no) on delete cascade);
create table loan(
loan_no int , branch_name varchar(20) primary key,amount real,
foreign key(branch_name) references branch(name));
select *from customer;
insert into branch values ('SBI_Chamarajpet','Bengalore',50000),('SBI_ResidencyRoad','Bengalore',10000),('SBI_ShivajiRoad','Bengalore',20000),
('SBI_ParlimentRoad','Delhi',10000),('SBI_Jantarmantar','Delhi',20000);
insert into bank_account values (1,'SBI_Chamarajpet',2000),(2,'SBI_ResidencyRoad',5000),(3,'SBI_ShivajiRoad',6000),(4,'SBI_ParlimentRoad',9000),
(5,'SBI_Jantarmantar',8000),(6,'SBI_ShivajiRoad',4000),(8,'SBI_ResidencyRoad',4000),(9,'SBI_ParlimentRoad',3000),(10,'SBI_ResidencyRoad',5000),
(11,'SBI_Jantarmantar',2000);
insert into customer values ('Avinash','Bull_Temple_Road','Bangalore'),('Dinesh','Bannergatta_Road','Bangalore'),('Mohan','NationalCollege_Road','Bangalore'),
('Nikil','Akbar_Road','Delhi'),('Ravi','Prithviraj_Road','Delhi');
insert into depositor values('Avinash',1),('Dinesh',2),('Nikil',4),('Ravi',5),
('Avinash',8),('Nikil',9),('Dinesh',10),('Nikil',11);
insert into loan values(1,'SBI_Chamarajpet',1000),(2,'SBI_ResidencyRoad',2000),(3,'SBI_ShivajiRoad',3000),
(4,'SBI_ParlimentRoad',4000),(5,'SBI_Jantarmantar',5000);
   

