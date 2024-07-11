programa
{
	
	funcao inicio()
	{
		 //Faça um programa em Português Estruturado que receba 3 notas de um aluno 
		//e seus respectivos pesos, calcule e informe a média ponderada.

		 real n1,n2,n3,media

		 escreva("Digite a nota 1: ")
		 leia(n1)

		 escreva("Digite a nota 2: ")
		 leia(n2)

		 escreva("Digite a nota 3: ")
		 leia(n3)

		 media = (n1+n2+n3)/3

		 se (media >= 7){
		 	escreva("Aluno Aprovado com media: ",media)
		 	}senao{
		 		se (media < 7 e media > 5) {
		 			escreva("Aluno Recuperação com media: ",media)
		 			} senao { escreva("Aluno reprovado com media: ",media)}
		 		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */