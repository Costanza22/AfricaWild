CREATE TABLE animais (
  chipagem VARCHAR(50) PRIMARY KEY,
  especie VARCHAR(100),
  reino VARCHAR(100),
  alimentacao VARCHAR(100),
  comportamento VARCHAR(100),
  habitat VARCHAR(100),
  ameacado BOOLEAN,
  populacao_estimada INT,
  tempo_vida INT,
  peso FLOAT
);
