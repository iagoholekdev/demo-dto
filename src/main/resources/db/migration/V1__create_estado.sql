CREATE TABLE estado (
                        id SERIAL PRIMARY KEY,
                        nome VARCHAR(255) NOT NULL
);

CREATE SEQUENCE estado_sequence;

ALTER TABLE estado ALTER COLUMN id SET DEFAULT nextval('estado_sequence');