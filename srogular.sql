CREATE TABLE doctor (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    surname VARCHAR,
    proficiency VARCHAR
);
CREATE TABLE nurse (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    surname VARCHAR,
    proficiency VARCHAR
);
CREATE TABLE patient (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    surname VARCHAR,
    email VARCHAR,
    complaint TEXT
);
CREATE TABLE surgery (
    id SERIAL PRIMARY KEY,
    nurse_id BIGINT REFERENCES nurse(id),
    patient_id BIGINT REFERENCES patient(id),
    doctor_id BIGINT REFERENCES doctor(id)
);
CREATE TABLE operation (
    id SERIAL PRIMARY KEY,
    patient_id BIGINT REFERENCES patient(id),
    doctor_id BIGINT REFERENCES doctor(id)
);
