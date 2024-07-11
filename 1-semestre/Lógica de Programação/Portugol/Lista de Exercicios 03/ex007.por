programa
{
	
	funcao inicio()
	{
		//7) Faça um programa que receba 2 números e informe o mdc (máximo 
		//divisor comum). 

		inteiro n1,n2,x

		escreva("Digite o 1º numero: ")
		leia(n1)
		escreva("Digite o 2º numero: ")
		leia(n2)

		x=0
		enquanto(n2!=0){
			x = n2
			n2=n1%n2
			n1 = x
			}

		escreva("O MDC é igual a: ",n1)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = 16;
 * @SIMBOLOS-INSPECIONADOS = {n1, 9, 10, 2}-{n2, 9, 13, 2}-{x, 9, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */