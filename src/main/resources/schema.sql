create table CUSTOMERS (
                           id SERIAL primary key ,
                           name varchar(256) not null ,
                           surname varchar(256) not null ,
                           age int not null ,
                           phone_number varchar(12)
);

create table ORDERS (
                        id SERIAL primary key ,
                        date date,
                        customer_id int,
                        product_name varchar(256),
                        FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);