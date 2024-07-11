programa
{
	
	funcao inicio()
	{
		real tot_compra, gorjeta, op

		escreva("Digite o valor total da compra/conta: R$")
		leia(tot_compra)

		gorjeta = tot_compra+(tot_compra*15)/100

		escreva("O valor da compra/conta foi: R$", tot_compra," mais os 15%: R$",gorjeta)
		escreva("\nDeseja pagar os 15% - 1- Sim ou 2- Não: ")
		leia(op)

		se(op==1){
			escreva("Agradecemos e Volte Sempre!")
			} senao {
				se(op==2){
					escreva("Tenha uma ótima despedida e vá em paz.")
					} senao {
						escreva("Opção inválida.")
						}
				}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */