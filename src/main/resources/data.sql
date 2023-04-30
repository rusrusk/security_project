INSERT IGNORE INTO user (id, username, password, algorithm)
VALUES ('1', 'rus', '$2a$10$xn3LIAjqicFYZFruSwve.681477XaVNaUQbr1gioaWPn4t1KsnmG', 'BCRYPT');

INSERT IGNORE INTO authority (id, name, user)
VALUES ('1', 'READ', '1');

INSERT IGNORE INTO authority (id, name, user)
VALUES ('2', 'WRITE', '1');

INSERT IGNORE INTO product (id, name, price, currency)
VALUES ('1', 'Milk', '3', 'USD');

