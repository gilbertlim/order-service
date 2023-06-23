-- table
DROP TABLE IF EXISTS tbl_order CASCADE;
DROP SEQUENCE IF EXISTS seq_order CASCADE;
CREATE SEQUENCE seq_order;
CREATE TABLE tbl_order (
    order_num BIGINT PRIMARY KEY DEFAULT nextval('seq_order'),
    member_num INT
);

DROP TABLE IF EXISTS tbl_order_item CASCADE;
DROP SEQUENCE IF EXISTS seq_order_item CASCADE;
CREATE SEQUENCE seq_order_item;
CREATE TABLE tbl_order_item (
    order_item_num BIGINT PRIMARY KEY DEFAULT nextval('seq_order_item'),
    order_num BIGINT REFERENCES tbl_order,
    item_num BIGINT,
    item_count SMALLINT,
    CONSTRAINT fk_order_num FOREIGN KEY (order_num) REFERENCES tbl_order(order_num) ON DELETE CASCADE ON UPDATE CASCADE
);