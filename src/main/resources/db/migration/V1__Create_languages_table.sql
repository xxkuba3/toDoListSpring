DROP TABLE IF EXISTS languages;
CREATE TABLE languages (
id int unsigned primary key auto_increment,
welcomeMsg varchar(100) not null,
code varchar(3) not null
);