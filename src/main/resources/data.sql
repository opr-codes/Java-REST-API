INSERT INTO USER_DETAILS(ID, BIRTH_DATE, NAME)
VALUES(10001, current_date(), 'Om');

INSERT INTO USER_DETAILS(ID, BIRTH_DATE, NAME)
VALUES(10002, current_date(), 'Ravi');

INSERT INTO USER_DETAILS(ID, BIRTH_DATE, NAME)
VALUES(10003, current_date(), 'Prada');

INSERT INTO POST(ID, DESCRIPTION, USER_ID)
VALUES(20001, 'I want to learn AWS', 10001);

INSERT INTO POST(ID, DESCRIPTION, USER_ID)
VALUES(20002, 'I want to learn DevOps', 10001);

INSERT INTO POST(ID, DESCRIPTION, USER_ID)
VALUES(20003, 'I want to get AWS Certified', 10002);

INSERT INTO POST(ID, DESCRIPTION, USER_ID)
VALUES(20004, 'I want learn Mutli Cloud', 10002);