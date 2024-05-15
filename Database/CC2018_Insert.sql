------------------------------INSERT AUTORES------------------------------------
INSERT into Autores
values ('1', 'Cassia', 'lahdh');

INSERT into Autores
values ('2','Ailtao','jahsua');

INSERT into Autores
values ('3','Thiellen','kallaa');

INSERT into Autores
values ('4','Ramon','ashdau');

INSERT into Autores
values ('5','Larissa','oioioi');

------------------------------INSERT EDITORAS-----------------------------------
INSERT INTO Editoras
values ('1', 'Saraiva', 'Rua Sao Bento', '86360000');

INSERT INTO Editoras
values ('2', 'Alpha', 'avenida bandeirantes', '855441020');

INSERT INTO Editoras
values ('3', 'Abril', 'Rua Sao paulo', '7854554540');

INSERT INTO Editoras
values ('4', 'Atlas', 'Rua Sao paulo', '750054222');

INSERT INTO Editoras
values ('5', 'Artmed', 'Rua Sao paulo', '7205230000');

------------------------------INSERT LIVROS-------------------------------------

INSERT INTO Livros
values ('1','aahuasa','Programacao','2004','Saraiva','5','1');

INSERT INTO Livros
values ('2','kdkdkdkdk','Gene do mal','2013','Abril','2','3');

INSERT INTO Livros
values ('3','lokokoko','Marley e eu','2000','Atlas','1','4');

INSERT INTO Livros
values ('4','juhujuh','Crepusculo','2005','Alpha','3','3');

INSERT INTO Livros
values ('5','buyebe','O ladrao de raios','2001','Saraiva','4','1');

------------------------------INSERT EXEMPLARES--------------------------------

INSERT INTO Exemplares
values ('1','10/08/2002','4');

INSERT INTO Exemplares
values ('2','25/07/2013','3');

INSERT INTO Exemplares
values ('3','1/07/2015','1');

INSERT INTO Exemplares
values ('4','8/05/2018','2');

INSERT INTO Exemplares
values ('5','19/04/2014','5');

------------------------------INSERT LEITOR-------------------------------------

INSERT INTO Leitor
values ('1','Maria','avenida paranapanema','86360000','Rio de janeiro');

INSERT INTO Leitor
values ('2','Joao','avenida brasil','8647529','Sao paulo');

INSERT INTO Leitor
values ('3','Mariana','rua sergipe','8975642','brasilia');

INSERT INTO Leitor
values ('4','Marcos','rua sao paulo','78946465','pernambuco');

INSERT INTO Leitor
values ('5','Carlos','rua Frei Rafael Proner ','784563254','bauru');

------------------------------INSERT LIVRO AUTORES-------------------------------

INSERT INTO LivrosAutores
values ('1','2');

INSERT INTO LivrosAutores
values ('2','3');

INSERT INTO LivrosAutores
values ('3','4');

INSERT INTO LivrosAutores
values ('4','5');

INSERT INTO LivrosAutores
values ('5','1');

------------------------------INSERT PALAVRAS CHAVE-----------------------------

INSERT INTO PalavrasChave
values ('2');

INSERT INTO PalavrasChave
values ('3');

INSERT INTO PalavrasChave
values ('1');

INSERT INTO PalavrasChave
values ('5');

INSERT INTO PalavrasChave
values ('4');

------------------------------INSERT LIVRO PALAVRAS-----------------------------
INSERT INTO LivrosPalavras
values ('1','2');

INSERT INTO LivrosPalavras
values ('2','3');

INSERT INTO LivrosPalavras
values ('3','4');

INSERT INTO LivrosPalavras
values ('4','5');

INSERT INTO LivrosPalavras
values ('5','2');

------------------------------INSERT REQUISIÇÕES--------------------------------
INSERT INTO Requisicoes
values ('1','20/04/2013 09:00:00','30/01/2015 13:00:00','31/01/2016 14:00:00','10.50','2','1');

INSERT INTO Requisicoes
values ('2','20/05/2013 22:00:00','30/01/2012 21:00:00','11/11/2011 23:00:00','20.00','1','2');

INSERT INTO Requisicoes
values ('3','31/05/2018 10:00:00','10/05/2016 12:00:00','11/04/2011 08:00:00','15.00','3','5');

INSERT INTO Requisicoes
values ('4','1/01/2001 15:00:00','10/06/2012 16:00:00','15/06/2017 17:00:00','30.00','5','4');

INSERT INTO Requisicoes
values ('5','02/02/2002 01:00:00','27/05/2000 02:00:00','20/08/2014 03:00:00','40.00','1','2');