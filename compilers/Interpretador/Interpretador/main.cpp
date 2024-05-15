#include "iostream"
#include "cstdlib"
#include "cstdio"
#include "string"
#include <locale.h>
#define NUMERO 255
#define MENOS 256
#define SOMA 257
#define ERR 300

using namespace std;

struct TokenL {
 int tipo;
 int valor;
};

string entrada;

int posicao = 0;
char ch = EOF;

string Nome_Token (int tok){
    switch (tok)
    {
        case NUMERO: return "NUMERO";
        case SOMA: return "SOMA";
        case MENOS: return "MENOS";
    }
    return "COMPILADORES";

}

char get_char (){

if(posicao < entrada.length()){
    return entrada[posicao++];
} else{
 return EOF;
}
}

TokenL proximo_token (){

TokenL tok;
char peek;

if(ch = EOF){
    peek = get_char();
}
else {
    peek = ch;
    ch = EOF;
}
if (isdigit(peek)){//tratar inteiros e reais
    int v = 0;
    do{
        v = v *10 + atoi (&peek);
        peek = get_char();
    } while (isdigit(peek));
    tok.tipo = NUMERO;
    tok.valor = v;
    ch = peek;
} else if (peek == '+'){
    tok.tipo = SOMA;
} else if (peek == '-'){
    tok.tipo = MENOS;
} else if (peek == EOF){
    tok.tipo = EOF;
} else{
    tok.tipo =  ERR;
}
return tok;
}


int main()
{
setlocale(LC_ALL, "PORTUGUESE");
cout << "Analisador Léxico (Interpretador)" << endl;
cout << "@Autora: Larissa Fogaça Mendes nº 120147" << endl;

//entrada = "123+321-12+2";
//token lookahead = next_token();
//     while (lookahead.type!=EOF){
//         cout << "<"<< token_name(lookahead.type);
//         if (lookahead.type == NUM)
//             cout << "," << lookahead.value;
//         cout <<">"<< endl;
//         lookahead = next_token();
//return 0;
}
