use dmab0920_1086245

create table staff(
staffid int identity(1,1) not null,
name varchar(10) not null, 
password varchar(20) not null,
primary key (staffid)
)

create table orders(
orderid int identity(1,1) not null, 
deliveryinfo varchar(50),
type varchar (15),
quantity int not null,
staffid_packager int, 
staffid_plucked int, 
primary key (orderid),
foreign key(staffid_packager) references staff(staffid),
foreign key(staffid_plucked) references staff(staffid),
) 
create table Orderline(
orderlineid int identity (1,1), 
amountofproducts int, 
totalpriceofProducts int, 
orderid int, 
primary key(orderlineid),
foreign key (orderid) references orders(orderid),

)

create table product(
productnumber int identity(1,1) not null, 
name varchar(15) not null, 
price int not null, 
size varchar(15) not null, 
description varchar(50) not null, 
stock int not null,
material varchar(10), 
color varchar(10), 
style varchar(10),  
type varchar(10),
acc_material varchar(10),
acc_color varchar(15), 
primary key(productnumber),
)

create table location(
locationid int identity(1,1) not null,
productnumber int not null,
primary key(locationid),
foreign key(productnumber) references product(productnumber),
)

create table locationline(
amountOFLocations int,
productnumber int not null,
locationid int not null,
foreign key(productnumber) references product(productnumber),
foreign key(locationid) references location(locationid),
)



