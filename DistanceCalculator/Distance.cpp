#include <iostream>
#include <math.h>
#include "split.hpp"
#include <vector>
#include <string>
#include <cstdio>
#include <cstdlib>
#include <fstream>


using namespace std;
typedef struct Cep Cep;
struct Cep {
int cep1;
int cep2;
string cidade;
string uf;
bool achei = false;
};
float CalculoDistancia (float la1, float lo1, float la2, float lo2){

float  R = 6372.795477598;
float PI = 3.1415926536;

la1 = la1*PI/180;
lo1 = lo1*PI/180;
la2 = la2*PI/180;
lo2 = lo2*PI/180;

float a = sin(la1) * sin(la2);
float b = cos(la1) * cos(la2);
float c = cos( lo1 - lo2 );

return (R * acos(a + b * c));


}
vector<Cep> Achacidade (int cep1, int cep2){
    vector<Cep> ceps;
    fstream cep;
    string linha;
    int achei = 0;
    cep.open("cep.csv", ios::in | ios::out);
    while (cep.good()){

            Cep Cepc, Cepc2;
            getline(cep, linha);
            vector<string> campos = split(linha, ';');
            int cep_inicial = atoi(campos[1].c_str());
            int cep_final = atoi(campos[2].c_str());
            if (cep1 >= cep_inicial && cep1 <= cep_final){
                Cepc.cidade = campos[0];
                Cepc.uf = campos[3];
                Cepc.cep1 = cep_inicial;
                Cepc.cep2 = cep_final;

                cout << campos[0] << "-" <<campos[3] << " -> ";
                ceps.push_back(Cepc);
                achei ++;
            }

            if(cep2 >= cep_inicial && cep2 <=cep_final){
                Cepc2.cidade = campos[0];
                Cepc2.uf = campos[3];
                Cepc2.cep1 = cep_inicial;
                Cepc2.cep2 = cep_final;
                 cout << campos[0] << "-" << campos[3] << " ";
                 achei++;
                 ceps.push_back(Cepc2);
            }
            if (achei == 2){
                break;
            }

    }

    cep.close();
return ceps;
}
vector<Cep> AcharMunicipio (vector<Cep> ceps){
    fstream cep,  municipios_br;
    string linha;
    cep.open("municipios_br.csv", ios::in | ios::out);

    float latitude2;
    float longitude2;

    float latitude1;
    float longitude1;

    while (cep.good()){

            getline(cep, linha);
            if(linha.length() >0){
            vector<string> campos = split(linha, ';');
            string cidade = campos[3];
            string estado = campos[4];

            if (ceps[0].cidade == cidade && ceps[0].uf == estado){

                latitude1 = atof(campos[1].c_str());
                longitude1 = atof(campos[2].c_str());
            }

            if (ceps[1].cidade == cidade && ceps[1].uf == estado){

                latitude2 = atof(campos[1].c_str());
                longitude2 = atof(campos[2].c_str());
            }
            }

    }

    cout << "Distancia:  " << CalculoDistancia(latitude1, longitude1, latitude2, longitude2) << endl;

    cep.close();
return ceps;
}


int main(){
    string linha, linha2;
    string op;

    cout << "Digite uma opcao: "<< endl;
    cout << endl;
    cout << "1 - Calculo Individual" << endl;
    cout <<endl;
    cout << "2 - Calculo em Lote" << endl;
    cout << endl;
    cin >> op;

    int cep1, cep2;

    if (op == "1")
    {
        cout << "Digite o CEP 1: " << endl;
        cin>> cep1;
        cout << "Digite o CEP 2: " << endl;
        cin>> cep2;
        vector<Cep> ceps = Achacidade(cep1, cep2);
        vector<Cep> ceps2 = AcharMunicipio(ceps);
    }
    else if (op == "2")
    {
        fstream entrada;
        fstream entrada2;

        entrada.open("entrada.txt", ios::in | ios::out);
        vector<int> v_cep;

        while (entrada.good())
        {
            getline(entrada, linha);
            v_cep.push_back(atoi(linha.c_str()));
        }

        for (int i = 0; i < v_cep.size(); i++)
        {
            for (int j = i+1; j < v_cep.size(); j++)
            {
                if (i == j) continue;

                vector<Cep> ceps = Achacidade(v_cep[i], v_cep[j]);
                vector<Cep> ceps2 = AcharMunicipio(ceps);
            }
        }
    }
    else
        puts("Invalid Option");
}
