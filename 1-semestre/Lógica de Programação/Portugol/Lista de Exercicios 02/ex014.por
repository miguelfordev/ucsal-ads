programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//14. Fazer um programa em português estruturado para ajudar a bilheteria do 
		//metrô. O usuário deve informar o tipo do bilhete (unitário, duplo ou 10 viagens) e 
		//o valor pago pelo passageiro. O sistema deve mostrar, então, a quantidade de 
		//bilhetes possíveis e o troco que o passageiro deve receber. 
		//Considere a seguinte: 
		//Tipo de bilhete Valor (R$) 
		//1. Bilhete unitário 1,30 
		//2. Bilhete duplo 2,60 
		//3. Bilhete de 10 viagens 12,00
		
		inteiro b
		real vp

		escreva("Tabela de Valores do Bilhete (1- B.Unitário: R$1,30 / 2- B.Duplo: R$2,60 / 3- B.10 Viagens: R$12,00)")
		escreva("\nInforme o tipo de bilhete: ")
		leia(b)
		escreva("Valor pago: ")
		leia(vp)

		se (b==1 e vp >= 1.60){
			escreva("O bilhete escolhido foi o Unitário e o valor do troco é: R$",mat.arredondar(vp-1.60, 2))
			} senao{
				se(b==2 e vp >=2.60){
					escreva("O bilhete escolhido foi o Duplo e o valor do troco é: R$",mat.arredondar(vp-2.60, 2))
					} senao {
						se(b==3 e vp >=12.00){
							escreva("O bilhete escolhido foi o 10 Viagens e o valor do troco é: R$",mat.arredondar(vp-12.00, 2))
							} senao{
								escreva("Valor inexistente ou insuficiente para o tipo de bilhete ou Tipo de bilhete inexistente.")
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
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */