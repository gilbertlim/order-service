-- table
DROP TABLE IF EXISTS tbl_order CASCADE;
DROP SEQUENCE IF EXISTS seq_order CASCADE;
CREATE SEQUENCE seq_order;
CREATE TABLE tbl_order (
    order_id BIGINT PRIMARY KEY DEFAULT nextval('seq_order'),
    member_id VARCHAR(50)
);

DROP TABLE IF EXISTS tbl_order_item CASCADE;
DROP SEQUENCE IF EXISTS seq_order_item CASCADE;
CREATE SEQUENCE seq_order_item;
CREATE TABLE tbl_order_item (
    order_item_id BIGINT PRIMARY KEY DEFAULT nextval('seq_order_item'),
    order_id BIGINT REFERENCES tbl_order,
    product_id BIGINT,
    quantity SMALLINT,
    CONSTRAINT fk_order_id FOREIGN KEY (order_id) REFERENCES tbl_order(order_id) ON DELETE CASCADE ON UPDATE CASCADE
);