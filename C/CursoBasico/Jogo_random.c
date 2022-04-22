#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	printf("******************************************\n");
	printf("* Bem vindo ao Jogo de Advinhação!       *\n");
	printf("* -> Você têm 5 tentativas para acertar! *\n");
	printf("******************************************\n");

	srand(time(0));
	int nRandom = rand() % 100;
	//printf("%i",nRandom);
	int chute;
	double pt = 1000.0;

	int nivel;
	printf("Qual o nível de dificuldade?\n");
	printf("(1) Fácil - (2) Médio - (3) Difícil\nSua escolha: ");
	scanf("%d",&nivel);

	int cont = 8;

	while((nivel != 1) && (nivel != 2) && (nivel != 3))
	{
		printf("Digite uma opção para um nível válido: ");
		scanf("%d",&nivel);
	}

	if (nivel == 2)
	{
		cont = 7;
	} else if (nivel == 3) {
		cont = 5;
	}

	printf("*** Você têm %i chutes!!! ***\nQual é seu chute?: ", cont);
	scanf("%d",&chute);

	if (chute != nRandom)
	{
		 for (int i = (cont-1); i > 0; --i)
		{
			pt -= abs(nRandom - chute) / 2.0;

			if (chute == nRandom)
			{
				break;
			}
			else if (chute > nRandom)
			{
				printf("Restam %i tentativa(s)!\nTente novamente um número menor: ",i);
			} else {
				printf("Restam %i tentativa(s)!\nTente novamente um número maior: ",i);
			}
			
			scanf("%d",&chute);

			
		}

	}

	if (chute == nRandom)
	{
		printf("\n*** Meus PARABÉNS!!! ***\n*** Você ACERTOU, o número era: %i! ***\n", nRandom);
		printf("Sua pontuação foi: %.2f\n", pt);
	} else {
		printf("\n*** Você PERDEU!!!***\n*** O número era: %i! ***\n", nRandom);
	}

}