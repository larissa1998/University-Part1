#include <iostream>
#include <string>
#include "Modo_Lib/lib.cpp"
#include <locale.h>
#include <dos.h>
#include <windows.h>
using namespace std;



int main(){
    setlocale(LC_ALL,"PORTUGUESE");
    system("COLOR 0A");
    int i;
    char  ce= '#';
    Sleep(200);
    printf("CARREGANDO O SISTEMA - Trabalho de Sistemas Operacionais - LIGUE O SOM: \n");
    for(i=0; i<=30; i++){
    Beep(660,100);Sleep(150);
    printf("%c", ce);
    Beep(660,100);Sleep(300);
    printf("%c", ce);
    Beep(660,100);Sleep( 300);
    printf("%c", ce);
    Beep(510,100);Sleep( 100);
    printf("%c", ce);
    Beep(660,100);Sleep( 300);
    printf("%c", ce);
    Beep(770,100);Sleep( 550);
    printf("%c", ce);
    Beep(380,100);Sleep( 575);
    printf("%c", ce);
    Beep(510,100);Sleep( 450);
    printf("%c", ce);
    Beep(380,100);Sleep( 400);
    printf("%c", ce);
    Beep(320,100);Sleep( 500);
    printf("%c", ce);
    Beep(440,100);Sleep( 300);
    printf("%c", ce);
    Beep(480,80);Sleep( 330);
    printf("%c", ce);
    Beep(450,100);Sleep( 150);
    printf("%c", ce);
    Beep(430,100);Sleep( 300);
    printf("%c", ce);
    Beep(380,100);Sleep( 200);
    printf("%c", ce);
    Beep(660,80);Sleep( 200);
    printf("%c", ce);
    Beep(760,50);Sleep( 150);
    printf("%c", ce);
    Beep(860,100);Sleep( 300);
    printf("%c", ce);
    Beep(700,80);Sleep( 150);
    printf("%c", ce);
    Beep(760,50);Sleep( 350);
    printf("%c", ce);
    Beep(660,80);Sleep( 300);
    printf("%c", ce);
    Beep(520,80);Sleep( 150);
    printf("%c", ce);
    Beep(580,80);Sleep( 150);
    printf("%c", ce);
    Beep(480,80);Sleep( 500);
    printf("%c", ce);
    Beep(510,100);Sleep( 450);
    printf("%c", ce);
    Beep(380,100);Sleep( 400);
    printf("%c", ce);
    Beep(320,100);Sleep( 500);
    printf("%c", ce);
    Beep(440,100);Sleep( 300);
    printf("%c", ce);
    Beep(480,80);Sleep( 330);
    printf("%c", ce);
    Beep(450,100);Sleep( 150);
    printf("%c", ce);
    Beep(430,100);Sleep( 300);
    printf("%c", ce);
    Beep(380,100);Sleep( 200);
    printf("%c", ce);
    Beep(660,80);Sleep( 200);
    printf("%c", ce);
    Beep(760,50);Sleep( 150);
    printf("%c", ce);
    Beep(860,100);Sleep( 300);
    printf("%c", ce);
    printf("\n Aperte enter para ir para o sistema\n");

    sistema();

    int escolha=1;

    while (escolha!=0) {
        cout << "-------MENU DE OPÇÕES------- "<< endl;
        cout << "1 - Leitura"<< endl;
        cout << "2 - Escrita"<< endl;
        cout << "3 - Leitura do núcleo" << endl;
        cout << "0 - Sair" << endl;
        cout << "Digite a opção de escolha: " << endl;
        cin >> escolha;
        switch (escolha) {
            case 1:
                LeituraUsuario();
                sistema();
                break;

            case 3:
                LeituraNucleo();
                sistema();
                break;
            case 2:
                cout<<"Digite a nova informacao"<<endl;
                string novoDado;
                cin >>novoDado;
                EscritaUsuario(novoDado);
                sistema();
                break;

        }

    }

    return 0;
}
}
