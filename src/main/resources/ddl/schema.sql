CREATE TABLE Product (
    product_id INT AUTO_INCREMENT NOT NULL COMMENT '商品ID',
    product_name VARCHAR(100) NOT NULL COMMENT '商品名',
    product_price INT NOT NULL COMMENT '商品価格',
    product_description VARCHAR(100) NOT NULL COMMENT '商品説明',
    PRIMARY KEY (product_id)
);