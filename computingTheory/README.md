# Teoria-da-Computacao Casamento de Strings

O sistema foi realizado em linguagem C++, e o mesmo funciona da seguinte maneira, ele é dividido em 3 arquivos, sendo eles dois arquivos (.cpp) e um header (.hpp), para melhor organização e entendimento do código em sí.

Onde no arquivo main.cpp possui uma entrada (fita finita que será percorrida), cujo o alfabeto {a,...z}, sendo ela uma cadeia de símbolos, conforme o que o usuário digitar. Essa cadeia de símbolos possui o comprimento de entrada |250|, e o comprimento do prefixo, sufixo e subpalavra |30|.

Assim, no arquivo casamento.cpp teremos as funções StartsWith, no qual irá receber a entrada e o prefixo digitado, e irá percorrer o prefixo da palavra escolhida até encontrar o desejado, ou seja o StartsWith irá encontrar somente o começo da palavra.

Teremos também a função EndsWith, que irá fazer o mesmo processo, porém percorrendo de trás para frente até encontrar o desejado, ou seja o EndsWith irá mostrar somente o final da palavra.

Já na função subpalavra, irá percorre tudo, pois qualquer prefixo e sufixo de uma palavra é uma subpalavra, e caso o usuário digite algo inválido, o mesmo não terá uma subpalavra.

Por último, no arquivo header (.hpp) estará todos os protótipos das funções realizadas para realizar todo esse procedimento.
