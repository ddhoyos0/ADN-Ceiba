---- Identificacion
INSERT INTO public.identificacion(id, tipo)	VALUES (1, 'Cedula de Ciudadanía');
INSERT INTO public.identificacion(id, tipo)	VALUES (2, 'Tarjeta de Identidad');
INSERT INTO public.identificacion(id, tipo)	VALUES (3, 'Nit');

---- Personas
INSERT INTO public.personas(
	id, celular, direccion, documento, email, estado, nombre, identificacion_id)
	VALUES (1, '3224567893', 'Calle 64 # 24-32', '1077625434', 'jose@gmail.com', false, 'Jose carlos Hoyos', 1);
	
INSERT INTO public.personas(
  id, celular, direccion, documento, email, estado, nombre, identificacion_id)
  VALUES (2, '3229809343', 'Calle 43 # 21-12', '1566778903', 'cami@gmail.com', false, 'Camila Hernandez Hoyos', 1);
  
INSERT INTO public.personas(
  id, celular, direccion, documento, email, estado, nombre, identificacion_id)
  VALUES (3, '3225467890', 'calle 34 # 43-34', '10778324', 'carlos@gmail.com', false, 'carlos ramos', 1);
   
---- Empleado
INSERT INTO public.empleado_entity(
	id, estado, porcentaje, persona_id)
	VALUES (1, false, 50, 2);
	
	
---- Servicios
INSERT INTO public.servicios(
	id, estado, precio, tipo)
	VALUES (1, false, 15000, 'Manicure');
	
INSERT INTO public.servicios(
	id, estado, precio, tipo)
	VALUES (2, false, 15000, 'Pedicure');
	
INSERT INTO public.citas(
	id, estado, fecha, empleado_id, persona_id, servicio_id)
	VALUES (1, false, '2020-10-27T12:30:00.107', 1, 1, 2);