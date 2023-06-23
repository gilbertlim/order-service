INSERT INTO tbl_order (member_num) VALUES (1);
INSERT INTO tbl_order (member_num) VALUES (2);
INSERT INTO tbl_order (member_num) VALUES (3);
INSERT INTO tbl_order (member_num) VALUES (4);

INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (1, 1, 5);
INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (1, 2, 3);
INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (1, 3, 1);

INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (2, 1, 2);

INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (3, 1, 10);
INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (3, 2, 5);
INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (3, 3, 5);

INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (4, 1, 2);
INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (4, 2, 1);
INSERT INTO tbl_order_item (order_num, item_num, item_count) VALUES (4, 3, 1);