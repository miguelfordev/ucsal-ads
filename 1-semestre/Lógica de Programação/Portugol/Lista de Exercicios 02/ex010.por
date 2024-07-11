programa
{
	
	funcao inicio()
	{
		//10. Faça um algoritmo que leia um número e mostre uma mensagem indicando 
		//se este número é par ou ímpar e se é positivo ou negativo.

		inteiro n

		escreva("Digite um numero: ")
		leia(n)

		se(n%2==0 e n>0){
			escreva("numero par e positivo.")
			} senao{
				se(n%2!=0 e n>0){
					escreva("numero impar e positivo")
					} senao {
						se(n%2==0 e n<0){
							escreva("numero par e negativo")
							} senao {
								se(n%2!=0 e n<0){
									escreva("numero impar e negativo")
									} senao{
										escreva("ZERO É NULO.")
										}
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
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */