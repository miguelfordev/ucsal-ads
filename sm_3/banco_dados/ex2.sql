select nome, genero, profissao from cliente order by nome desc;

select nome from cliente where nome like '%r%';

select nome from cliente where nome like 'C%';

select nome from cliente where nome like '%a';

select nome, bairro from cliente where bairro like 'Centro';

select nome, complemento from cliente where complemento like 'A%';

select nome, genero from cliente where genero like 'F';

/*select nome, cpf from cliente where cpf like 'null';*/

select nome, profissao from cliente order by profissao asc;

select nome, nacionalidade from cliente where nacionalidade like 'Brasileira';

/*select nome, numero from cliente;*/

select nome, uf from cliente where uf like 'SC';

select nome, data_nascimente from cliente where data_nascimente > '2000-01-01' and  data_nascimente < '2002-01-01';



