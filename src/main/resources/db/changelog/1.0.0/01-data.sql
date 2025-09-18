-- liquibase formatted sql

-- changeset ulrich:data-01
INSERT INTO company (id, name)
VALUES (1, 'company1'),
       (2, 'company2'),
       (3, 'company3');

INSERT INTO employee (lastname, firstname, company_id)
VALUES ('lastname1', 'firstname1', 1),
       ('lastname2', 'firstname2', 1),
       ('lastname3', 'firstname3', 2),
       ('lastname4', 'firstname4', 2),
       ('lastname5', 'firstname5', 3);
