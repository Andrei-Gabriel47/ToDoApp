CREATE TABLE Users (
    id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE Categories (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE PriorityLevels (
    id INT PRIMARY KEY,
    level VARCHAR(50) NOT NULL
);

CREATE TABLE Tasks (
    id INT PRIMARY KEY,
    user_id INT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    category_id INT,
    priority_id INT,
    isCompleted Boolean,
    FOREIGN KEY (user_id) REFERENCES Users(id),
    FOREIGN KEY (category_id) REFERENCES Categories(id),
    FOREIGN KEY (priority_id) REFERENCES PriorityLevels(id)
);

CREATE TABLE Subtasks (
    id INT PRIMARY KEY,
    task_id INT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    priority_id INT,
    isCompleted Boolean,
    FOREIGN KEY (task_id) REFERENCES Tasks(id),
    FOREIGN KEY (priority_id) REFERENCES PriorityLevels(id)
);

CREATE TABLE TaskRecurrence (
    task_id INT,
    due_date DATE NOT NULL,
    recurrence_type VARCHAR(50),
    next_due_date DATE,
    FOREIGN KEY (task_id) REFERENCES Tasks(id)
);
