programa
{
	
	funcao inicio()
	{
		//12) Faça um programa que receba um número N e mostre na tela as 
		//tabuadas de dividir de todos os números menores do que N.

		inteiro n,i,j

		escreva("Digite um número: ")
		leia(n)

		para(i=1;i<n;i++){
			escreva("A tabuada de divisão de ",i,":\n")
			para(j=1;j<=10;j++){
				escreva(i,"/",j,"=",i/j,"\n")
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */