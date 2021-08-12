// To create database
CREATE DATABASE RDBMS_Lab_Exercises;

// To select database
USE RDBMS_Lab_Exercises;

//------------------ Creating Tables --------------

// Sailors Table
CREATE TABLE Sailors (
	Sid INT UNSIGNED PRIMARY KEY,
	Sname VARCHAR(15) NOT NULL,
	Rating INT,
	Age INT
);

// Boats Table
CREATE TABLE Boats (
	Bid INT UNSIGNED PRIMARY KEY,
	Bname VARCHAR(20) NOT NULL,
	Color VARCHAR(15)
);

// Reserves Table
CREATE TABLE Reserves (
  Sid INT UNSIGNED NOT NULL,
  FOREIGN KEY(Sid) REFERENCES Sailors(Sid) ON DELETE CASCADE ON UPDATE CASCADE,
  Bid INT UNSIGNED NOT NULL,
  FOREIGN KEY(Bid) REFERENCES Boats(Bid) ON DELETE CASCADE ON UPDATE CASCADE,
  Day DATE NOT NULL
);

CREATE TABLE Reserves1 (  
	Sid INT UNSIGNED,
	Bid INT UNSIGNED,
	Day DATE NOT NULL,
	CONSTRAINT FK_Sailors FOREIGN KEY (Sid)	REFERENCES Sailors(Sid)  
	ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FK_Sailors FOREIGN KEY (Bid)	REFERENCES Boats(Bid)  
	ON DELETE CASCADE ON UPDATE CASCADE
);  

//-------------------------------------------------

//------------------ Inserting Data ---------------

// Sailors Table
INSERT INTO Sailors VALUES (22, "Dustin", 7, 45.0);
INSERT INTO Sailors VALUES (29, "Brutus", 1, 33.0);
INSERT INTO Sailors VALUES (31, "Lubber", 9, 55);
INSERT INTO Sailors VALUES (32, "Andy", 8, 55.0);
INSERT INTO Sailors VALUES (58, "Rusty", 10, 35);

// Boats Table
INSERT INTO Boats VALUES (101, "Interlake", "Blue");
INSERT INTO Boats VALUES (102, "Interlake", "Red");
INSERT INTO Boats VALUES (103, "Clipper", "Green");
INSERT INTO Boats VALUES (104, "Marine", "Red");

// Reserves Table
INSERT INTO Reserves VALUES (22, 101, STR_TO_DATE('1/1/2004', '%d/%m/%Y'));
INSERT INTO Reserves VALUES (22, 102, STR_TO_DATE('1/1/2004', '%d/%m/%Y'));
INSERT INTO Reserves VALUES (22, 103, STR_TO_DATE('1/2/2004', '%d/%m/%Y'));
INSERT INTO Reserves VALUES (31, 103, STR_TO_DATE('5/5/2005', '%d/%m/%Y'));
INSERT INTO Reserves VALUES (32, 104, STR_TO_DATE('7/4/2005', '%d/%m/%Y'));

//-------------------------------------------------

// 1. Find the names of sailors who have reserved a red boat.
SELECT Sname FROM Sailors WHERE Sid IN 
(SELECT Sid FROM Reserves WHERE Bid IN 
(SELECT Bid FROM Boats WHERE Color="Red"));
+--------+
| Sname  |
+--------+
| Dustin |
| Andy   |
+--------+

// 2. Find the names of the Sailors who have reserved at least one boat
SELECT Sname FROM Sailors WHERE Sid IN (SELECT DISTINCT(Sid) FROM Reserves);
+--------+
| Sname  |
+--------+
| Dustin |
| Lubber |
| Andy   |
+--------+

// 3. Compute increments for the ratings of persons who have sailed two different boats on the same day.


// 4. Find the ages of sailors whose name begins and ends with B and has at least 3 characters.
SELECT Age FROM Sailors WHERE Sname LIKE "B%_b";
Empty set (0.00 sec)

// 5. Find the names of sailors who have reserved a red and a green boat.
SELECT Sname FROM Sailors WHERE Sid IN
(SELECT Sid FROM Reserves WHERE Bid IN
(SELECT Bid FROM Boats WHERE Color="Red" AND Color="Green"));

SELECT Sname FROM Sailors WHERE Sid IN
(SELECT Sid FROM Reserves WHERE Bid IN
(SELECT Bid FROM Boats WHERE Color="Red" AND Color="Green"));

SELECT Sname FROM Sailors WHERE Sid IN
(SELECT Sid FROM Reserves WHERE Bid IN
(SELECT Bid FROM Boats WHERE Color="Red")) AND
(SELECT Sid FROM Reserves WHERE Bid IN
(SELECT Bid FROM Boats WHERE Color="Green"));

// 6. Find the sids of all sailors who have reserved red boats but not green boats.
SELECT Sid FROM Reserves WHERE Bid IN
(SELECT DISTINCT(Bid) FROM Boats WHERE Color="Red" AND Color<>"Green");

// 7. Find the sailors with the highest rating
SELECT Sname FROM Sailors WHERE Rating=(SELECT MAX(Rating) FROM Sailors);
+-------+
| Sname |
+-------+
| Rusty |
+-------+

// 8. Find the name of the oldest sailor.
SELECT Sname FROM Sailors WHERE AGE=(SELECT MAX(Age) FROM Sailors);
+--------+
| Sname  |
+--------+
| Lubber |
+--------+

// 9. Count the number of different sailor names.
SELECT COUNT(DISTINCT(Sname)) FROM Sailors;
+------------------------+
| COUNT(DISTINCT(SNAME)) |
+------------------------+
|                      5 |
+------------------------+

// 10. Find the no. of sailors who is eligible to vote for each rating level. //Considering voting age to be 30yrs and having rating greater than rest


// 11. Find the no. of sailors who is eligible to vote for each rating level with at least two such sailors.


// 12. Find the sid of the sailors who have sailed exactly one boat.
SELECT r.Sid FROM Reserves r GROUP BY r.Sid HAVING COUNT(DISTINCT(r.Bid))=1;
+-----+
| Sid |
+-----+
|  31 |
|  32 |
+-----+

// 13. Find sailors who have not reserved any boats.
SELECT Sname FROM Sailors WHERE Sid NOT IN (SELECT Sid FROM RESERVES);
+--------+
| Sname  |
+--------+
| Brutus |
| Rusty  |
+--------+

// 14. Find the Sailors who have reserved all the boats.
SELECT Sname FROM Sailors WHERE Sid IN 
(SELECT r.Sid FROM Reserves r GROUP BY r.Sid HAVING COUNT(DISTINCT(r.Bid))=(SELECT COUNT(*) FROM Boats));
Empty set (0.00 sec)

// 15. Find all the sailors older than Dustin.
SELECT Sname FROM Sailors WHERE Age>(SELECT Age FROM Sailors WHERE Sname="Dustin");
+--------+
| Sname  |
+--------+
| Lubber |
+--------+

// 16. Find all sailors whose ratings is greater than any others rating without using aggregates like MAX.
SELECT Sname FROM Sailors WHERE Rating =(Select DISTINCT(Rating) FROM Sailors ORDER BY Rating DESC LIMIT 1); 
+-------+
| Sname |
+-------+
| Rusty |
+-------+

// 17. Find the sailors with 3rd highest ratings.
SELECT Sname FROM Sailors WHERE Rating = (SELECT Rating FROM Sailors ORDER BY Rating DESC LIMIT 2,1);
+-------+
| Sname |
+-------+
| Andy  |
+-------+

// 18. Find sids of the sailors who have reserved all the boats reserved by the sailor with sid =’31’.
SELECT Sname FROM Sailors WHERE Sid IN
(SELECT Sid FROM Reserves WHERE Bid IN
(SELECT Bid FROM Reserves WHERE Sid=31)) AND Sid<>31;
+--------+
| Sname  |
+--------+
| Dustin |
+--------+

// 19. List out all the sailors. For the sailors who have reserved some boats list out the boat’s bids also.
select s.Sname, b.Bid from sailors s LEFT JOIN reserves r ON r.Sid = s.Sid LEFT JOIN boats b ON  r.Bid = b.Bid;
+--------+------+
| Sname  | Bid  |
+--------+------+
| Dustin |  101 |
| Dustin |  102 |
| Dustin |  103 |
| Brutus | NULL |
| Lubber |  103 |
| Andy   |  104 |
| Rusty  | NULL |
+--------+------+

// Only sailors who have reserved boats
SELECT s.Sname, b.bid FROM Sailors s, Boats b, Reserves r WHERE s.Sid=r.Sid AND b.bid = r.Bid ;
+--------+-----+
| Sname  | bid |
+--------+-----+
| Dustin | 101 |
| Dustin | 102 |
| Dustin | 103 |
| Lubber | 103 |
| Andy   | 104 |
+--------+-----+

// 20. Assume that we have a table called customer.
	CustID	Name	ReferredBy
	1	Neeta Sayam	
	2	Dolly Dilly	1
	3	Meena Kimi	2
	
// Creating Table
CREATE TABLE Customer(
CustID INT PRIMARY KEY AUTO_INCREMENT,
Name VARCHAR(18) NOT NULL,
ReferredBy INT REFERENCES Customer(CustID));

// Inserting Data
INSERT INTO Customer VALUES (1, "Neeta Sayam", NULL);
INSERT INTO Customer VALUES (2, "Dolly Dilly", 1);
INSERT INTO Customer VALUES (3, "Meena Kimi", 2);

// 21. Find the names of all customers who are referred by others.
SELECT Name FROM Customer WHERE ReferredBy IS NULL;
+-------------+
| Name        |
+-------------+
| Neeta Sayam |
+-------------+

// 22. Find the names of all customers who have referred others.
SELECT Name FROM Customer WHERE CustID IN (SELECT ReferredBy FROM Customer);
+-------------+
| Name        |
+-------------+
| Neeta Sayam |
| Dolly Dilly |
+-------------+

// 23. Find the last three customer records inserted. (Refer the above Customer table)
SELECT * FROM Customer ORDER BY CustID DESC LIMIT 3;
+--------+-------------+------------+
| CustID | Name        | ReferredBy |
+--------+-------------+------------+
|      3 | Meena Kimi  |          2 |
|      2 | Dolly Dilly |          1 |
|      1 | Neeta Sayam |       NULL |
+--------+-------------+------------+

// 24.	Given a table ‘customer’.
	CustID	Name	Age
	1	Neeta Sayam	32
	2	Dolly Dilly	23
	3	Meena Kimi	43
	
// Creating Table
CREATE TABLE Customer1(
CustID INT PRIMARY KEY AUTO_INCREMENT,
Name VARCHAR(18) NOT NULL,
Age INT(3) NOT NULL);

// Inserting Data
INSERT INTO Customer1(Name, Age) VALUES ("Neeta Sayam", 32);
INSERT INTO Customer1(Name, Age) VALUES ("Dolly Dilly", 23);
INSERT INTO Customer1(Name, Age) VALUES ("Meena Kimi", 43);

// How will you get rows between the range x and y where x and y will be entered by the user?
SELECT * FROM Customer1 where Age>=x AND Age<=y; 
// For instance x=20, y=35
SELECT * FROM Customer1 where Age>=20 AND Age<=35;
+--------+-------------+-----+
| CustID | Name        | Age |
+--------+-------------+-----+
|      1 | Neeta Sayam |  32 |
|      2 | Dolly Dilly |  23 |
+--------+-------------+-----+

// 25.	Given three tables- sailors, boats and reserves. Sid, Bid and (Sid, Bid) are the primary keys of sailors, boats and reserves respectively. Sid and Bid are also the foreign keys of reserves which references Sid and Bid of sailors and boats relation respectively. No two sailors have same rating. The sname and bname of the sailors and boats table are cannot be null.
a)	Alter the Sailor table such that age is between 18 and 40.  
// Making Duplicate Table
CREATE TABLE Sailors1 LIKE Sailors; 
INSERT INTO Sailors1 SELECT * FROM Sailors;

// Query
ALTER TABLE Sailors1 ADD CONSTRAINT Age_Constraint CHECK Age BETWEEN 18 AND 40;

b)	Alter the Boats table such that color is Red, Blue or Green.
// Making Duplicate Table
CREATE TABLE Boats1 LIKE Boats; 
INSERT INTO Boats1 SELECT * FROM Boats;

//Query
ALTER TABLE Boats1 ADD CONSTRAINT Color_Constraint CHECK Color IN ("Red", "Blue", "Green");

c)	Assuming that all the tables are created as in 1, 2 and 3 alter the table (s) such that if a record from sailors table gets deleted, then the records corresponding to the same sailor also get deleted from reserves. 


d)	Drop primary key constraint from the reserves table.




