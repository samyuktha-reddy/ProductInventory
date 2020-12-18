CREATE TABLE product_List (
	item_id INT PRIMARY KEY,
	item_name VARCHAR(20) NOT NULL,
	item_cost DOUBLE not null);

CREATE TABLE ex_Rate (
	currency_Alpha VARCHAR(10) PRIMARY KEY,
	currency_Value DOUBLE not null);

INSERT INTO product_List (item_id, item_name, item_cost) VALUES (1, 'Watch', 330);
INSERT INTO product_List (item_id, item_name, item_cost) VALUES (2, 'LED Remote', 40);
INSERT INTO product_List (item_id, item_name, item_cost) VALUES (3, 'Laptop', 800);
INSERT INTO ex_Rate (currency_Alpha, currency_Value) VALUES ('EUR',0.9);
INSERT INTO ex_Rate (currency_Alpha, currency_Value) VALUES ('INR',70);