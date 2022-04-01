#include <stdio.h>

int main(){
	printf("************************************\n");
	printf("* Bem vindo ao Jogo de Advinhação! *\n");
	printf("************************************\n");

	int nRandom = 21;
	int chute;

	printf("Qual é seu chute?: ");
	scanf("%d",&chute);

	if (chute != nRandom)
	{
		while (chute != nRandom)
		{
				if (chute > nRandom)
			{
				printf("Tente novamente um número menor: ");
			} else {
				printf("Tente novamente um número maior: ");
			}
			scanf("%d",&chute);
		}

	}

	printf("*** Meus PARABÉNS!!! ***\n*** Você ACERTOU, o número era: %i! ***\n;-)\n", nRandom);
	


}