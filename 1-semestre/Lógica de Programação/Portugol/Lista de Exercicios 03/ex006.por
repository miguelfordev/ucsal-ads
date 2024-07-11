programa
{
	
	funcao inicio()
	{
		//6) Faça um programa que receba um número N e mostre na tela os N 
		//primeiros números primos.

		inteiro n,cont,num,i
		logico div

		escreva("Digite quantos números primo você quer saber: ")
		leia(n)

		cont = 0
		num = 2

		escreva("Os ",n," primeiros números primos são:")
		enquanto(cont<n){
			div = verdadeiro
			para(i=2;i<=num/2;i++){
				se(num%i==0){
					div = falso
					pare
					}
				}
			se(div){
				escreva(num," ")
				cont = cont + 1
				}
			num = num + 1
			}
		
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = 20;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */