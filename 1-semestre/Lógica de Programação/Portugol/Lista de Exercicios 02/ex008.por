programa
{
	
	funcao inicio()
	{
		//8) Escreva um programa que leia a idade de 2 homens e 2 mulheres (considere 
		//que a idade dos homens será sempre diferente, assim como das mulheres). 
		//Calcule e escreva a soma das idades do homem mais velho com a mulher mais 
		//nova, e o produto das idades do homem mais novo com a mulher mais velha.

		inteiro h[2],m[2],c
		
		
		para (c=0; c<2; c++) {
		escreva("Digite a ",c+1,"ª idade dos Homens: ")
		leia(h[c])}

		
		para (c=0; c<2; c++) {
		escreva("Digite a ",c+1,"ª idade das Mulheres: ")
		leia(m[c])}

		se (h[0]>h[1] e m[0]>m[1]) {
			escreva("O idade do homem mais velho com a mulher mais nova é igual: ",h[0]+m[1])
			escreva("\nO produto do homem mais novo com a mulher mais velha é igual: ",h[1]*m[0])
			} senao {
				se(h[0]<h[1] e m[0]<m[1]){
					escreva("O idade do homem mais velho com a mulher mais nova é igual: ",h[1]+m[0])
					escreva("\nO produto do homem mais novo com a mulher mais velha é igual: ",h[0]*m[1])
					}
				}

		se (h[0]>h[1] e m[0]<m[1]) {
			escreva("O idade do homem mais velho com a mulher mais nova é igual: ",h[0]+m[0])
			escreva("\nO produto do homem mais novo com a mulher mais velha é igual: ",h[1]*m[1])
			} senao {
				se(h[0]<h[1] e m[0]>m[1]){
					escreva("O idade do homem mais velho com a mulher mais nova é igual: ",h[1]+m[1])
					escreva("\nO produto do homem mais novo com a mulher mais velha é igual: ",h[0]*m[0])
					}
				}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */