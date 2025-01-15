-- comando para criar uma tabela e definir o nome em seguida.
create table cliente (
	idcliente integer not null, -- codigo unico do cliente e opção not null para todo cliente sempre terá que ter um codigo.
	nome varchar (50) not null, -- tipo dinamico, exemplo: pedro tem 5 caracteres então só irá ocupar 5 posições para armazenar os espaços diferente do char.
	cpf char (11), -- o tipo char sempre tera 11 espaços ocupados independente do tamanho do cpf.
	rg varchar(15), -- campo dinamico
	data_nascimente date,
	genero char(1),
	profissao varchar(30),
	nacionalidade varchar(30),
	logradouro varchar(30),
	numero varchar(10),
	complemento varchar(30),
	bairro varchar(30),
	municipio varchar(30),
	uf varchar(30),
	observacoes text,

	-- primary key (chave primaria) um numero associado a tabela de clientes
	constraint pk_cln_idcliente primary key(idcliente)
	
)

-- comando sql: insert (inserindo na tabela de cliente)
insert into cliente (idcliente, nome, cpf, rg, data_nascimente, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
-- comando sql: values (onde irá fazer a inserção em cada um dos campos acima)
values (1,'Manoel','88828383821', '323232', '2001-01-30', 'M', 'Estudante', 'Brasileira', 'Rua Joaquim Nabuco', '23', 'Casa', 'Cidade Nova', 'Porto União', 'SC');
-- é importante colocar ponto e virgula (;) ao final do código pois é possivel executar uma linha de código especifico.

insert into cliente (idcliente, nome, cpf, rg, data_nascimente, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (2,'Geraldo','12343299922', '5656565', '1987-01-04', 'M', 'Engenheiro', 'Brasileira', 'Rua das Limas', '20A2B', 'Ap', 'Centro', 'Poro Uniao', 'SC', null);