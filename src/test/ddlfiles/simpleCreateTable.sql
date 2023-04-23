create table Mitarbeiter (
    id int not null primary key,
    vorname varchar(200),
    name varchar(2300),
    dep_id int
);

create table Abteilung (
    id int not null primary key,
    dep_name varchar(200),
    description varchar(2300)
);