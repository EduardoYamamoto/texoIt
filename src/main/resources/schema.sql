DROP TABLE IF EXISTS Movie;  
CREATE TABLE Movie(
	movieid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	movieyear INT,
	title VARCHAR(255),
	studios VARCHAR(255),
	producers VARCHAR(255),
	winner VARCHAR(255)
);
INSERT INTO Movie(movieyear, title, studios, producers, winner)
	SELECT * FROM CSVREAD('src/main/resources/movielist.csv', NULL, 'fieldSeparator=;');  