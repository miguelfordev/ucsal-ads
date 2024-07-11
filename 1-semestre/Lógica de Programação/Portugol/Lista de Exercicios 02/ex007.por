programa
{
	
	funcao inicio()
	{
		//7) Escreva um programa para ler 2 valores inteiros e uma das seguintes 
		//operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. 
		//Subtração, 3. Divisão, 4. Multiplicação). 
		//Calcular e escrever o resultado dessa operação sobre os dois valores lidos. 
		//Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4. 

		inteiro op
		real n1,n2

		escreva(" -- MENU -- \n")
		escreva("1.Adição 2.Subtração 3.Divisão 4. Multiplicação: ")
		leia(op)
		limpa()

		escreva("Digite o primeiro valor da operação: ")
		leia(n1)
		escreva("Digite o segundo valor da operação: ")
		leia(n2)
		limpa()

		se (op==1){
			escreva("A Soma do 1º valor: ",n1," mais(+) 2º valor: ",n2," é igual(=): ",n1+n2,".")
			} senao {
				se (op==2){
					escreva("A Subtração do 1º valor: ",n1," menos(-) 2º valor: ",n2," é igual(=): ",n1-n2,".")		
					} senao{
						se (op==3){
							escreva("A Divisão do 1º valor: ",n1," divido(/) 2º valor: ",n2," é igual(=): ",n1/n2,".")
							} senao {
								se(op==4){
									escreva("A Multiplicação do 1º valor: ",n1," multiplicado(x) 2º valor: ",n2," é igual(=): ",n1*n2,".")
									} senao {
										escreva("OPERAÇÃO INVÁLIDA.")
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
 * @POSICAO-CURSOR = 1273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */