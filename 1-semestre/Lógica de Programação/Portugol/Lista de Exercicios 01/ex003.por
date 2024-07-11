programa
{
	
	funcao inicio()
	{
		// 3) Faça um programa em Português Estruturado que leia o valor do salário 
		// mínimo e o valor do salário de uma pessoa. Calcular e imprimir quantos salários 
		// mínimos ela ganha. 

		real salMin, sal, c

		c=1

		escreva("Por favor digite o valor do salário minimo: ")
		leia(salMin)

		escreva("Por favor digite o seu salário: ")
		leia(sal)

		enquanto (sal > salMin){
			sal = sal-salMin
			c = c+1
			}

		escreva("A quantidade de salários minimos é igual a: ",c," salarios minimos.")
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */