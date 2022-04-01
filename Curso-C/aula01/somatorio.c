#include <stdio.h>

int main(){

  int n = 1;
  int soma = 0;

  while(n != 101) {
    soma += n;
    n++;
  }
  printf("%i", soma);
}