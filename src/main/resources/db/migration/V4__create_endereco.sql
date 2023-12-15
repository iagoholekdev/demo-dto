
CREATE TABLE endereco (
                          id SERIAL PRIMARY KEY,
                          rua VARCHAR(255) NOT NULL,
                          cep VARCHAR(10),
                          bairroid BIGINT,
                          FOREIGN KEY (bairroid) REFERENCES bairro(id)
);

CREATE SEQUENCE endereco_sequence;

ALTER TABLE endereco ALTER COLUMN id SET DEFAULT nextval('endereco_sequence');
