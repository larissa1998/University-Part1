
-------------------------DELETE POR LINHA-----------------------
DELETE FROM LivrosPalavras
WHERE idPalavra = '1';

DELETE FROM PalavrasChave
WHERE idPalavra = '1'; 

DELETE FROM Leitor
WHERE idLeitor = 1;

DELETE FROM Editoras
WHERE idEditora = 2;

DELETE FROM Livros
WHERE idLivro = 1;

DELETE FROM Autores
WHERE idAutor = 2;

DELETE FROM Requisicoes
WHERE idRequisicoes = 1;

DELETE FROM Exemplares
WHERE idexemplar = 1;

DELETE FROM LivrosAutores
WHERE idLivro = 1;