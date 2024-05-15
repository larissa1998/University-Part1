#include <iostream>
#include <string>

#include "../Modo_Nucleo/nucleo.cpp"
using namespace std;

void sistema (){
system("PAUSE");
system("cls");
}
void LeituraUsuario(){
     modoNucleo= true;
     LeituraNucleo();
     modoNucleo=false;
}

void EscritaUsuario(string novoDado){
    modoNucleo=true;
    EscritaNucleo(novoDado);
    modoNucleo=false;
}
