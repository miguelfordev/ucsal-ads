programa
{
	
	funcao inicio()
	{
		//3) Faça um algoritmo em Português Estruturado que receba a idade de uma 
		//pessoa e informe em qual das categorias se enquadra em relação à 
		//obrigatoriedade do voto: 
		//• Sem permissão para votar (0 a 15 anos) 
		//• Voto facultativo (16 a 17 anos, acima de 65 anos) 
		//• Voto obrigatório (18 a 64 anos) 

		inteiro idade

		escreva("Digite a sua idade: ")
		leia(idade)

		se (idade>0 e idade <=15){
			escreva("Sem permissão para votar.")
			} senao {
				se (idade>=16 e idade<=17 ou idade>=65){
					escreva("Voto facultativo.")
					} senao {
						se (idade>=18 e idade<=64){
							escreva("Voto obrigatório.")
							} senao {
								escreva("Idade incoerente.")
								}
						}
				}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */