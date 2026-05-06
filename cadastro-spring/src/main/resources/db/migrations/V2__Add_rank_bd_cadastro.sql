-- V2: Migration para adicionar a coluna de Rank na tabela de cadastros

ALTER TABLE bd_cadastro
ADD COLUMN rank VARCHAR(255);
