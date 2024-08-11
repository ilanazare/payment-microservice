CREATE DATABASE IF NOT EXISTS customers;

CREATE TABLE customers(
  customer_id   varchar(100)    NOT NULL,
  name          varchar(100)    NOT NULL,
  address       varchar(200)    NOT NULL,
  email         varchar(100)    NOT NULL,
  mobile_number varchar(20)     NOT NULL,
  created_at    date            NOT NULL,
  created_by    varchar(20)     NOT NULL,
  updated_at    date            NOT NULL,
  updated_by    varchar(20)     NOT NULL,
  PRIMARY KEY (customer_id)

) ENGINE = InnoDB;

INSERT INTO customers(customer_id, name, address, email, mobile_number, created_at, created_by, updated_at, updated_by) VALUES ('UI2345','iva', 'Brazil', 'iva@mail.com', "71984191099", '01/12/2012' ,'IVA', '02/12/22022', 'IVA');