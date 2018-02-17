CREATE TABLE employee (
    employee_number serial NOT NULL,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    job_title varchar(50) NOT NULL,
    gender varchar(50) NOT NULL,
    birthday date,
    hiredate date NOT NULL,
    department_number integer NOT NULL,
    CONSTRAINT pk_employee_employee_number PRIMARY KEY (employee_number)
);

CREATE TABLE department (
    department_number serial NOT NULL,
    department_name varchar(50) NOT NULL,
    CONSTRAINT pk_department_department_number PRIMARY KEY (department_number)
);
    
CREATE TABLE project (
    project_number serial NOT NULL,
    project_name varchar(50) NOT NULL,
    startdate date,
    CONSTRAINT pk_project_project_number PRIMARY KEY (project_number)
);

CREATE TABLE project_employee (
    employee_number integer NOT NULL,
    project_number integer NOT NULL,
    CONSTRAINT pk_project_employee_employee_number_project_number PRIMARY KEY (employee_number, project_number)
);



INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (1, 'PENELOPE', 'GUINESS', 'ENGINEER', 'FEMALE', 1992-12-02, 2017-01-01 , 1);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (2, 'SUZIE', 'SMITH', 'ENGINEER', 'FEMALE', 1993-12-02, 2016-02-01 , 1);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (3, 'JAN', 'SMITH', 'ALAGTOR WRESTLER', 'FEMALE', 1992-12-02, 2011-12-03 , 2);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (4, 'STEVE', 'SMITH', 'PROFESSIONAL VACUUMER', 'MALE', 1965-10-30, 2011-12-03 , 2);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (5, 'YOGI', 'BEAR', 'PICNIC ENTHUSIST', 'MALE', 1962-04-02, 2006-10-03 , 3);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (6, 'BOOBOO', 'BEAR', 'PICNIC ENTHUSIST', 'MALE', 1965-10-30, 2007-12-03 , 3);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (7, 'RANGER', 'SMITH', 'PARK RANGER', 'MALE', 1945-04-02, 1950-10-03 , 4);
INSERT INTO employee (employee_number, first_name, last_name, job_title, gender, birthday, hiredate, department_number) VALUES (8, 'EUGENE', 'PICKLE BOTTOM', 'ARSONIST', 'MALE', 1925-10-30, 1945-12-03 , 4);

SELECT setval(pg_get_serial_sequence('employee', 'employee_number'), 8);

INSERT INTO department (department_number, department_name) VALUES (1, 'SALES');
INSERT INTO department (department_number, department_name) VALUES (2, 'HUMAN RESOURCES');
INSERT INTO department (department_number, department_name) VALUES (3, 'INTERNS');
INSERT INTO department (department_number, department_name) VALUES (4, 'PROJECT MANAGERS');

SELECT setval(pg_get_serial_sequence('department', 'department_number'), 4);

INSERT INTO project (project_number, project_name, startdate) VALUES (1, 'THE REALLY BIG AWESOME PROJECT', 1925-10-30);
INSERT INTO project (project_number, project_name, startdate) VALUES (2, 'THE NOT SO BIG AWESOME PROJECT', 1935-10-30);
INSERT INTO project (project_number, project_name, startdate) VALUES (3, 'THE REALLY SMALL NOMINAL PROJECT', 1945-10-30);
INSERT INTO project (project_number, project_name, startdate) VALUES (4, 'THE TINY HORRIBLE PROJECT', 1955-10-30);

SELECT setval(pg_get_serial_sequence('project', 'project_number'), 4);

INSERT INTO project_employee (employee_number, project_number) VALUES (1, 1);
INSERT INTO project_employee (employee_number, project_number) VALUES (2, 1);
INSERT INTO project_employee (employee_number, project_number) VALUES (3, 2);
INSERT INTO project_employee (employee_number, project_number) VALUES (4, 2);
INSERT INTO project_employee (employee_number, project_number) VALUES (5, 3);
INSERT INTO project_employee (employee_number, project_number) VALUES (6, 3);
INSERT INTO project_employee (employee_number, project_number) VALUES (7, 4);
INSERT INTO project_employee (employee_number, project_number) VALUES (8, 4);
INSERT INTO project_employee (employee_number, project_number) VALUES (1, 4);

ALTER TABLE employee
ADD FOREIGN KEY(department_number)
REFERENCES department(department_number);   

  
