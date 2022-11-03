DROP TABLE IF EXISTS MOVIE;  
CREATE TABLE MOVIE AS SELECT * FROM CSVREAD('src/main/resources/movielist.csv', NULL, 'fieldSeparator=;');  