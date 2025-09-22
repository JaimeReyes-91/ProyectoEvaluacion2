create table public.estudiante(
idestudiante serial primary key,
carnet varchar(20) not null,
primernombre varchar (100) not null,
segundonombre varchar (100),
apellido varchar (100) not null,
direccion varchar (100) not null,
telefono int,
carrera varchar(100) not null,
fechanacimiento varchar(20),
fechaingreso varchar(20),
cuotamensual decimal(10,2)
);

select * from public.estudiante