#include "matriz.h"
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <locale.h>

int main(){

setlocale(LC_ALL,"PORTUGUESE");
system("COLOR 0A");

int choice;

do{
printf("----------------MENU DE OPÇÕES---------------\n");
printf("\n[1] - Matriz 4X5\n");
printf("\n[2] - Vetor A de 3 elementos e vetor B produto vetorial\n");
printf("\n[3] - Matriz 3X3\n");

printf("\nDigite sua opção de escolha: \n");
scanf("%d", &choice);

if(choice == 1){
Exercicio1();
}else if(choice == 2){
  Exercicio2();
//    segtela=getchar();
}else if(choice == 3){
 Exercicio3();
}
 sistema_limpa();

}while(choice != 4);
}
