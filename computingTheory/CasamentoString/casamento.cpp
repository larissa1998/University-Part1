#include <iostream>
#include <string.h>
#include "casamento.hpp"

using namespace std;

//-------------FUNÇÃO PREFIXO DA PALAVRA----------------

void StartsWith (char entrada [], char prefixo [])
{

    int aux=0;

    for (int i = 0; i<strlen(prefixo)-1; i++)
    {
        if(entrada[i] == prefixo[i])
        {
            aux ++;
        }
    }

    if(aux==strlen(prefixo)-1)
    {
        cout << "------------------------------------------------" << endl;
        cout << "A entrada começa com o prefixo buscado" << endl;
    }
    else
    {
        cout << "------------------------------------------------" << endl;
        cout << "A entrada não começa com o prefixo buscado" << endl;
    }
}

//-------------FUNÇÃO SUFIXO DA PALAVRA----------------

void EndsWith (char entrada [], char sufixo [])
{

    int aux=0;

    for(int i= strlen(sufixo)-2; i>=0; i--)
    {
        if(entrada[strlen(entrada)-(strlen(sufixo)-i)]==sufixo[i])
        {
            aux++;
        }
    }

    if(aux==strlen(sufixo)-1)
    {
        cout << "------------------------------------------------" << endl;
        cout << "A entrada termina com o sufixo buscado" << endl;
    }
    else
    {
        cout << "------------------------------------------------" << endl;
        cout << "A entrada não termina com o sufixo buscado" << endl;
    }

}

//------------FUNÇÃO SUBPALAVRA DA PALAVRA----------------

void Subpalavra (char entrada [], char subpalavra [])
{

    for (int i = 0; i < strlen(entrada); i++)
    {
        int aux = 0;
        int k = 0;
        for(int j = i; aux < (strlen(subpalavra)); aux++)
        {

            if(entrada[j] == subpalavra[k])
            {
                aux++;
                k++;
                if(aux == strlen(subpalavra))
                {
                    cout << "------------------------------------------------" << endl;
                    cout << "Possui uma subpalavra" << endl;
                    return;
                }
            }
            j++;
        }
    }
    cout << "------------------------------------------------" << endl;
    cout << "Não possui uma subpalavra" << endl;
    return;
}
