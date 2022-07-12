
CREATE TABLE IF NOT EXISTS public.studente
(
    id_studente serial,
    nome_studente character varying,
	cognome_studente character varying,
    PRIMARY KEY (id_studente)
);

CREATE TABLE IF NOT EXISTS public.materia
(
    id_materia serial,
    nome_materia character varying,
    PRIMARY KEY (id_materia)
);

CREATE TABLE IF NOT EXISTS public.esame
(
    id_studente integer,
    id_materia integer,
    voto_esame integer,
    data_esame date,
    ore_assenza integer,
    PRIMARY KEY (id_studente, id_materia),
	FOREIGN KEY (id_studente)
    REFERENCES public.studente (id_studente),
	FOREIGN KEY (id_materia)
    REFERENCES public.materia (id_materia)
);

	
INSERT INTO studente (nome_studente, cognome_studente) VALUES ('Alessio', 'Cuoccio'), ('Andrea', 'Maggiulli'), ('Eugenio', 'Tolardo');
INSERT INTO materia (nome_materia) VALUES ('Informatica'), ('Matematica'), ('Inglese');
INSERT INTO esame VALUES (1, 1, 8, '30/05/2022', 5), (2, 1, 7.5, '30/05/2022', 2), (3, 2, 4, '29/05/2022', 3);
INSERT INTO esame VALUES (2, 2, 3, '28/05/2022', 10);

SELECT nome_studente, cognome_studente, nome_materia, voto_esame, ore_assenza
FROM studente natural join esame natural join materia
WHERE voto_esame < 6;

SELECT nome_materia, count(voto_esame)
FROM esame natural join materia
GROUP BY nome_materia;

