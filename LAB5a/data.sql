-- Populating Dentist table with dummy data
INSERT INTO Dentist (First_Name, Last_Name, Phone_Number, Email, Specialization) VALUES
('John', 'Doe', '123-456-7890', 'john.doe@example.com', 'General Dentistry'),
('Jane', 'Smith', '987-654-3210', 'jane.smith@example.com', 'Orthodontics'),
('Michael', 'Johnson', '456-789-0123', 'michael.johnson@example.com', 'Endodontics'),
('Emily', 'Brown', '789-012-3456', 'emily.brown@example.com', 'Pediatric Dentistry'),
('David', 'Williams', '321-654-9870', 'david.williams@example.com', 'Oral Surgery'),
('Sarah', 'Jones', '654-987-0123', 'sarah.jones@example.com', 'Periodontics'),
('Robert', 'Taylor', '012-345-6789', 'robert.taylor@example.com', 'Prosthodontics'),
('Jessica', 'Davis', '234-567-8901', 'jessica.davis@example.com', 'Endodontics'),
('Daniel', 'Martinez', '567-890-1234', 'daniel.martinez@example.com', 'General Dentistry'),
('Maria', 'Garcia', '890-123-4567', 'maria.garcia@example.com', 'Orthodontics');

-- Populating Patient table with dummy data
INSERT INTO Patient (First_Name, Last_Name, Phone_Number, Email, Mailing_Address, Date_of_Birth) VALUES
('Alice', 'Johnson', '123-456-7890', 'alice.johnson@example.com', '123 Main St, Anytown, USA', '1990-01-01'),
('Bob', 'Smith', '987-654-3210', 'bob.smith@example.com', '456 Oak Ave, Anytown, USA', '1985-05-15'),
('Charlie', 'Brown', '456-789-0123', 'charlie.brown@example.com', '789 Elm St, Anytown, USA', '1988-09-20'),
('Diana', 'Williams', '789-012-3456', 'diana.williams@example.com', '321 Maple Dr, Anytown, USA', '1975-03-10'),
('Eva', 'Taylor', '321-654-9870', 'eva.taylor@example.com', '654 Pine St, Anytown, USA', '2000-12-05'),
('Frank', 'Martinez', '654-987-0123', 'frank.martinez@example.com', '987 Cedar Ave, Anytown, USA', '1998-07-25'),
('Grace', 'Jones', '012-345-6789', 'grace.jones@example.com', '147 Walnut Dr, Anytown, USA', '1980-11-30'),
('Henry', 'Garcia', '234-567-8901', 'henry.garcia@example.com', '258 Oak St, Anytown, USA', '1995-04-18'),
('Ivy', 'Davis', '567-890-1234', 'ivy.davis@example.com', '369 Maple Ave, Anytown, USA', '1993-08-15'),
('Jack', 'Anderson', '890-123-4567', 'jack.anderson@example.com', '963 Pine Dr, Anytown, USA', '1992-10-22');

-- Populating Surgery_Location table with dummy data
INSERT INTO Surgery_Location (Name, Address, Contact_Number) VALUES
('Dental Clinic A', '123 Main St, Anytown, USA', '123-456-7890'),
('Dental Clinic B', '456 Oak Ave, Anytown, USA', '987-654-3210'),
('Dental Clinic C', '789 Elm St, Anytown, USA', '456-789-0123'),
('Dental Clinic D', '321 Maple Dr, Anytown, USA', '789-012-3456'),
('Dental Clinic E', '654 Pine St, Anytown, USA', '321-654-9870'),
('Dental Clinic F', '987 Cedar Ave, Anytown, USA', '654-987-0123'),
('Dental Clinic G', '147 Walnut Dr, Anytown, USA', '012-345-6789'),
('Dental Clinic H', '258 Oak St, Anytown, USA', '234-567-8901'),
('Dental Clinic I', '369 Maple Ave, Anytown, USA', '567-890-1234'),
('Dental Clinic J', '963 Pine Dr, Anytown, USA', '890-123-4567');

-- Populating Appointment table with dummy data
INSERT INTO Appointment (Dentist_ID, Patient_ID, Date_Time) VALUES
(1, 1, '2024-04-05 09:00:00'),
(2, 2, '2024-04-06 10:00:00'),
(3, 3, '2024-04-07 11:00:00'),
(4, 4, '2024-04-08 12:00:00'),
(5, 5, '2024-04-09 13:00:00'),
(6, 6, '2024-04-10 14:00:00'),
(7, 7, '2024-04-11 15:00:00'),
(8, 8, '2024-04-12 16:00:00'),
(9, 9, '2024-04-13 17:00:00'),
(10, 10, '2024-04-14 18:00:00');

