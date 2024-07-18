Create Table Users
(
Id int Auto_increment PRIMARY KEY,
Username varchar(50),
Email varchar(100),
Password varchar(50)
);

Create Table Categories
(
Id int Primary Key,
Name varchar(50)
);

Create Table Priorities
(
Id int Primary Key,
Level varchar(50)
);

Create Table Tasks
(
Id int Auto_increment Primary Key,
User_Id int not null,
Title varchar(250),
Description varchar(250),
Category_Id int not null,
Priority_Id int not null,
isCompleted Boolean default false,
 Foreign Key(User_Id) References Users(Id) ON DELETE CASCADE ON UPDATE CASCADE,
 Foreign Key(Category_Id) References Categories(Id) ON DELETE CASCADE ON UPDATE CASCADE,
 Foreign Key(Priority_Id) References Priorities(Id) ON DELETE CASCADE ON UPDATE CASCADE
);

Create Table Subtasks
(
Id int Auto_increment Primary Key,
Task_Id int not null,
Title varchar(250),
Description varchar(250),
Priority_Id int not null,
isCompleted Boolean default false,
Foreign Key(Task_Id) References Tasks(Id) ON DELETE CASCADE ON UPDATE CASCADE,
Foreign Key(Priority_Id) References Priorities(Id) ON DELETE CASCADE ON UPDATE CASCADE
);

Create Table TaskRecurrence
(
Task_Id int Auto_increment ,
Due_Date DATE,
Recurrence_Type varchar(50),
Next_Due_Date DATE,
Primary Key(Task_Id,Due_Date),
Foreign Key(Task_Id) References Tasks(Id) ON DELETE CASCADE ON UPDATE CASCADE
);

--Tables test
Insert Into Users(Username,Email,Password) Values('Andrei475','andrei475@yahoo.com','parola123');
Insert Into Priorities(Id,Level) Values(15,'Low');
Insert Into Priorities(Id,Level) Values(25,'Medium');
Insert Into Categories(Id,Name) Values(10,'Home');
Insert Into Categories(Id,Name) Values(20,'Work');
Insert Into Tasks(User_Id,Title,Description,Category_Id,Priority_Id) Values(1,'Water','Buy water from Supermarket',10,25);
Insert Into Tasks(User_Id,Title,Description,Category_Id,Priority_Id) Values(1,'Food','Buy food from Supermarket for lunch time',20,25);
Insert Into Subtasks(Task_Id,Title,Description,Priority_Id) Values(1,'Trash','Take out the trash before leaving',25);
Insert Into Subtasks(Task_Id,Title,Description,Priority_Id) Values(1,'Dog','Take out the dog for a walk before leaving',15);
Insert Into Subtasks(Task_Id,Title,Description,Priority_Id) Values(2,'plastic bag','Take out the plastic before leaving',15);
Insert Into TaskRecurrence(Due_Date,Recurrence_Type,Next_Due_Date) Values('2024-05-12','Weekly','2024-05-19');