programa
{
	
	funcao inicio()
	{
		//6) Tendo como entrada a altura e o sexo (codificado da seguinte forma: 
		//1:feminino 2:masculino) de uma pessoa, construa um programa que calcule e 
		//imprima seu peso ideal, utilizando as seguintes fórmulas: 
		//– para homens : (72.7 * h) – 58 
		//– para mulheres : (62.1 * h) – 44.7 
		//Observação: Altura = h (na fórmula acima). 

		real altura, pesoI
		inteiro sexo

		escreva("Digite o seu sexo: 1- feminino e 2- masculino: ")
		leia(sexo)

		escreva("Digite sua altura: ")
		leia(altura)

		se (sexo == 1) {
			pesoI = (62.1*altura)-44.7
			escreva("O peso ideal feminino é: ",pesoI)
			} senao {
				se (sexo==2){
					pesoI = (72.7*altura)-58
					escreva("O peso ideal masculino é: ",pesoI)
					} senao {
						escreva("Sexo invalido.")
						}
				}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */