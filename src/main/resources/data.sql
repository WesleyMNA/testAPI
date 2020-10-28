INSERT INTO lot (manufacturing_date) VALUES ('2020-09-07');
INSERT INTO lot (manufacturing_date) VALUES ('2020-09-14');

INSERT INTO product (name, color, description, price) VALUES ('tênis nike', 'preto', 'tênis para corrida', 200);
INSERT INTO product (name, color, description, price) VALUES ('tênis adidas', 'verde', 'tênis para corrida', 150);
INSERT INTO product (name, color, description, price) VALUES ('tênis dc', 'vermelho', 'tênis para skatista', 250);
INSERT INTO product (name, color, description, price) VALUES ('tênis etnies', 'azul', 'tênis para skatista', 220);

INSERT INTO lot_product (lot_id, product_id) VALUES (1, 1);
INSERT INTO lot_product (lot_id, product_id) VALUES (1, 1);
INSERT INTO lot_product (lot_id, product_id) VALUES (1, 2);
INSERT INTO lot_product (lot_id, product_id) VALUES (1, 2);
INSERT INTO lot_product (lot_id, product_id) VALUES (2, 3);
INSERT INTO lot_product (lot_id, product_id) VALUES (2, 3);
INSERT INTO lot_product (lot_id, product_id) VALUES (2, 4);
INSERT INTO lot_product (lot_id, product_id) VALUES (2, 4);

INSERT INTO client (name, cpf, birth_date) VALUES ('joão', '12345678912', '2000-01-01');
INSERT INTO client (name, cpf, birth_date) VALUES ('maria', '98765432198', '1980-01-01');

INSERT INTO seller (name, email, password) VALUES ('jose', 'jose@email.com', '123');
INSERT INTO seller (name, email, password) VALUES ('ana', 'ana@email.com', '123');

INSERT INTO selling_order (client_id, seller_id, total) VALUES (1, 1, 350);
INSERT INTO selling_order (client_id, seller_id, total) VALUES (2, 2, 470);

INSERT INTO order_product (order_id, product_id) VALUES (1, 1);
INSERT INTO order_product (order_id, product_id) VALUES (1, 2);
INSERT INTO order_product (order_id, product_id) VALUES (2, 3);
INSERT INTO order_product (order_id, product_id) VALUES (2, 4);