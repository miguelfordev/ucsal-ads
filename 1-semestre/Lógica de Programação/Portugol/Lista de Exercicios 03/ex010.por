programa
{
	
	funcao inicio()
	{
		//10) Faça um programa que receba 2 números e informe o mmc (minimo multiplo comum).

		inteiro n1,n2,x,multi,mmc

		escreva("Digite o 1º número: ")
		leia(n1)
		escreva("Digite o 2º número: ")
		leia(n2)

		multi=(n1*n2)
		x=0
		enquanto(n2!=0){
			x=n2
			n2=n1%n2
			n1=x
			}
		mmc=multi/x
		escreva("O MMC é: ",mmc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = 16;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */