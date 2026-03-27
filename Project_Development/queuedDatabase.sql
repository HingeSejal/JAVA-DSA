mysql> CREATE DATABASE IF NOT EXISTS smart_queue_db;
Query OK, 1 row affected (0.05 sec)

mysql> USE smart_queue_db;
Database changed
mysql> CREATE TABLE counters (
    ->     id INT PRIMARY KEY AUTO_INCREMENT,
    ->     name VARCHAR(100) NOT NULL,
    ->     current_token VARCHAR(20) DEFAULT NULL,
    ->     is_active BOOLEAN DEFAULT TRUE,
    ->     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    -> );
Query OK, 0 rows affected (0.05 sec)

mysql> CREATE TABLE tokens (
    ->     id BIGINT PRIMARY KEY AUTO_INCREMENT,
    ->     token_number VARCHAR(20) UNIQUE NOT NULL,
    ->     customer_name VARCHAR(100) NOT NULL,
    ->     phone_number VARCHAR(15) NOT NULL,
    ->     service_type VARCHAR(50) NOT NULL,
    ->     counter_id INT NOT NULL,
    ->     status ENUM('PENDING', 'SERVED', 'SKIPPED') DEFAULT 'PENDING',
    ->     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ->     served_at TIMESTAMP NULL,
    ->     FOREIGN KEY (counter_id) REFERENCES counters(id),
    ->     INDEX idx_token_number (token_number),
    ->     INDEX idx_counter_id (counter_id),
    ->     INDEX idx_status (status),
    ->     INDEX idx_created_at (created_at)
    -> );
Query OK, 0 rows affected (0.05 sec)

mysql> CREATE TABLE admin_users (
    ->     id INT PRIMARY KEY AUTO_INCREMENT,
    ->     username VARCHAR(50) UNIQUE NOT NULL,
    ->     password_hash VARCHAR(255) NOT NULL,
    ->     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    -> );
Query OK, 0 rows affected (0.05 sec)

mysql> INSERT INTO counters (name) VALUES
    -> ('Counter 1 - General Services'),
    -> ('Counter 2 - Premium Services'),
    -> ('Counter 3 - Express Services');
Query OK, 3 rows affected (0.04 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO admin_users (username, password_hash) VALUES
    -> ('admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918');
Query OK, 1 row affected (0.03 sec)

mysql> CREATE INDEX idx_tokens_counter_status ON tokens(counter_id, status, created_at);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0