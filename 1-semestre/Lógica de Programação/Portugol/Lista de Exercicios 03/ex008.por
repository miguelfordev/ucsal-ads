programa
{
	
	funcao inicio()
	{
		//8) Faça um programa que receba um número, calcule e mostre o seu 
		//fatorial. 

		inteiro n,f,i

		escreva("Digite um número para calcular o fatorial: ")
		leia(n)

		f=1
		para(i=1;i<=n;i++){
			f *= i
			}

		escreva("O fatorial de ",n," é: ",f)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */