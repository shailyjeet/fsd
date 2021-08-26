CREATE USER 'cheap_o_user'@'localhost' IDENTIFIED BY 'cheap_o_pass';

GRANT ALL PRIVILEGES ON * . * TO 'cheap_o_user'@'localhost';

ALTER USER 'cheap_o_user'@'localhost' IDENTIFIED WITH mysql_native_password BY 'cheap_o_pass';