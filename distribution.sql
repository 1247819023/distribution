create table Customer
(
	cul_id varchar(20) primary key,
	customer_name varchar(20),
	customer_psd varchar(20),
	customer_sex char(10),
	brithday datetime,
	tel varchar(20),
	address varchar(20),
	Comment varchar(100)
);

insert into Customer values
('1001','梁光健','123456','男','1999-09-02','13481297235','广东珠海',''),
('1002','张东明','123456','男','1998-06-01','13474787235','广东珠海',''),
('1003','刘志翔','123456','男','1997-08-05','13413467235','广东珠海','')
create table Privance(
	province_id varchar(20) primary key,
	province_name varchar(20)
);
insert into Privance values('1001','广东'),('1002','广西'),('1003','福建')
create table City(
	city_id varchar(20) primary key,
	province_id varchar(20) references Province(province_id),
	city_name varchar(20),
	province_name varchar(20)
);
insert into City values('1001','1001','珠海','广东'),('1002','1002','来宾','广西'),('1003','1003','福州','福建')
create table Route(
	route_id varchar(20) primary key,
	city_id varchar(20) references City(city_id),
	province_id varchar(20) references Privance(province_id),
	route_name varchar(20),
	start_province varchar(20),
	start_city varchar(20),
	end_province varchar(20),
	end_city varchar(20),
	mid_province varchar(20),
	mid_city varchar(20),
	tran_sport_price decimal(20),
	Comment varchar(100)
);

insert into Route values
('1001','1001','1001','齐旺达','广东','广州','广东','珠海','广东','中山',98.0,''),
('1002','1002','1002','埃迪安','广东','广州','广东','珠海','广东','中山',98.0,''),
('1003','1003','1003','枫树湾','广东','广州','广东','珠海','广东','中山',98.0,'')

create table Car(
	car_id varchar(20) primary key,
	route_id varchar(20) references Route(route_id),
	car_type varchar(20),
	car_orgin varchar(20),
	car_prodate datetime,
	car_buydate datetime,
	car_capacity int,
	car_state bit,
	Comment varchar(100)
);


insert into Car values
('1001','1001','飞机','广州','2018-10-10','2018-10-15',1,1,''),
('1002','1002','动车','福州','2018-10-12','2018-10-17',1,1,''),
('1003','1003','高铁','北京','2018-10-16','2018-10-23',1,1,'')

create table Role(
	role_id varchar(20) primary key,
	role_name varchar(20),
	Comment varchar(100)
);
insert into Role values('1001','梁光健',''),('1002','张东明',''),('1003','刘志翔','')

create table Manager(
	mgl_id varchar(20) primary key,
	role_id varchar(20) references Role(role_id),
	manager_name varchar(20),
	manager_psd varchar(20),
	manager_sex char(10),
	tel varchar(20),
	address varchar(50),
	Comment varchar(100)
);

insert into Manager values('1001','1001','狗子','123456','男','18437385021','广西来宾',''),
('1002','1002','狗子','123456','男','18484725021','广西来宾',''),
('1003','1003','狗子','123456','男','18475825021','福建泉州','')

create table DeliveryPlace(
	dep_id varchar(20) primary key,
	mgl_id varchar(20) references Manager(mgl_id),
	dep_name varchar(20),
	province_name varchar(20),
	city_name varchar(20),
	mg_name varchar(20),
	dep_tel varchar(20),
	dep_addr varchar(20),
	Comment varchar(100)
);

insert into DeliveryPlace values('1001','1001','来宾市第一中学','广西','来宾','狗子','18458305932','广西来宾',''),
('1002','1002','来宾市第二中学','广西','来宾','狗子','18484635932','广西来宾',''),
('1003','1003','福州市第一中学','福建','福州','狗子','18447365932','福建福州','')

create table DeliveryRange(
	range_id varchar(20) primary key,
	dep_id varchar(20) references DeliveryPlace(dep_id),
	area_id varchar(20) references CityArea(area_id),
	range_name varchar(20),
	delivary_price decimal(20),
	Comment varchar(100)
);

insert into DeliveryRange values('1001','1001','1001','支付宝',90,''),('1002','1002','1002','微信',90,''),
('1003','1003','1003','银行卡',90,'')

create table CityArea(
	area_id varchar(20) primary key,
	city_id varchar(20) references City(city_id),
	range_id varchar(20) references DeliveryRange(range_id),
	area_name varchar(20),
	city_name varchar(20)
);

insert into CityArea values('1001','1001','1001','兴宾区','来宾'),('1002','1002','1002','兴宾区','来宾'),
('1003','1003','1003','福建','福州'),

create table `Order`(
	order_id varchar(20) primary key,
	car_id varchar(20) references Car(car_id),
	cul_id varchar(20) references Customer(cul_id),
	post_pname varchar(20),
	post_ptel varchar(20),
	post_addr varchar(50),
	get_pname varchar(20),
	get_ptel varchar(20),
	get_addr varchar(50),
	goods_name varchar(100),
	goods_weight int,
	order_type varchar(10),
	order_state varchar(20),
	trans_post_price decimal(20),
	delivery_price decimal(20),
	total_price varchar(20),
	Comment varchar(100)
);

INSERT into `Order` VALUES
('001','001','001','小李','18784635854','珠海','小刘','18789769585','南宁','早餐奶',20,'乳制品','1',20,30,30,'暂无'),
('002','002','002','小明','18785635854','珠海','小王','18767659585','南宁','早餐奶',20,'乳制品','1',20,30,30,'暂无'),
('003','003','003','小乐','18785635854','珠海','小橘','18775534585','南宁','早餐奶',20,'乳制品','1',20,30,30,'暂无')


create table Association_1(
	order_id varchar(20) references `Order`(order_id),
	deliveryReceipt_id varchar(20) references DeliveryReceipt(deliveryReceipt_id),
	primary key(order_id,deliveryReceipt_id)
);

insert into Association_1 values('1001','1001'),('1002','1002'),('1003','1003')

create table DeliveryReceipt(
	deliveryReceipt_id varchar(20) primary key,
	start_city varchar(20),
	end_city varchar(20),
	mid_city varchar(20),
	make_date datetime,
	state varchar(20),
	disComment varchar(100)
)

insert into DeliveryReceipt values('1001','佛山','来宾','柳州','2018-10-20','配送中',''),
('1002','广州','来宾','柳州','2018-10-19','配送中',''),
('1003','泉州','福建','福建','2018-10-21','配送中','')
