programa
{
	
	funcao inicio()
	{
		//1) Faça um programa que receba um número e informe se é um termo 
		//da sequência de Fibonacci. Na sequência de Fibonacci cada termo 
		//é a soma dos dois termos anteriores: 
		//(1, 1, 2, 3, 5, 8, 13...) 

		inteiro t1,t2,t3,n,c,vf

		escreva("Digite o número pra saber se pertence a sequência de Fibonnaci: ")
		leia(n)

		t1=0
		t2=1
		c=0
		vf=0
		se (n >= 0) {
			faca{
				se (c==0) {
					t1 = 0
					escreva(t1," ")
					} senao {
						se (c==1) {
							t1 = 0
							t2 = 1
							}
						}
				t3 = t1 + t2
				escreva(t3," ")
				t1 = t2
				t2 = t3
				c = c + 1
				se (t3 == n) {
					vf = 1
					} senao {
						se(t3 > n e vf == 0) {
							vf = 0
							}
						}
				
				}enquanto(t3<=n)
			} senao {
				se(n<0){
					escreva("Não é possível com números negativos.")
					}
				}

			se (vf==1 ou n == 0) {
				escreva("\nÉ um número de Fibonacci.")
				} senao {
					escreva("\nNão é um número de Fibonacci.")
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */