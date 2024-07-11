programa
{
	
	funcao inicio()
	{
		//5) Faça um programa que receba um número inteiro e informe se é um 
		//número primo.

		inteiro n,c,div

		escreva("Digite um número inteiro: ")
		leia(n)
		div=0
		para(c=1;c<=n;c++){
			se(n%c==0){
				div = div + 1
				}
			}

		se(div==2){
			escreva(n,"-> É um número primo.")
			} senao {
				escreva(n,"-> Não é um número primo.")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */