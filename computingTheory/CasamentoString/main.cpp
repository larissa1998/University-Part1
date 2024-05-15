#include <iostream>
#include <string.h>
#include <windows.h>
#include <locale.h>
#include "casamento.hpp"

///TRABALHO IMPLEMENTAÇÃO (TEORIA DA COMPUTAÇÃO) - CASAMENTO DE STRINGS
///LARISSA FOGAÇA MENDES Nº 120147

using namespace std;

int main()
{
    setlocale(LC_ALL, "PORTUGUESE");
    system("COLOR 0A");

    cout << "--------------CASAMENTO DE STRINGS--------------" << endl;

    char entrada[250];
    char prefixo[30];
    char sufixo [30];
    char subpalavra[30];
    int aux;

    cout << "Digite a entrada:" <<endl;
    cin >> entrada;

    cout << "Digite o prefixo a ser buscado:" <<endl;
    cin >> prefixo;

    cout << "Digite o sufixo a ser buscado:" << endl;
    cin>>sufixo;

    cout << "Digite a subpalavra na qual deseja busca:" << endl;
    cin >> subpalavra;

    StartsWith(entrada,prefixo);

    EndsWith(entrada, sufixo);

    Subpalavra(entrada,subpalavra);

    cout << "------------------------------------------------" << endl;

    return 0;
}
