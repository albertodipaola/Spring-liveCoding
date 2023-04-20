CREATE TABLE courses(
    id BIGINT primary key auto_increment,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    teacher_firstname VARCHAR(100) NOT NULL,
    teacher_lastname VARCHAR(100) NOT NULL,
    date DATE
);
CREATE TABLE lessons(
    id BIGINT primary key auto_increment,
    description VARCHAR(1000) NOT NULL,
    date DATE default (current_date),
    course_id BIGINT,
    foreign key (course_id) references courses(id)
);

CREATE TABLE students(
    id BIGINT primary key auto_increment,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    email VARCHAR(100) unique NOT NULL
);

CREATE TABLE courses_students(
    course_id BIGINT,
    foreign key (course_id) references courses(id),
    student_id BIGINT,
    foreign key (student_id) references students(id)

);