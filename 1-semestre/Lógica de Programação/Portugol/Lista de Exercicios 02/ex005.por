programa
{
	
	funcao inicio()
	{
		//5) A prefeitura de Salvador abriu uma linha de crédito para os funcionários 
		//estatutários. O valor máximo da prestação não poderá ultrapassar 30% do 
		//salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o 
		//valor da prestação, e informar se o empréstimo pode ou não ser concedido. 

		real sal, prest, sal30

		escreva("Por favor digite o salário: ")
		leia(sal)
		escreva("Por favor digite a prest: ")
		leia(prest)
		
		sal30 = ((sal*30)/100)

		se (sal30 >= prest) {
			escreva("Emprestimo concedido.")
			} senao{
				escreva("Emprestimo negado.")
				}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */