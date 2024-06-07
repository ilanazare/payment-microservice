CREATE TABLE IF NOT EXISTS `customer` (
  customer_id   varchar(100)    NOT NULL,
  name          varchar(100)    NOT NULL,
  address       varchar(200)    NOT NULL,
  email         varchar(100)    NOT NULL,
  mobile_number varchar(20)     NOT NULL,
  created_at    date            NOT NULL,
  created_by    varchar(20)     NOT NULL,
  updated_at    date            DEFAULT NULL,
  updated_by    varchar(20)     DEFAULT NULL,
  PRIMARY KEY (customer_id)

) ENGINE = InnoDB;;
