USE alas_al_aire;

INSERT INTO EMPLEADO (Nombre,Direccion,Salario) VALUES ("Ale John", "Plaza Mayor 7, Madrid", 48924.55);
INSERT INTO EMPLEADO (Nombre,Direccion,Salario) VALUES ("María Escudero", "Paseo del Gato Gordo 21, Segovia", 21718.29);
INSERT INTO EMPLEADO (Nombre,Direccion,Salario) VALUES ("Federico Cabezón", "Camino Sin Asfaltar 34, Zamora", 48924.55);
INSERT INTO EMPLEADO (Nombre,Direccion,Salario) VALUES ("David Donato", "Calle del Atolladoreo 34, Zamora", 24324.32);
INSERT INTO EMPLEADO (Nombre,Direccion,Salario) VALUES ("Mika Mala", "Glorieta del Mordisco 4, Tenerife", 36417.23);

INSERT INTO APARATO
   SELECT Model, Manufacturer FROM legacy.AIRCRAFT;

INSERT INTO AVION 
   SELECT Hexident, Model FROM legacy.AIRCRAFT;
--
UPDATE EMPLEADO SET Salario = Salario*1.05;
UPDATE EMPLEADO SET Salario = Salario*1.02 WHERE Salario < 30000;
--
DELETE FROM EMPLEADO WHERE Nombre = "Mika Mala";


INSERT INTO VUELO VALUES  ("ALA1804", "2020-11-27", "2020-11-27 23:55:00", "2018-11-23 08:18:00", "MAD", "SCL", "AC4532");
INSERT INTO REGISTRAR_EMPLEADO (SELECT NumEmpleado, "ALA1804", "2020-11-27" FROM EMPLEADO WHERE Nombre = "Ale John");

INSERT INTO VUELO VALUES  ("ALA0204", "2020-12-07", "2020-12-07 15:24:00", "2018-11-23 16:23:00", "MAD", "PMI", "467832");
INSERT INTO REGISTRAR_EMPLEADO (SELECT NumEmpleado, "ALA0204", "2020-12-07" FROM EMPLEADO WHERE Nombre = "María Escudero");

INSERT INTO PASAJERO (Nombre, Direccion, Telefono) VALUES ("Ángel Martínez", "Calle del Trabajo Duro 7, Zamora", "678987654");
INSERT INTO REGISTRAR_PASAJERO VALUES ("Ángel Martínez", "Calle del Trabajo Duro 7, Zamora", "ALA1804", "2020-11-27");

INSERT INTO PASAJERO (Nombre, Direccion, Telefono) VALUES ("Marcos Mola", "Plaza de las Ventas 25, Madrid", "60123456");
INSERT INTO REGISTRAR_PASAJERO VALUE ("Marcos Mola", "Plaza de las Ventas 25, Madrid", "ALA1804", "2020-11-27");

DELETE FROM AVION WHERE Modelo = "LearJet 40XR";
INSERT INTO APARATO VALUES ("A380","Airbus");
INSERT INTO AVION VALUES ("180429","A380");


UPDATE PASAJERO SET Telefono = "621748785" WHERE Nombre = "Marcos Mola";
INSERT INTO REGISTRAR_PASAJERO VALUE ("Marcos Mola", "Plaza de las Ventas 25, Madrid", "ALA0204", "2020-12-07");
DELETE FROM REGISTRAR_PASAJERO WHERE Nombre = "Marcos Mola" AND Direccion = "Plaza de las Ventas 25, Madrid" AND Numero = "ALA1804" AND Fecha ="2020-11-27";