Este repositório foi criado para documentar e armazenar os arquivos do trabalho prático da matéria de Programção Orientada a Objetos II  Do curso de Engenharia de Software da UDESC CEAVI.
Alguns passos necessários para funcionamento da aplicação.
1) Ter baixado e configurado postgreSQL e uma gui para administração de banco de dados, recomendado pgAdmin.
2) IDE e java instalado para executar projeto.
3) No pacote "connection" na classe "Conexao" modificar o endereço e informações("usuário e "senha") para acesso ao banco criado para utilizar a aplicação.
4) Criar tabelas produtos, clientes e vendas da seguintes maneiras:

CREATE TABLE clientes(
id_cliente SERIAL PRIMARY KEY,
nome Varchar(60),
cpf VARCHAR(11),
telefone(11),
pontos NUMERIC(10,2)
)
CREATE TABLE produtos(
id_produto SERIAL PRIMARY KEY,
nome Varchar(30),
preco NUMERIC(10,2),
tipo VARCHAR(11),
Quantidade Integer
)
CREATE TABLE vendas(
id_venda SERIAL PRIMARY KEY,
cpf_cliente VARCHAR(11),
valor_venda NUMERIC(10,2),
form_pag VARCHAR(25),
data_venda TIMESTAMP DEFAULT NOW()
)
data_venda TIMESTAMP DEFAULT NOW()
)
