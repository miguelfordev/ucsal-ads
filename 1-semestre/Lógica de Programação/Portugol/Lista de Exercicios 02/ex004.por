programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//4) As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
		//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia 
		//o número de maçãs compradas, calcule e escreva o valor total da compra. 

		real macas, valorP

		escreva("Digite o numero de maçãs compradas: ")
		leia(macas)

		se (macas>0 e macas<12){
			valorP = macas*0.30
			escreva("O total da compra para maçãs menos uma dúzia é: R$",mat.arredondar(valorP, 3))
			} senao {
				valorP = macas*0.25
				escreva("O total da compra pelo menos uma dúzia é: R$",valorP)
				}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */