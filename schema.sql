
CREATE DATABASE lms;

USE lms;

-- Create Users table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    role ENUM('student', 'instructor', 'admin') NOT NULL,
    password VARCHAR(255) NOT NULL
);
