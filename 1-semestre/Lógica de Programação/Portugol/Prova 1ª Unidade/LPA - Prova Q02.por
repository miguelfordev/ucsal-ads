programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,n3,i,j,div

		escreva("Digite o 1º número: ")
		leia(n1)
		escreva("Digite o 2º número: ")
		leia(n2)

		se(n2>n1){
			n3=n1
			n1=n2
			n2=n3
			}
		
		se(n1>n2){
			para(i=n1;i>=n2;i--){
				div=0
				para(j=i;j>=1;j--){
					se(i%j==0){
						div = div + 1
						}
					}
				se(i%2==0){
					escreva("\nO número: ",i," é par e")
					se(div==2){
						escreva(" primo.")
						} senao {
							escreva(" não é primo.")
							}
					} senao{
						escreva("\nO número: ",i," é impar e")
						se(div==2){
							escreva(" primo.")
							} senao {
								escreva(" não é primo.")
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
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 13, 2}-{i, 6, 19, 1}-{j, 6, 21, 1}-{div, 6, 23, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */