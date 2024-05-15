#include <stdio.h>
#include <iostream>
#include <string>
#include <stdlib.h>
using namespace std;


int main (){
  string f, expr, expr2, con1, con2, con3, con4;
  int i,pos, pos2, pos3, pos4, num1, num2, num3, num4;
  int aux1, aux2, aux3, aux4;
  getline (cin, f);
  int x = f.length();
  for ( i = 0; i < x; i++){
  if (f[i] == '/'){
      pos = i;
      pos2 = i+1;
    }
  }
  expr = f.substr(0, pos);
  expr2 = f.substr(pos2);

 x = expr.length();
for ( i = 0; i < x; i++){
if (expr[i] == '^'){
  pos3 = i;
  pos4 = i+1;
  }
}
  con1 = expr.substr(0, pos3);
  con2 = expr.substr(pos4);
  num1 = atoi(con1.c_str());
  num2 = atoi(con2.c_str());
  if(num2 == 1){
    cout << "X \n";
  }else{
  aux1 = num1 * num2;
  aux2 = num2 - 1;
}
  x = expr2.length();
 for ( i = 0; i < x; i++){
 if (expr[i] == '^'){
   pos3 = i;
   pos4 = i+1;
   }
 }
   con3 = expr2.substr(0, pos3);
   con4 = expr2.substr(pos4);
   num3 = atoi(con3.c_str());
   num4 = atoi(con4.c_str());
   if(num4 == 1){
     cout << "X \n";
   }else{
   aux3 = num3 * num4;
   aux4 = num4 - 1;
   cout << "(" << aux1 << "x^" << aux2 << "*" << num3 << "x^" << num4 << "-" <<
                  num1 << "x^" << num2 << "*" << aux3 << "x^" << aux4 << ")"<<
                   "(" << num3 << "x^" << num4 << ")^2 \n";

}
}

