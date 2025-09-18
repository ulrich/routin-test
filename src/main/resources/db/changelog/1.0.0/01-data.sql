-- liquibase formatted sql

-- changeset ulrich:data-01
INSERT INTO employee (lastname, firstname)
VALUES ('lastname1', 'firstname1'),
       ('lastname2', 'firstname2');
