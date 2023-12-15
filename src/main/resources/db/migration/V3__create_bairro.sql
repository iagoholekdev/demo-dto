CREATE TABLE bairro (
                        id SERIAL PRIMARY KEY,
                        rua VARCHAR(255) NOT NULL,
                        cidadeid BIGINT,
                        FOREIGN KEY (cidadeid) REFERENCES cidade(id)
);

CREATE SEQUENCE bairro_sequence;

ALTER TABLE bairro ALTER COLUMN id SET DEFAULT nextval('bairro_sequence');
