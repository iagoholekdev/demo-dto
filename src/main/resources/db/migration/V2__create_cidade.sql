
CREATE TABLE cidade (
                        id SERIAL PRIMARY KEY,
                        nome VARCHAR(255) NOT NULL,
                        estadoid BIGINT,
                        FOREIGN KEY (estadoid) REFERENCES estado(id)
);

CREATE SEQUENCE cidade_sequence;


ALTER TABLE cidade ALTER COLUMN id SET DEFAULT nextval('cidade_sequence');
