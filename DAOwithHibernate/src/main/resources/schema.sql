create schema netology;

create table netology.persons(
name varchar(255) primary key,
surname varchar(255) primary key,
age int not null primary key,
phone_number varchar(255) not null,
city_of_living varchar(255) default 'Russia'
);