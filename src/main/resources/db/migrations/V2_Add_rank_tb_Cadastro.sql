-- V2: Migration para adicionar a coluna de Rank na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);