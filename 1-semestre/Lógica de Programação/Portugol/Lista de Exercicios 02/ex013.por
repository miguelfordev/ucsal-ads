programa
{
	
	funcao inicio()
	{
		//13. Um banco concederá um crédito especial aos seus clientes, variável com o 
		//saldo médio no último ano. Faça um programa em português estruturado que 
		//receba o saldo médio de um cliente e calcule o valor do crédito de acordo com a 
		//tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do 
		//crédito. 
		//Saldo médio (R$) Percentual 
 		//0,00 a 200,00 Nenhum crédito 
		//200,01 a 400,00 20% do valor do saldo médio 
		//400,01 a 600,00 30% do valor do saldo médio 
		//Acima de 600,00 40% do valor do saldo médio

		real saldo_medio

		escreva("Informe o saldo médio: R$")
		leia(saldo_medio)

		se (saldo_medio > 0.00 e saldo_medio <= 200.00){
			escreva("Saldo médio insuficiente para conceder crédito.")
			} senao{
				se (saldo_medio >= 200.01 e saldo_medio <= 400.00) {
					escreva("Saldo médio: R$",saldo_medio,". Emprestimo concedido de: R$",saldo_medio+(saldo_medio*20)/100)
					} senao{
						se (saldo_medio >= 400.01 e saldo_medio <= 600.00) {
							escreva("Saldo médio: R$",saldo_medio,". Emprestimo concedido de: R$",saldo_medio+(saldo_medio*30)/100)
							} senao{
								se (saldo_medio > 600.00){
									escreva("Saldo médio: R$",saldo_medio,". Emprestimo concedido de: R$",saldo_medio+(saldo_medio*40)/100)
									} senao{
										escreva("Saldo medio negativado.")
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
 * @POSICAO-CURSOR = 1368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */