
create table TBL_STOCK(prod_id varchar(6), prod_name varchar(20) unique, quant_on_hand numeric check(quant_on_hand>0), prod_unit_price numeric check(prod_unit_price>0), reorder_level numeric, primary key(prod_id));

create table TBL_SALES(sales_id varchar(6), sales_Date Date, prod_id varchar(6), qty_sold numeric check(qty_sold>0), sales_price_per_unit numeric check(sales_price_per_unit>0), primary key(sales_id), foreign key(prod_id) references TBL_STOCK(prod_id));

insert into tbl_stock values('RE1001','REDMI Note 3', 20, 12000, 5);

insert into tbl_stock values('ip1002','Iphone 5S', 10, 21000, 2);

insert into tbl_stock values('PA1003','Panasonic P55', 50, 5500, 5);

create sequence SEQ_SALES_ID increment by 1 start with 1000;

create sequence SEQ_PRODUCT_ID increment by 1 start with 1004;

create view v_sales_report as select sales_id, sales_Date, p.prod_id, prod_name, qty_sold, prod_unit_price, sales_price_per_unit, (sales_price_per_unit - prod_unit_price) as Profit_Amount from tbl_sales s, tbl_stock p where s.prod_id = p.prod_id order by Profit_Amount desc , sales_id asc;
