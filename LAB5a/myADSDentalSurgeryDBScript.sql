-- Dentist table
CREATE TABLE Dentist (
    Dentist_ID INT PRIMARY KEY AUTO_INCREMENT,
    First_Name VARCHAR(50),
    Last_Name VARCHAR(50),
    Phone_Number VARCHAR(20),
    Email VARCHAR(100),
    Specialization VARCHAR(100)
);

-- Patient table
CREATE TABLE Patient (
    Patient_ID INT PRIMARY KEY AUTO_INCREMENT,
    First_Name VARCHAR(50),
    Last_Name VARCHAR(50),
    Phone_Number VARCHAR(20),
    Email VARCHAR(100),
    Mailing_Address VARCHAR(255),
    Date_of_Birth DATE
);

-- Surgery_Location table
CREATE TABLE Surgery_Location (
    Location_ID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Address VARCHAR(255),
    Contact_Number VARCHAR(20)
);

-- Appointment table
CREATE TABLE Appointment (
    Appointment_ID INT PRIMARY KEY AUTO_INCREMENT,
    Dentist_ID INT,
    Patient_ID INT,
    Date_Time DATETIME,
    Surgery_Location_ID INT,
    FOREIGN KEY (Dentist_ID) REFERENCES Dentist(Dentist_ID),
    FOREIGN KEY (Patient_ID) REFERENCES Patient(Patient_ID),
    FOREIGN KEY (Surgery_Location_ID) REFERENCES Surgery_Location(Location_ID)
);


