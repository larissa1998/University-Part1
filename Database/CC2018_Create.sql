--------------------------------------CREATE AUTORES------------------------------------------
CREATE TABLE Autores
(idAutor	integer,
 nome	    varchar(200) NOT NULL,
 DDN    	char(20),
 CONSTRAINT pk_autores primary key (idAutor));
  
 --------------------------------------CREATE EDITORAS----------------------------------------
CREATE TABLE Editoras
(idEditora     integer,
 nome	       varchar(150),
 endereco      varchar (150),
 cep           char(20),
 CONSTRAINT pk_editoras primary key (idEditora));

 --------------------------------------CREATE PALAVRAS CHAVE----------------------------------
CREATE TABLE PalavrasChave
(idPalavra    varchar(20),
 CONSTRAINT pk_palavras_chave primary key (idPalavra));

--------------------------------------CREATE LIVROS-------------------------------------------
CREATE TABLE Livros
(idLivro     integer,
 isbn        char(20),
 titulo      varchar(50),
 ano         char(4),
 edicao      char(20),
 quota       numeric(5,0),
 idEditora   integer,
 CONSTRAINT  pk_livros primary key (idLivro),
 CONSTRAINT  fk_editoras foreign key (idEditora) references Editoras(idEditora)); 

 --------------------------------------CREATE LIVROS AUTORES----------------------------------
CREATE TABLE LivrosAutores
(idLivro      integer,
 idAutor      integer,
 CONSTRAINT fk_livros foreign key (idLivro) references Livros (idLivro),
 CONSTRAINT fk_autores foreign key (idAutor) references Autores(idAutor));

 --------------------------------------CREATE LIVROS PALAVRAS---------------------------------
CREATE TABLE LivrosPalavras
(idPalavra  varchar(20),
 idLivro    integer,
 CONSTRAINT fk_palavras_chave foreign key (idPalavra) references PalavrasChave(idPalavra),
 CONSTRAINT fk_livros foreign key (idLivro) references Livros(idLivro));

 --------------------------------------CREATE EXEMPLARES--------------------------------------
CREATE TABLE Exemplares
(idExemplar    integer,
 dataAquisicao date,
 idLivro       integer,
 CONSTRAINT pk_exemplares primary key (idExemplar),
 CONSTRAINT fk_livros foreign key (idLivro) references Livros(idLivro));

 --------------------------------------CREATE LEITOR------------------------------------------
CREATE TABLE Leitor
(idLeitor   integer,
 nome       varchar(200),
 endereco   varchar(200),
 cep        char(20),
 localidade varchar(150),
 CONSTRAINT pk_leitor primary key (idLeitor));

 --------------------------------------CREATE REQUISIÇÕES-------------------------------------
CREATE TABLE Requisicoes
(idRequisicoes   integer,
 dataRequisicao  Timestamp,
 dataPrevEntrega timestamp,
 dataRealEntrega timestamp,
 valorMulta      decimal(10,2),
 idExemplar      integer,
 idLeitor        integer,
 CONSTRAINT pk_requisicoes primary key (idRequisicoes),
 CONSTRAINT fk_exemplares foreign key (idExemplar) references Exemplares(idExemplar),
 CONSTRAINT fk_leitor foreign key (idLeitor) references Leitor(idLeitor));