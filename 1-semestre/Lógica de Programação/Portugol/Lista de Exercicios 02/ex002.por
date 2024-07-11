programa
{
	
	funcao inicio()
	{
		// 2) Escreva um algoritmo em Português Estruturado para determinar se um 
		//número A é divisível por um outro número B. Esses valores devem ser 
		//fornecidos pelo usuário.

		inteiro n1,n2

		escreva("Digite o 1º numero: ")
		leia(n1)

		escreva("Digite o 2º numero: ")
		leia(n2)

		se (n1%n2==0) {
			escreva("O 1º número: ",n1," é divisível pelo 2º numero: ",n2,".")
			} senao {
				escreva("O 1º número: ",n1," NÃO é divisível pelo 2º numero: ",n2,".")}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */