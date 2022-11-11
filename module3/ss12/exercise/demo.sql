CREATE DATABASE demo;
USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
update users set name = "Duonggg",email="abc@gmail.com" , country ="VN" where id = 3;

DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
    SELECT users.name, users.email, users.country
    FROM users
    where users.id = user_id;
    END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE insert_user(IN user_name varchar(120),IN user_email varchar(120),IN user_country varchar(120)
)
BEGIN
    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);
    END$$
DELIMITER ;
USE demo;
DELIMITER //
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN 
SELECT users.name,users.email,users.country
FROM users
WHERE users.id=user_id;
END//
DELIMITER ;
DROP TABLE users;
 
CALL get_user_by_id(13);
DELIMITER //
CREATE PROCEDURE insert_user(
IN user_name VARCHAR(50),
IN user_email VARCHAR(50),
IN user_country VARCHAR(50)
)
BEGIN
INSERT INTO users(name,email,country)
VALUE (user_name,user_name,user_country);
END//
DELIMITER ;
CALL insert_user(2,"Tấn","Japan");
SELECT * FROM users;
​
DELIMITER //
CREATE PROCEDURE display_list_user()
BEGIN 
SELECT * FROM users;
END//
DELIMITER ;
CALL display_list_user();
​
DELIMITER $$

CREATE PROCEDURE update_info(IN name VARCHAR(50),IN email VARCHAR(50),IN country VARCHAR(50),IN id_user INT)
BEGIN 
update users set name = name,email= email, country =country where id = id_user;
END//
DELIMITER ;
​​
DELIMITER $$
