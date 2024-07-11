programa
{
	
	funcao inicio()
	{
		// 2) Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 
		// 10% para o garçom. Faça um programa em Português Estruturado que leia o 
		// valor gasto com despesas realizadas em um restaurante e mostre o valor total 
		// com a gorjeta. 
		
		real totC

		escreva("Digite o valor total da conta: ")
		leia(totC)

		escreva("A conta + 10% fica: ",totC+((totC*10)/100)," caso queira sem, fica: ",totC)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */