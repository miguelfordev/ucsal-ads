programa
{
	
	funcao inicio()
	{
		//12. Uma empresa concederá um aumento de salário aos seus funcionários, 
		//variável de acordo com o cargo, conforme a tabela abaixo. Faça um programa 
		//em português estruturado que receba o salário e o cargo de um funcionário e 
		//calcule o novo salário. Se o cargo do funcionário não estiver na tabela, ele 
		//deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo salário e 
		//a diferença. 
		//Código - Cargo - Aumento 
 		//101 Gerente 10% 
 		//102 Engenheiro 20% 
 		//103 Técnico 30%

		real sal,novoSal
		inteiro cod


 		escreva("Digite o salário do funcionário: ")
 		leia(sal)

		escreva("Digite o código do cargo do funcionário (101-Gerente, 102-Engenheiro, 103-Técnico ou 104 e acima: ")
		leia(cod)

		se(cod==101){
			escreva("O antigo salário do funcionário(Gerente) é: R$",sal,", seu novo salário é: R$",sal+((sal*10)/100))
			} senao{
				se(cod==102){
					escreva("O antigo salário do funcionário(Engenheiro) é: R$",sal,", seu novo salário é: R$",sal+((sal*20)/100))
					} senao{
						se(cod==103){
							escreva("O antigo salário do funcionário(Técnico) é: R$",sal,", seu novo salário é: R$",sal+((sal*30)/100))
							} senao {
								se(cod>=104){
									escreva("O antigo salário do funcionário(acima ou igual ao cód: 104) é: R$",sal,", seu novo salário é: R$",sal+((sal*40)/100))
									} senao {
										escreva("Funcionário inexistente ou abaixo do cód:101.")
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
 * @POSICAO-CURSOR = 1459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */