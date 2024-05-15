//INTERPRETADOR
#include <cstdio>
#include <cctype>
#include <string>
#include <cstdlib>
#include <iostream>
#define PLUS   258
#define MINUS  255
#define NUMBER 256
#define SYMBOL 257

using namespace std;

struct token{
    int type;//Declarando um tipo
    int value;//Declarando um valor + -
};

string input;
int pos =0;
char peek = ' '; //cada caractere da entrada
token lookahead; //cada elemento da entrada

//inputreader
int nextToken(){
if (pos == (int) input.length())
        return 0;
    return input[pos++];
}

//lexer - analise léxica
token scan(){
    token t;
    for (;;peek=nextToken()){
        if (peek != ' ' && peek != '\t' && peek != '\n')
            break;
    }
    if (isdigit(peek)){
        int v = 0;
        do {
            v = 10 * v + atoi(&peek);
            peek = nextToken();
        } while (isdigit(peek));
        t.type = NUMBER;
        t.value = v;
        return t;
    }
    t.type = SYMBOL;
    t.value = peek;
    peek = ' ';
    return t;
}

//parser
void match(token t){ //match por causa do token
    if (lookahead.type == t.type && lookahead.value == t.value){
        lookahead = scan();
    }else{
        printf("\n Erro de sintaxe! Valores nao batem. * \n");
        exit(0);
    }
}

void term(){
    if (lookahead.type == NUMBER){
        printf("%d ", lookahead.value); //lendo o primeiro valor de entrada
        match(lookahead);
    }else{
        printf("\nErro de sintaxe! '%c' nao eh um numero.\n", lookahead.value);
        exit(0);
    }
}

void expr(){ //expressão
    term(); //término
    while(true){
        if (lookahead.type == SYMBOL){
            if (lookahead.value == '+'){
                match(lookahead);
                term();
                printf("+ ");
            }else if (lookahead.value == '-'){
                match(lookahead);
                term();
                printf("- ");
            } else if(lookahead.value == '*'){
                match(lookahead);
                term();
                printf("* ");
            } else if(lookahead.value == '/'){
                match(lookahead);
                term();
                printf("/ ");
            else{
                return;
            }
        }else{
            return;
        }
    }
}

int main(){ //fazendo o pós fixado da entrada
    printf("Infix: "); //digitar valor
    getline(cin, input); //lendo o imput string e pedindo para o usuário digitar

    printf("Postfix:"); //valor obtido ja com o tradutor
    lookahead = scan();//lendo o token (scaneando o token)
		expr(); // lendo a expressão + e -, podendo ter dividir e multiplicar
    printf("\n"); //pulando linha e retornando 0
    return 0;
}
//x=10;
//y=x+20
//y=30
