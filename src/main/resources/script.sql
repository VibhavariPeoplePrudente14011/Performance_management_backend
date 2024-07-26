CREATE TABLE UserTable (
       id INT AUTO_INCREMENT PRIMARY KEY,
       emp_id VARCHAR(10) default 'abc',
       name VARCHAR(50),
       email VARCHAR(100) NOT NULL UNIQUE,
       phone_number VARCHAR(10) NOT NULL UNIQUE,
       password VARCHAR(50) NOT NULL,
       createdatetime TIMESTAMP,
       role_fid INT
);

create table Roles(
      id INT AUTO_INCREMENT PRIMARY KEY,
      role_name Varchar(20),
      role_description Varchar(20)
);
CREATE TABLE UserTable (
        id INT AUTO_INCREMENT PRIMARY KEY,
        emp_id VARCHAR(10) default 'abc',
        name VARCHAR(50),
        email VARCHAR(100) NOT NULL UNIQUE,
        phone_number VARCHAR(10) NOT NULL UNIQUE,
        password VARCHAR(50) NOT NULL,
        createdatetime TIMESTAMP,
        role_fid INT
);

CREATE TABLE bhag (
      id INT AUTO_INCREMENT PRIMARY KEY,
      bhag_description VARCHAR(255),
      bhag_name VARCHAR(255)
);
CREATE TABLE goal_setting (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ig_number INT NOT NULL,
    goal_setting_description VARCHAR(1000),
    bhag INT NOT NULL,
    start_date DATE,
    completion_target_date DATE,
    performance_year INT NOT NULL,
    FOREIGN KEY (bhag) REFERENCES bhag(id)
);