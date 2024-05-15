#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include "Lista.h"
int main() {

  // Nome: Larissa Foga�a Mendes


    setlocale(LC_ALL, "PORTUGUESE");
    LISTA lista;
    lista.nroElem = 0;
    REGISTRO elem;
    AGENDA agenda;

    int op;

    while (1)
    {

        printf("-----------MENU------------");
        printf("\n 1 - Inserir pessoa na lista");
        printf("\n 2 - Exibir lista telef�nica");
        printf("\n 3 - Buscar por nome, telefone ou endere�o");
        printf("\n 4 - Excluir pessoa da lista telef�nica");
        printf("\n");
        scanf("%d", &op);

        switch(op) {
            case 1:
            printf("\n A op��o desejada �: 1\n");
            inserirElemLista(&lista, &elem);

            break;

            case 2:
            printf("\n A op��o desejada �: 2\n");
            exibirLista(&lista, &elem);

            break;

            case 3:
            printf("\n A op��o desejada �: 3\n");
            buscaSequencial(&lista, &elem);

            break;

            case 4:
            printf("\n A op��o desejada �: 4\n");
            excluir(&lista);

            break;


            default:
                printf("Erro !!");
                system("pause");
                system("cls");
        }
    }

    return 0;
}
