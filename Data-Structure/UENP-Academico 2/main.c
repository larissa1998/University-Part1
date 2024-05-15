#include <stdio.h>
#include <stdlib.h>
#include "academy.h"
#include <locale.h>
#include <string.h>

int main()
{

    setlocale(LC_ALL, "PORTUGUESE");
    LISTA lista;
    ALUNO aluno;
    ALUNO *alunoNovo;
    PONTEIRO arvore_RA = inicializar_Arvore();
    PONTEIRO arvore_Nome = inicializar_Arvore();
    inicializar(&lista);
    int op,ra,cursos;
    char name [70];
    int op2;
    int ra2;
    char name2[70];

    do
    {

        printf("---------MENU UNIVERSIT�RIO---------");
        printf("\n [1] - Inserir");
        printf("\n [2] - Exibir");
        printf("\n [3] - Remover");
        printf("\n [4] - Buscar");
        printf("\n [5] - Liberar Mem�ria");
        printf("\n [6] - Sair do sistema");


        printf("\nDigite uma op��o de escolha: \n");
        scanf("%d", &op);

        switch (op)
        {
        case 1:



            printf("\nNome do Aluno:  ");
            fflush(stdin);
            gets(name);

            printf("\nRA do Aluno:  ");
            scanf("%d", &ra);

            aluno.RA_aluno = ra;
            strcpy(aluno.nome_aluno,name);

            aluno.curso_aluno = (aluno.RA_aluno/10000);

            inserir(&lista,aluno);


            PONT aponta = lista.inicio;

            while(aponta != NULL)
            {

                alunoNovo = &aponta->aluno;
                arvore_Nome = insere_Arvore_Nome(arvore_Nome, alunoNovo);
                arvore_RA = inserir_Arvore_RA(arvore_RA, alunoNovo);

                aponta = (PONT)aponta->prox;
            }



            limparTela();


            break;

        case 2:

            puts("\n [1] - Lista");
            puts("\n [2] - P�s Ordem");
            puts("\n [3] - Em Ordem");
            puts("\n [4] - Pr� Ordem");

            printf("\n\nDeseja exibir de qual maneira?\n");

            scanf("%d", &op);

            if(op == 1)
            {
                puts("\n\t Lista Din�mica");
                exibir(&lista);
                printf("\n");
            }

            else if(op==2)
            {
                printf("\n");
                puts("\n [1] - Mostrar p�s ordem na �rvore RA");
                puts("\n [2] - Mostrar p�s ordem na �rvore Nome");

                printf("\nDigite uma op��o:\n");

                scanf("%d", &op);

                if(op == 1)
                {
                    puts("\n\tP�s Ordem da Arvore RA");
                    PosOrdem(arvore_RA);
                }
                else if(op ==2 )
                {
                    puts("\n\t P�s Ordem da Arvore Nome");
                    PosOrdem(arvore_Nome);
                }
                else
                {
                    puts("\n op��o inv�lida");
                }
            }
            else if (op ==3)
            {
                puts("\n [1] - Mostrar em ordem na �rvore RA");
                puts("\n [2] - Mostrar em ordem na �rvore Nome");

                printf("\nDigite uma op��o:\n");

                scanf("%d", &op);

                if(op == 1)
                {
                    puts("\n\tEm Ordem da Arvore RA");
                    EmOrdem(arvore_RA);
                }
                else if(op ==2 )
                {
                    puts("\n\t Em Ordem da Arvore Nome");
                    EmOrdem(arvore_Nome);
                }
                else
                {
                    puts("\n op��o inv�lida");
                }
            }
            else if(op==4)
            {
                puts("\n [1] - Mostrar pr� ordem na �rvore RA");
                puts("\n [2] - Mostrar pr� ordem na �rvore Nome");

                printf("\nDigite uma op��o:\n");

                scanf("%d", &op);

                if(op == 1)
                {
                    puts("\n\tPr� Ordem da Arvore RA");
                    PreOrdem(arvore_RA);
                }
                else if(op ==2 )
                {
                    puts("\n\t Pr� Ordem da Arvore Nome");
                    PreOrdem(arvore_Nome);
                }
                else
                {
                    puts("\n op��o inv�lida");
                }
            }
            limparTela();
            break;

        case 3:
            puts("\n\tExcluir");
            puts("\n[1] - Por RA do aluno");
            puts("\n[2] - Por Nome do aluno");

            puts("\nDigite uma op��o: ");
            scanf("%d", &op2);

            if(op2==1)
            {

                printf("Digite o Ra: ");
                scanf("%d", &ra2);
                arvore_RA = removerRa(arvore_RA, ra2);
                arvore_Nome = removerRa(arvore_Nome, ra2);
                excluirRa(&lista,ra2);

            }
            else if(op2==2)
            {

                getchar();
                printf("Digite o nome: ");
                fflush(stdin);
                gets(name2);
                arvore_Nome = remover_Nome(arvore_Nome, name2);
                arvore_RA = remover_Nome(arvore_RA, name2);
                excluirNome(&lista,name2);

            }
            else
            {
                puts("\n Op��o errada");
            }

            limparTela();
            break;


        case 4:


            puts("\n[1] - Buscar na Lista");
            puts("\n[2] - Buscar nas �rvores");
            puts("\n[3] - Buscar por curso");

            puts("\nDigite a op��o de escolha:\n");
            scanf("%d", &op);

            if(op ==1)
            {
                buscar(&lista,ra, name2);

            }
            else if(op==2)
            {

                puts("\nBuscar na �rvore por:");
                puts("\n[1] - Por RA");
                puts("\n[2] - Por Nome\n");
                scanf("%d", &op);

                if(op==1)
                {
                    ra = aluno.RA_aluno;

                    puts("\nDigite o RA:");
                    scanf("%i", &ra);

                    arvore_RA = buscarArvoreRA(arvore_RA,ra);
                }
                else if(op==2)
                {
                    puts("\n Digite o Nome a ser buscado:");
                    fflush(stdin);
                    gets(aluno.nome_aluno);

                    arvore_RA =  buscarArvoreNome(arvore_RA, aluno.nome_aluno);

                }

            }

            else if(op==3)
            {
                buscarCursos(&lista, cursos);
            }

            limparTela();

            break;

        case 5:
            Limpar_Lista(&lista);
            arvore_RA = liberaRA(arvore_RA);
            arvore_Nome = liberaNome(arvore_Nome);

            puts("\nMem�ria Liberada com sucesso!");

            limparTela();
            break;

        case 6:
            sair_Sistema();
            break;

        default:

            puts("\nDigite uma op��o v�lida");

            break;
        }

    }
    while(op!=7);

}
