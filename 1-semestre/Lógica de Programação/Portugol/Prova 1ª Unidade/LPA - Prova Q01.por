programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,i

		escreva("Digite o 1º número: ")
		leia(n1)
		escreva("Digite o 2º número: ")
		leia(n2)
		escreva("Do menor pro maior: ")
		se(n1<n2){
			para(i=n1;i<=n2;i++){
				escreva(i," ")
				}
			} senao {
				se(n1>n2){
					para(i=n2;i<=n1;i++){
						escreva(i," ")
						}
					}
				}

		escreva("\nDo maior pro menor: ")
		se(n1>n2){
			para(i=n1;i>=n2;i--){
				escreva(i," ")
				}
			} senao {
				se(n2>n1){
					para(i=n2;i>=n1;i--){
						escreva(i," ")
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
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 13, 2}-{i, 6, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */