module Cadastro where
import Data.Char  -- Para função toUpper
import System.Environment
import System.IO  -- Biblioteca para Classe IO
import System.IO.Error  -- 
import Control.Exception

-- =================Menu de Opções==================================================--
-- =================================================================================
menu :: IO()
menu = 
 do 
   putStrLn " "
   putStrLn "-----------------------------------------------------------------------------------------------------------------------"
   putStrLn "|                                                                                                                      |"
   putStrLn "|                CADASTRO DE CARROS                                                                                    |"
   putStrLn "|                                                                                                                      |"
   putStrLn "|        a -  Inserir cadastro                                                                                         |"
   putStrLn "|        b -  Excluir um cadastro                                                                                      |"
   putStrLn "|        c -  Excluir todo o cadastro                                                                                  |"
   putStrLn "|        d -  Exibir carros                                                                                            |"
   putStrLn "|        e -  Exibir a média da Velocidade Máxima                                                                      |"
   putStrLn "|        f -  Exibir os carros com tempo de 0-100(s) em um valor informado pelo usuário                                |"
   putStrLn "|        g -  Exibir o(s) carro(s) com maior velocidade máxima                                                         |"
   putStrLn "|        h -  Exibir o(s) carro(s) com menor velocidade máxima                                                         |"
   putStrLn "|        i -  Exibir a soma dos carros com velocidade máxima maior que 280 Km                                          |"
  -- putStrLn "|        j -  Exibir os carros com preço entre dois valores informado pelo usuário                                     |"
  -- putStrLn "|        k -  Exibir a ficha técnica do carro do modelo informado pelo usuário                                         |"
   putStrLn "|        l -  Exibir a soma de todos os carros com a quantidade de ocupantes igual a um valor informado pelo usuário   |"
   putStrLn "-----------------------------------------------------------------------------------------------------------------------"
   putStrLn " "
   putStrLn "Digite uma opção"
   le_opcao

 --Le as opção digitadas no menu --
le_opcao:: IO()
le_opcao =
          do {
              opcao <- getChar;
              putStrLn " "; -- linha necessária para execução do getChar
              f_menu (toUpper(opcao));
             }

--Redireciona para a função
f_menu::Char -> IO()
f_menu s =
          case s of
                   'A' ->  insere_cadastro
                   'B' ->  excluir_um_cadastro
                   'C' ->  excluir_tudo
                   'D' ->  imprime_cadastros
                   'E' ->  media_velocidade
                   'F' ->  busca_por_tempo
                   'G' ->  imprime_vel_maximo
                   'H' ->  imprime_vel_menor
                   'I' -> soma_velocidade
                   'L' -> soma_ocupantes
                   otherwise -> sair s

 -- Funcao sair ----------
sair :: Char -> IO()
sair s |s == 'S' = putStrLn "Saindo do sistema..."
 |otherwise= putStrLn "Opcao invalida..."

--Inserir Cadastro --
-- ================ --
insere_cadastro::IO()
insere_cadastro = 
                 do
                   lixo <- getLine -- Variavel lixo para pegar o enter q vem da função anterior 
                   putStrLn " "
                   putStrLn "Fabricante: "
                   fa <- getLine
                   putStrLn "Modelo: ";
                   mo <- getLine;
                   putStrLn "Velocidade: ";
                   velocidade <- getLine;
                   putStrLn "Tempo 0-100(s)";
                   tp <- getLine;
                   putStrLn "Peso"   
                   pes <- getLine;
                   putStrLn "Ocupantes";
                   oc <- getLine;
                   putStrLn "Preco";
                   pr <- getLine;
                   putStrLn "Quantidade Airbags";
                   ar <- getLine;
                   putStrLn " " -- linha necessária para execução do getChar
                   let cadastro = fa ++"#"++mo++"#"++velocidade++"#"++tp++"#"++pes++"#"++oc++"#"++pr++"#"++ar++"#"
                   appendFile "dados.txt" (cadastro ++ "\n") --insere dados no arquivo
                       
---IMPRIMIR TODOS OS CADASTROS ----
-- ===========================
imprime_cadastros :: IO()
imprime_cadastros =
                   do
                     putStrLn " "
                     putStrLn "---------------------------------------------------"
                     arq <- (openFile "dados.txt" ReadMode) -- Abre o arquivo
                     conteudo <- (hGetContents arq)
                     cadastro <- (converteConteudo (conteudo))
                     imprime cadastro
                     hClose arq -- Fecha arquivo
                     putStrLn "---------------------------------------------------"

---IMPRIMIR OS CADASTROS COM O TEMPO DE 0-100(s) ----
-- ===========================
--Busca por Tempo
busca_por_tempo :: IO()
busca_por_tempo =
                 do
                   lixo <- getLine -- Variavel lixo para pegar o enter q vem da função anterior 
                   putStr ""
                   putStr "Digite o tempo de 0 a 100(s): "
                   tempo <- getLine
                   buscageral achatempo tempo

 ---Funcao que procura o tempo -------------
achatempo::[[String]]->String ->IO()
achatempo [] temp = putStrLn ""
achatempo (x:sx) temp
                  |(read(tempo x)::Int) == (read temp::Int) = do
                                                                putStrLn(foldl1 (\a b->a++" "++b) x)  
                                                                achatempo sx temp
                  |otherwise = achatempo sx temp

--Soma de ocupantes
soma_ocupantes :: IO()
soma_ocupantes =
 do
 lixo <- getLine -- Variavel lixo para pegar o enter q vem da função anterior 
 putStr ""
 putStr "Digite o numero de ocupante: "
 ocupantes <- getLine
 arquivo <- abreArquivo "dados.txt" ReadMode
 conteudo <- (hGetContents arquivo)
 cadastro <- (converteConteudo (conteudo))
 putStrLn (show (somaocupantes cadastro ocupantes))
 fechaArquivo arquivo
 
---------função auxiliar de soma
somaocupantes::[[String]] ->String-> Integer
somaocupantes [] oc = 0
somaocupantes (x:xs) oc 
 |((read(ocupantes x) :: Integer) == (read oc :: Integer)) = 1 + (somaocupantes xs oc)
 |otherwise = somaocupantes xs oc
 
--Exibir os carros com o preço entre dois valores informado pelo usuário

 
----------Soma dos carros com velocidade maior que 280 km
soma_velocidade :: IO()
soma_velocidade =
 do
 arquivo <- abreArquivo "dados.txt" ReadMode
 conteudo <- (hGetContents arquivo)
 cadastro <- (converteConteudo (conteudo))
 putStrLn (show (somavelocidade cadastro))
 fechaArquivo arquivo
 
---------função auxiliar de soma
somavelocidade::[[String]] ->Float
somavelocidade [] = 0
somavelocidade (x:xs) 
 |((read(velocidade x) :: Float) >= 280) = ((read(velocidade x) :: Float) + (somavelocidade xs))
 |otherwise = somavelocidade xs

-- =============================================================================================== -  
-- FUNCOES AUXILIARES DE BUSCA TEMPO-------------
-- ===============================================================================================
buscageral :: ([[String]] -> a -> IO b) -> a -> IO ()
buscageral funcao filtro =
                          do
                            putStrLn " "
                            putStrLn "--------------------------------------------"
                            arquivo <- abreArquivo "dados.txt" ReadMode
                            conteudo <- (hGetContents arquivo)
                            cadastro <- (converteConteudo (conteudo))
                            funcao cadastro filtro --Chama a "funcao" passada no parametro
                            fechaArquivo arquivo
                            putStrLn "-------------------------------------------------------------"

-- ========================================================================================= --
--Funcao Auxiliar de impressao
-- =========================================================================================
imprime :: [[String]] ->IO()
imprime [] = putStrLn ""
imprime (x:xs) = do
                    putStrLn (foldl1 (\a b->a++ " " ++b) x)
                    imprime xs

--Excluir CADASTRO
excluir_um_cadastro :: IO()
excluir_um_cadastro =
                    do
                      lixo <- getLine -- Variavel lixo para pegar o enter q vem da função anterior 
                      putStrLn "O cadastro será apagado pelo nome"
                      putStrLn "Digite o nome desejado:"
                      nome <- getLine
                      arquivo <- abreArquivo "dados.txt" ReadMode
                      conteudo <- (hGetContents arquivo)
                      cadastro <- (converteConteudo (conteudo))
                      let novo_conteudo = apaga_pelo_nome cadastro nome
                      arquivobkp <- abreArquivo "auxiliar.txt" WriteMode
                      hPutStr arquivobkp novo_conteudo
                      fechaArquivo arquivobkp
                      fechaArquivo arquivo
                      copiar "auxiliar.txt" "dados.txt"

--Excluir todo o CADASTRO
excluir_tudo::IO()
excluir_tudo =
 do
   lixo <- getLine -- Variavel lixo para pegar o enter q vem da função anterior 
   putStrLn "Tem certeza que deseja apagar todos os dados do sistema?(s/n)"
   resp <- getChar
   if ((toUpper resp) == 'N')
   then putStr ""
   else do
         {
          arquivo <- abreArquivo "dados.txt" WriteMode;
          fechaArquivo arquivo;
          putStrLn "Dados Apagados";
         }


media_velocidade :: IO()
media_velocidade = 
 do
 arquivo <- abreArquivo "dados.txt" ReadMode
 conteudo <- (hGetContents arquivo)
 cadastro <- (converteConteudo (conteudo))
 --imprime cadastro
 putStrLn(show (mediaVelocidade cadastro))
 fechaArquivo arquivo
 
----------TESTE MAIOR VELOCIDADE
--Exibir o(s) carro(s) com maior velocidade máxima      
imprime_vel_maximo :: IO()
imprime_vel_maximo = do    
                        arq <- (openFile "dados.txt" ReadMode)
                        conteudo <- (hGetContents arq)
                        cadastro <- (converteConteudo (conteudo))
                        imprime_vel_maximo_aux cadastro (maior_vel_maximo cadastro)
                        fechaArquivo arq
  
imprime_vel_maximo_aux :: [[String]] -> String -> IO()
imprime_vel_maximo_aux [] maior = putStrLn " "
imprime_vel_maximo_aux (x:sz) maior
                              |(read(velocidade x)::Float) >= (read(maior)::Float) = do
                                                                                {
                                                                                putStrLn(foldl1 (\x sz->x++" "++sz) x);
                                                                                imprime_vel_maximo_aux sz maior;
                                                                                }
                              |otherwise = imprime_vel_maximo_aux sz maior

-- Exibir carros com a maior velocidade maxima
maior_vel_maximo :: [[String]] -> String
maior_vel_maximo [] = "0"
maior_vel_maximo (x:sz)
 |(read(velocidade x)::Float) >= (read(maior_vel_maximo sz)::Float) = velocidade x
 | otherwise = maior_vel_maximo sz

--Exibir os carros com menor velocidade maxima
imprime_vel_menor :: IO()
imprime_vel_menor = do 
                        arq <- (openFile "dados.txt" ReadMode)
                        conteudo <- (hGetContents arq)
                        cadastro <- (converteConteudo (conteudo))
                        imprime_vel_menor_aux  cadastro (menor_vel_maximo cadastro)
                        fechaArquivo arq
  
imprime_vel_menor_aux :: [[String]] -> String -> IO()
imprime_vel_menor_aux  [] menor = putStrLn " "
imprime_vel_menor_aux  (x:sz) menor
                              |(read(velocidade x)::Float) <= (read(menor)::Float) = do
                                                                                {
                                                                                putStrLn(foldl1 (\x sz->x++" "++sz) x);
                                                                                imprime_vel_menor_aux  sz menor;
                                                                                }
                              |otherwise = imprime_vel_menor_aux  sz menor

-- retorna qual o menor preço mínimo no conteúdo passado
menor_vel_maximo :: [[String]] -> String
menor_vel_maximo [] = "1000"
menor_vel_maximo (x:sz) = do
                        let menor = menor_vel_maximo sz
                        if (read(velocidade x)::Float) < (read(menor)::Float)
                        then velocidade x
                        else menor
-- ==============================================================================
-- FUNÇÕES COM NUMEROS
-- ==============================================================================

-- somaVelocidade
somaVelocidade::[[String]] -> Float
somaVelocidade [] = 0
somaVelocidade (x:xs) = (read (velocidade x) :: Float) + (somaVelocidade xs)

--MediaVelocidade
mediaVelocidade::[[String]] -> Float
mediaVelocidade [] = 0
mediaVelocidade x = (somaVelocidade x) / fromIntegral(length x)

-- ============================================FUNCAO Auxiliar EXCLUSÃO ==============
apaga_pelo_nome :: [[String]]->String->String
apaga_pelo_nome [] fa = "\n"
apaga_pelo_nome (x:xs) fa
 |fa == (nome x) = (apaga_pelo_nome xs fa)
 |otherwise = (foldl1 (\a b->a++"#"++b) x) ++ "\n" ++ (apaga_pelo_nome xs fa)

--Funcao Auxiliar Consulta----------
converteConteudo :: String -> IO [[String]]
converteConteudo conteudo = return (map (explodir '#') (explodir '\n' conteudo))


--Funcao Auxiliar
explodir :: Eq a=> a -> [a] -> [[a]]
explodir a [] = []
explodir a(x:xs)
                |(takeWhile (/=a) (x:xs)) == [] = explodir a xs
                |x == a = (takeWhile (/=a) xs) : explodir a (dropWhile (/= a) xs)
                |otherwise = (takeWhile (/= a)(x:xs)) : explodir a (dropWhile (/=a) (x:xs))


--Retorna a posicao 
nome, modelo,velocidade,tempo,peso,ocupantes,preco,airbag :: [String] -> String
nome (a:b:c:d:e:f:g:h:[]) = a
modelo(a:b:c:d:e:f:g:h:[]) = b
velocidade(a:b:c:d:e:f:g:h:[]) = c
tempo(a:b:c:d:e:f:g:h:[]) = d
peso(a:b:c:d:e:f:g:h:[]) = e
ocupantes(a:b:c:d:e:f:g:h:[]) = f
preco(a:b:c:d:e:f:g:h:[]) = g
airbag(a:b:c:d:e:f:g:h:[]) = h

----------------------------------------------------------------------------------
---- FUNCAO AUXILIARES DE ARQUIVO
----------------------------------------------------------------------------------
abreArquivo :: String -> IOMode -> IO Handle
abreArquivo arquivo modo = do
{catch (abrir) trata_erro}
 where
 abrir = do
 {
 conteudo <- openFile arquivo modo;
 return conteudo;
 }
 trata_erro erro = if isDoesNotExistError erro 
 then do
 {
 putStr "Arquivo não existe";
 putStrLn "Será criado automaticamente um arquivo em branco";
 conteudo <- openFile "dados.txt" WriteMode;
 fechaArquivo conteudo;
 abreArquivo "dados.txt" ReadMode
 }
 else ioError erro
 

fechaArquivo :: Handle -> IO()
fechaArquivo handle_arq = hClose handle_arq


-- ============================== Copiar Origem e Destino =============================
copiar origem destino =
 do
 arquivoO <- abreArquivo origem ReadMode
 conteudo <- (hGetContents arquivoO)
 arquivoD <-  abreArquivo destino WriteMode
 hPutStr arquivoD conteudo
 fechaArquivo arquivoD
 fechaArquivo arquivoO
