#script sql 

create database rentaVehiculos;
use rentaVehiculos;




		Create table carro (
		carro_id integer unsigned auto_increment primary key,
		marca varchar(20) not null,
		modelo varchar (20) not null,
		anio integer not null,
		color_vehiculo varchar(20) not null,
		tipo_vehiculo varchar(20) not null,
		placa varchar(20) not null,
		cantidad_pasajeros integer not null,
		kilometraje integer not null,
		aire_acondicionado varchar(10) not null,
		valor_x_dia decimal not null,
		contrato integer not null);
		
		insert into carro (marca, modelo, anio, color_vehiculo, tipo_vehiculo, placa, cantidad_pasajeros, kilometraje, aire_acondicionado, valor_x_dia) values ('Ford', 'fiesta', '2010', 'Blanco', 'SUV', 'EFD543', '2', '1000', 'Si', '20');
insert into carro (marca, modelo, anio, color_vehiculo, tipo_vehiculo, placa, cantidad_pasajeros, kilometraje, aire_acondicionado, valor_x_dia) values ('Fiat', 'cronos', '2019', 'Gris', 'Sedan', 'JKL022', '4', '2001', 'Si', '35');



Create table cliente (s
cliente_id integer unsigned auto_increment primary key;
nombre varchar(20) not null,
apellido varchar(20) not null,
fecha_nacimiento date not null,
num_identificacion integer not null,
fecha_vencimiento_identificacion date not null,
num_telefonico integer not null);





Create table contratos (
contrato_id integer unsigned auto_increment primary key,
num_contrato integer not null,
fecha_de_inicio date not null,
duracion integer not null,
valor_alq_x_dia decimal not null,
valor_total_contrato decimal not null,
valor_cancelado decimal not null,
dias_en_mora integer not null,
saldo_mora decimal not null,
saldo_total decimal not null);




Create table logins (
login_id integer unsigned auto_increment primary key,
login varchar(20) not null,
contraseña varchar(20) not null,
fecha_expiracion date not null);
