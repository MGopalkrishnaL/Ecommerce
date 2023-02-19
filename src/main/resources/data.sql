--user data
insert into user_tbl(user_id,user_email,user_name,user_password,user_phone_number) values(1,'mgopalKrishna2001@gmail.com',
'M Gopal Krishna','Gopal@2','9505044580');
insert into user_tbl(user_id,user_email,user_name,user_password,user_phone_number) values(2,'mRadhaKrishna2001@gmail.com',
'Radha Krishna','Radha@2','9505044580');
insert into user_tbl(user_id,user_email,user_name,user_password,user_phone_number) values(3,'RekhaKrishna2001@gmail.com',
'Rekha Krishna','Rekha@2','9505044580');
insert into user_tbl(user_id,user_email,user_name,user_password,user_phone_number) values(4,'sarithaKrishna2001@gmail.com',
'M Saritha Krishna','Saritha@2','9505044580');
--product data
insert into product(product_id,product_brand,product_description,product_name,product_price)
values(11,'puma','goodQuality','Shoes',2500);
insert into product(product_id,product_brand,product_description,product_name,product_price)
values(12,'puma','goodQuality','Shoes',1500);
insert into product(product_id,product_brand,product_description,product_name,product_price)
values(13,'Rolex','HighQuality','Watch',6500);
insert into product(product_id,product_brand,product_description,product_name,product_price)
values(14,'Rolex','poorQuality','Watch',1500);
--addres Data
insert into address_tbl(address_id,address_landmark,address_name,address_state,address_zipcode,user_id)
values (21,'Kurnool','LakshmiPeta','AndhraPradesh','518360',1);
insert into address_tbl(address_id,address_landmark,address_name,address_state,address_zipcode,user_id)
values (22,'Bangalor','Hebal','Karnataka','518360',2);
insert into address_tbl(address_id,address_landmark,address_name,address_state,address_zipcode,user_id)
values (23,'Hyderbad','Nijampet','Telangana','518360',3);
insert into address_tbl(address_id,address_landmark,address_name,address_state,address_zipcode,user_id)
values (24,'Kurnool','LakshmiPeta','AndhraPradesh','518360',4);
--Order data
insert into order_tbl(id,product_quantity,address_id,product_id,user_id)
values(1,111,21,11,1);
insert into order_tbl(id,product_quantity,address_id,product_id,user_id)
values(2,122,22,12,2);
insert into order_tbl(id,product_quantity,address_id,product_id,user_id)
values(3,133,23,13,3);
