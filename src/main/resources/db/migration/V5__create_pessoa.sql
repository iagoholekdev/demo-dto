CREATE TABLE pessoa (
                        id SERIAL PRIMARY KEY,
                        nome VARCHAR(255) NOT NULL,
                        data_nascimento DATE,
                        cpf VARCHAR(11) UNIQUE,
                        enderecoid BIGINT,
                        FOREIGN KEY (enderecoid) REFERENCES endereco(id)
);


CREATE SEQUENCE pessoa_sequence;

ALTER TABLE pessoa ALTER COLUMN id SET DEFAULT nextval('pessoa_sequence');