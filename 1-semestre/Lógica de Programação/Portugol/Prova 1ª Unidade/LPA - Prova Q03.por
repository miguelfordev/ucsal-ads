programa
{
	
	funcao inicio()
	{
		inteiro a,b,c,i,j=1,fatorial=1

		escreva("Digite o um valor: ")
		leia(a)
		escreva("Digite outro valor: ")
		leia(b)

		escreva("\n")
		se(a>=0 e b>=0){
			se(a>b){
				c=a
				a=b
				b=c
				}
			se(a<b){
				para(i=a;i<=b;i++){
					se(i%2==0){
						fatorial = 1
						para(j=1;j<=i;j++){
							fatorial = fatorial*j
							}
						escreva("O fatorial de ",i," é: ",fatorial,"\n")
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
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */