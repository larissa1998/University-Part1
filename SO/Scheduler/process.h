#include <cstdio>
#include <cstdlib>
#include <stdio.h>
#include <iostream>
#include <ctime>
#include <windows.h>
#include <locale.h>

using namespace std;

void menu ()
{

    setlocale(LC_ALL,"PORTUGUESE");

    cout << "-----------MENU DE OPÇÕES-----------" << endl;
    cout << "[1] - Fração Justa"<<endl<<endl;
    cout << "[2] - FIFO"<<endl;

}
void escalonamento (int processos, int t)//declara um delay(tempo) para cada processo
{

    time_t inicio = time(NULL);
    time_t fim;
    time_t duracao = t;

    fim = inicio + duracao;

    while (inicio < fim && processos > 0)
    {
        Sleep(1000);
        inicio = time(NULL);
        processos -= 1;
        cout << "Processo:    " << processos<< "    Faltam:    "<<  processos << "    Prioridade:    " <<  processos << endl;
        cout << endl;
    }

}
int Processoe (int processos [], int tamanho) //procura se existe ou n
{

    int yes = 0;

    for(int x = 0; x<tamanho; x++)//percorre os processos até o tamanho dele
    {

        if(processos[x] > 0)
        {
            yes = 1;
            break;
        }
    }
    return yes;
}

void fifo (int processos[], int tamanho)//primeiro que entra é o primeiro que sai
{

    int time = 4;


    while (Processoe(processos, tamanho)) //executando processo ao todo
    {
        for(int i=0; i<tamanho; i++)
        {
            if(processos[i]>0)
            {
                escalonamento(processos[i],time) ;//escalonandos processos, com o tempo de cada
                processos[i] -= time;
            }
        }

    }
}

//se existe dois usuarios usando a máquina os dois terão a mesma quantidade de processamento
void justa (int processos [], int tamanho)
{
//vai pro proximo e printa 20
    int time = 20 /10;


    while (Processoe(processos, tamanho))//pega os processos que digitei e percorre até o tamanho dele (10)
    {
        for(int i=0; i<tamanho; i++)
        {
            if(processos[i]>0)
            {
                escalonamento(processos[i],time) ;
                processos[i] -= time;
            }
        }

    }
}
