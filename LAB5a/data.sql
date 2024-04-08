-- Dummy data for Dentist table
INSERT INTO Dentist (First_Name, Last_Name, Phone_Number, Email, Specialization) VALUES
('John', 'Doe', '123-456-7890', 'john.doe@example.com', 'General Dentistry'),
('Jane', 'Smith', '987-654-3210', 'jane.smith@example.com', 'Orthodontics'),
('Michael', 'Johnson', '456-789-0123', 'michael.johnson@example.com', 'Endodontics'),
('Emily', 'Brown', '789-012-3456', 'emily.brown@example.com', 'Pediatric Dentistry'),
('David', 'Williams', '321-654-9870', 'david.williams@example.com', 'Oral Surgery');

-- Dummy data for Patient table
INSERT INTO Patient (First_Name, Last_Name, Phone_Number, Email, Mailing_Address, Date_of_Birth) VALUES
('Alice', 'Johnson', '111-222-3333', 'alice.johnson@example.com', '123 Main St, Anytown, USA', '1990-01-01'),
('Bob', 'Smith', '444-555-6666', 'bob.smith@example.com', '456 Oak Ave, Anytown, USA', '1985-05-15'),
('Charlie', 'Brown', '777-888-9999', 'charlie.brown@example.com', '789 Elm St, Anytown, USA', '1988-09-20'),
('Diana', 'Williams', '111-222-3333', 'diana.williams@example.com', '321 Maple Dr, Anytown, USA', '1975-03-10'),
('Eva', 'Taylor', '444-555-6666', 'eva.taylor@example.com', '654 Pine St, Anytown, USA', '2000-12-05');

-- Dummy data for Surgery_Location table
INSERT INTO Surgery_Location (Name, Address, Contact_Number) VALUES
('Surgery Location A', '123 Main St, Anytown, USA', '111-222-3333'),
('Surgery Location B', '456 Oak Ave, Anytown, USA', '444-555-6666'),
('Surgery Location C', '789 Elm St, Anytown, USA', '777-888-9999');

-- Dummy data for Appointment table
INSERT INTO Appointment (Dentist_ID, Patient_ID, Date_Time, Surgery_Location_ID) VALUES
(1, 1, '2024-04-05 09:00:00', 1),
(2, 2, '2024-04-06 10:00:00', 2),
(3, 3, '2024-04-07 11:00:00', 3),
(4, 4, '2024-04-08 12:00:00', 1),
(5, 5, '2024-04-09 13:00:00', 2);

--Display the list of ALL Dentists registered in the system, sorted in ascending order of their lastNames
SELECT * FROM Dentist ORDER BY Last_Name ASC;

--Display the list of ALL Appointments for a given Dentist by their Dentist_ID number. Include in the result, the Patient information:
SELECT Appointment.*, Patient.*
FROM Appointment
JOIN Patient ON Appointment.Patient_ID = Patient.Patient_ID
WHERE Appointment.Dentist_ID = 1;

-- Display the list of ALL Appointments that have been scheduled at a Surgery Location:
SELECT Appointment.*, Surgery_Location.*
FROM Appointment
JOIN Surgery_Location ON Appointment.Surgery_Location_ID = Surgery_Location.Location_ID;


--Display the list of the Appointments booked for a given Patient on a given Date:
SELECT Appointment.*, Dentist.*
FROM Appointment
JOIN Dentist ON Appointment.Dentist_ID = Dentist.Dentist_ID
WHERE Appointment.Patient_ID = 3 AND DATE(Appointment.Date_Time) = '2024-04-07';


