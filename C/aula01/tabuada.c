#include <stdio.h>

int main(){
	int valorEscolhido;
	int contador = 0;
	printf("Insira um valor: ");
	scanf("%d",&valorEscolhido);

	while(contador != 11)
	{
		printf("%i * %i = %i\n", valorEscolhido, contador, (contador*valorEscolhido));
		contador++;
	}
}