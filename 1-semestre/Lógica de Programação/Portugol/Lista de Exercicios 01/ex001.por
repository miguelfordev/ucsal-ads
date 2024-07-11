programa
{
	
	funcao inicio()
	{
		//1) Faça um programa em Português Estruturado que receba uma temperatura 
		// em centígrados e transforme para fahrenheit. Sabe-se que a fórmula para 
		// conversão é F=((9*C)+160)/5.
		 
		real grausC, F

		escreva("Digite quantos graus em Celsius: ")
		leia(grausC)

		F = ((9*grausC)+160)/5

		escreva("A quantidade de graus em Celsius: ",grausC," equivale a graus em Fahrenheit:",F)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */