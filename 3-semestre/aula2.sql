-- consulta simples 1

select * from cliente; -- comando para ver toda a tabela

select nome, data_nascimente from cliente; -- comando com filtro de acordo com o campo de dados

select nome, data_nascimente as "Data de nascimento" from cliente; -- alterando o nome do campo (renomando um coluna)

select 'CPF: ' || cpf || ' RG: ' || rg as "CPF e RG" from cliente; -- concatenando colunas

select * from cliente limit 3; -- limitando o numero de clientes 

select nome, data_nascimente from cliente where data_nascimente > '2000-01-01'; -- filtrando a tabela 

select nome from cliente where nome like 'C%'; -- filtando começando com a letra C e seguido de qualquer outro caracter

select nome from cliente where nome like '%c%'; -- indica que começa com qualquer caracter e terminar com qualquer caracter

select nome, data_nascimente from cliente where data_nascimente between '1990-01-01' and '1998-01-01'; -- filtrando cliente entre as datas

select nome, rg from cliente where rg is null; -- caso tenha campos nulos (null)

select nome from cliente order by nome asc; -- ordenando em ordem alfabetica

select nome from cliente order by nome desc; -- ordem descendente