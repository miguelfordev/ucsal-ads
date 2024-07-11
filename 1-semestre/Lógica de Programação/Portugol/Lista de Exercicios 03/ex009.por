programa
{
	
	funcao inicio()
	{
		//9) Faça um programa que receba 2 valores inteiros A e B e calcule o 
		//fatorial de todos os números pares de A até B. 

		inteiro n1,n2,i,j,f

		escreva("Digite o 1º número: ")
		leia(n1)
		escreva("Digite o 2º número: ")
		leia(n2)

		
		para(i=n1;i<=n2;i++){
			se(i%2==0){
				f=1
				para(j=1;j<=i;j++){
					f*=j
					}
				escreva("\nFatorial de: ",i," é: ",f)
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 42; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 9, 10, 2}-{n2, 9, 13, 2}-{i, 9, 16, 1}-{j, 9, 18, 1}-{f, 9, 20, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */