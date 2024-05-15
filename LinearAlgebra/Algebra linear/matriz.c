#include <stdio.h>
#include<stdlib.h>
#include "matriz.h"
#include <math.h>

void sistema_limpa()
{
    system("cls");
}

void Exercicio1 ()
{
    int x, z, array[4][5], menor = 0, auxML = 0, auxMC = 0, maior = 0, auxxMC = 0;

    for(x= 0; x< 4; x++)
    {
        for(z = 0; z < 5; z++)
        {
            printf("\nDigite um valor para Linha[%d] Coluna[%d]: ", x, z);
            scanf("%d", &array[x][z]);
        }
    }

    menor = array[0][0];

    for(x= 0; x< 4; x++)
    {
        for(z = 0; z < 5; z++)
        {
            if(array[x][z] < menor)
            {
                menor = array[x][z];
                auxML = x;
                auxMC = z;
            }
        }
    }

    printf("\n---------------------------------------------\n");

    for (x=0; x<4; x++)
    {
        for (z=0; z<5; z++)
        {

            printf("%d ",  array[x][z]);

        }
        printf("\n");

    }

    printf("---------------------------------------------\n");
    printf("\nMenor valor da matriz é: %d", menor);
    printf("\nPosição Linha:[%d] | Coluna:[%d]\n", auxML, auxMC);

    for(x = 0; x < 5; x++)
    {
        if(array[auxML][x] >= maior)
        {
            maior = array[auxML][x];
            auxxMC = x;
        }
    }

    printf("\nMaior valor da matriz é: %d", maior);
    printf("\nPosição Linha :[%d] | Coluna[%d]\n", auxML, auxxMC);

    printf("\n");

    system("PAUSE");
    return 0;
}


void Exercicio2()
{

    double vetor[3];
    double x[3];
    double z[3];
    int i;
    float ci = 0, cj = 0, ck = 0;

    printf ("\n------------PRODUTO VETORIAL-------------\n");

    printf ("\nDigite a seguir os vetores na forma (x1,x2,x3) \n");

    for (i=1; i<4; i++)
    {
        printf ("\n Digite o coeficiente desejado: x%d \n ",i);
        scanf ("%lg",&x[i-1]);
    }

    for (i=1; i<4; i++)
    {
        printf ("\n Digite o coeficiente desejado: y%d \n ",i);
        scanf ("%lg",&z[i-1]);
    }

    ci = vetor[0]= (x[1]*z[2] - z[1]*x[2]);
    cj = vetor[1]= (x[2]*z[0] - z[2]*x[0]);
    ck =vetor[2]= (x[0]*z[1] - z[0]*x[1]);
    printf ("\n O produto vetorial é: \n");

    printf("%.fi %.fj %.fk", ci, cj, ck);
    system("pause");
    return 0;
}


void Exercicio3 ()
{

    printf("\n------------MATRIZ 3X3-------------\n");

    int i1 = 1;
    int j1 = 1;
    int i2 = 1;
    int j2 = 1;
    int x ;
    int z ;
    int  M [3][3];
    float media = 0.0;
    int soma = 0;

    for (x=0; x<3; x++)
    {
        for (z=0; z<3; z++)
        {
            printf("\nDigite um valor para Linha[%d] Coluna[%d]: ", x+1, z+1);
            scanf("%d", &M[x][z]);

        }
    }

    printf("\n");
    printf("\n---------------------------------------------\n");

    for (x=0; x<3; x++)
    {
        for (z=0; z<3; z++)
        {
            printf("%d ",  M[x][z]);

        }
        printf("\n");

    }

    printf("---------------------------------------------\n");

    int maior=M[0][0];
    int menor=M[0][0];

    for(x=0; x<3; x++)
    {

        for(z=0; z<3; z++)
        {
            if(M[x][z] > maior)
            {
                maior=M[x][z];

                i1=x+1;
                j1=z+1;

            }

            if(M[x][z]<menor)
            {
                menor=M[x][z];
                i2=x+1;
                j2=z+1;

            }


        }

        soma = soma + M[x][j2-1];

    }

    for(x=0; x<3; x++)
    {
        media += M[x][j2-1];

    }


    printf("\nO maior elemento da matriz é: %d | Linha:[%d] | Coluna:[%d]\n",maior,i1,j1);
    printf("\nO menor elemento da matriz é: %d | Linha:[%d] |Coluna:[%d]\n",menor,i2,j2);
    printf("\nA soma da coluna com o menor elemento é: %d\n", soma);
    printf("\nA media da coluna do menor elemento é: %f\n", media / 3);

    printf("\n\n");

    system("pause");
}






