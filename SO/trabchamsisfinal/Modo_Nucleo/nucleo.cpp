#include <iostream>
#include <string>
#include <fstream>
#include <cstdlib>
#include <cstdio>

using namespace std;
bool modoNucleo =false;

void LeituraNucleo(){
    if(!modoNucleo){
        cout<<"Nao tem privilegio para acesso"<<endl;
        return;
    }

 ifstream myReadFile;
 myReadFile.open("Modo_Nucleo/arquivo.txt");
 char output[100];
 if (myReadFile.is_open()) {
 while (!myReadFile.eof()) {//quando acabar o arq txt joga tudo no output


    myReadFile >> output;

    cout<<output;

 }
 cout<<endl;
}
myReadFile.close();
}

void EscritaNucleo(string novoDado){
    if(!modoNucleo){
        cout<<"Nao tem privilegio para acesso"<<endl;
        return;
    }

    fstream arq;
    arq.open("Modo_Nucleo/arquivo.txt", ios::in | ios:: out | ios::app);
    arq << novoDado;
    arq.close();
    cout << "Dados gravados com sucesso!" << endl;

}
