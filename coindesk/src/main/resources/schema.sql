CREATE TABLE bpi(
    bpi_id INT NOT NULL auto_increment,
    updated TIMESTAMP ,
    updatedISO TIMESTAMP ,
    updateduk TIMESTAMP ,
    code_name VARCHAR(10),
    symbol VARCHAR(20),
    rate DOUBLE,
    description VARCHAR(100),
    rate_float DOUBLE
);