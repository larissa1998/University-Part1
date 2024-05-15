#include <iostream>
#include "process.h"
#include <time.h>
#include <unistd.h>
#include <stdio.h>
#include <windows.h>
#include <locale.h>

using namespace std;

int main()
{

    setlocale(LC_ALL, "PORTUGUESE");
    system("COLOR 0E");

    cout << "------------SIMULADOR DE ESCALONAMENTO DE PROCESSOS------------"<<endl;

    cout << endl;

    int choice;
    int processos[10];

    for (int x =0; x<10; x++)
    {

        cout << "Digite um processo de 0 a 10" << endl;
        cin >> processos[x];

    }

    cout << endl;

    menu();

    cout << endl;

    cout << "Digite a opção desejada:" <<endl;
    cin >>choice;
    cout <<endl;

    switch (choice)
    {

        case 1:
        justa(processos,10);
        break;

        case 2:
        fifo(processos,10);
        break;

        default:
            cout << "Digite uma opção válida" << endl;
        break;
    }

    // for que roda do 0 ao 10 (fifo)
    //delay

    return 0;
}
