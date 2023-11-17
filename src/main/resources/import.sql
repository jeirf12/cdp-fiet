insert into docentes (id_persona, apellidos, nombres, numero_identificacion, tipo_identificacion, correo, departamento, vinculacion) values (1, "Gironza Pino", "Adrian Felipe", "231141234", "CC", "adrian@asae.co", "sistemas", "vinculacion 1")
insert into docentes (id_persona, apellidos, nombres, numero_identificacion, tipo_identificacion, correo, departamento, vinculacion) values (2, "Ruiz Figueroa", "Jhonfer", "843743834", "CC", "jhonfer@asae.co", "sistemas", "vinculacion 2")
insert into docentes (id_persona, apellidos, nombres, numero_identificacion, tipo_identificacion, correo, departamento, vinculacion) values (3, "Rosero Cortes", "Jhonny Mateo", "2311434534", "CC", "jhonny@asae.co", "electronica", "vinculacion 3")
insert into docentes (id_persona, apellidos, nombres, numero_identificacion, tipo_identificacion, correo, departamento, vinculacion) values (4, "Velasco Mosquera", "Jesus Alberto", "87362371234", "CC", "jesus@asae.co", "electronica", "vinculacion 4")

insert into direcciones (id_persona, ciudad, direccion_residencia, pais) values (1, "popayan", "calle1", "colombia")
insert into direcciones (id_persona, ciudad, direccion_residencia, pais) values (2, "popayan", "calle2", "colombia")
insert into direcciones (id_persona, ciudad, direccion_residencia, pais) values (3, "popayan", "calle3", "colombia")
insert into direcciones (id_persona, ciudad, direccion_residencia, pais) values (4, "popayan", "calle4", "colombia")

insert into tipos (id_tipo, nombre) values (1, "revista")
insert into tipos (id_tipo, nombre) values (2, "periodico")
insert into tipos (id_tipo, nombre) values (3, "pagina web")

UPDATE hibernate_sequence SET next_val = 5 WHERE 1