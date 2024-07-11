programa
{
	
	funcao inicio()
	{
	//Faça um programa em Português Estruturado que simule um caixa eletrônico 
	//para saque. O algoritmo deve receber um valor monetário (o valor deve ser 
	//recebido como um valor inteiro) e informar quantas notas de R$50,00, R$10,00, 
	//R$5,00 e R$1,00 devem ser entregues ao usuário usando o mínimo de notas 
	//possível.

	real valor
	inteiro c50,c10,c5,c1

	escreva("Digite o valor a ser sacado: R$")
	leia(valor)

	c50 = 0
	c10 = 0
	c5 = 0
	c1 = 0

	enquanto (valor > 0){
		se (valor>=50){
			valor = valor-50
			c50 = c50+1
		} senao {
				se (valor>=10){
				valor = valor-10
				c10 = c10+1
				} senao {
					se (valor>=5){
						valor = valor-5
						c5 = c5+1
					}senao{
							se (valor>= 1){
								valor = valor-1
								c1 = c1+1
							}
						}
					}
			}
		
		}
		escreva("Ao total deu: ",c50," de 50R$, ",c10," de 10R$, ",c5," de 5R$, ",c1," de 1R$.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */