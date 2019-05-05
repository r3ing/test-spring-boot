INSERT INTO regiones (nombre) VALUES ('Sudamérica');
INSERT INTO regiones (nombre) VALUES ('Centroamérica');
INSERT INTO regiones (nombre) VALUES ('Norteamérica');
INSERT INTO regiones (nombre) VALUES ('Europa');
INSERT INTO regiones (nombre) VALUES ('Asia');
INSERT INTO regiones (nombre) VALUES ('Africa');
INSERT INTO regiones (nombre) VALUES ('Oceanía');

INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Andrés', 'Guzmán', 'profesor@bolsadeideas.com', 1, '2018-01-01');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Mr. John', 'Doe', 'john.doe@gmail.com', 2, '2018-01-02');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', 3, '2018-01-03');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', 4, '2018-01-04');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', 5, '2018-02-01');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', 6, '2018-02-10');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', 7, '2018-02-18');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', 1, '2018-02-28');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Dr. James', 'Gosling', 'james.gosling@gmail.com', 2, '2018-03-03');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Magma', 'Lee', 'magma.lee@gmail.com', 3, '2018-03-04');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Tornado', 'Roe', 'tornado.roe@gmail.com', 4, '2018-03-05');
INSERT INTO clientes (nombre, apellido, email, region_id, created_at) VALUES('Jade', 'Doe', 'jane.doe@gmail.com', 5, '2018-03-06');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$6kWS6PjKrDPNmX7Q7qfY3.5D.rAA3skRPWaJo.qJlWDjORQn0wv1G',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$7XdElu9sMa2u4YBCZ4KeAuBqZomddoHuX6ea7y304M9daikF9s7wu',1, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);