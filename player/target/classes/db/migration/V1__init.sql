CREATE TABLE IF NOT EXISTS  player (
   id SERIAL,
   nui VARCHAR (13)NOT NULL,
   fullname VARCHAR(100) NOT NULL,
   nationality VARCHAR (100),
   PRIMARY KEY (id),
   UNIQUE(nui)
);
