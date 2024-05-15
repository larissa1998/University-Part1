#include <conio.h>
#ifndef LISTASEQUENCIALESTATICA_H_INCLUDED
#define LISTASEQUENCIALESTATICA_H_INCLUDED

#define MAX 50 // n�mero de 50 elementos

typedef int TIPOCHAVE; // novo nome para o tipo inteiro.

typedef struct {
 TIPOCHAVE chave;
} REGISTRO; //onde vai ficar todas as informa��es que o usu�rio desejar, exemplo: telefone, endere�o, etc.

typedef struct {
REGISTRO A[MAX]; //criando um arrnajo de tamanho MAX
int nroElem; //criando o numero de elementos para fazer o gerenciamento
} LISTA;

//-------PROT�TIPOS---------------

void inicializaLista(LISTA * l);
int tamanho(LISTA *l);
void exibirLista(LISTA * l);
void insereElemLista(LISTA * l, REGISTRO elem); //parou aqui
int buscaSequencial(LISTA *l, TIPOCHAVE ch);
int busca_binaria(LISTA *l, TIPOCHAVE ch, int i, int f);
void excluir(LISTA *l, TIPOCHAVE ch);
void reinicializaLista(LISTA *l);
#endif
