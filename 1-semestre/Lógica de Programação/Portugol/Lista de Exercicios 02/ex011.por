programa
{
	
	funcao inicio()
	{
		//11. A universidade “UFPE” faz o pagamento de seus professores por hora/aula. 
		//Faça um programa em português estruturado que receba o enquadramento do 
		//professor e a quantidade de horas trabalhadas, calcule e exiba o salário do 
		//professor. Sabe-se que o valor da hora/aula que segue abaixo: 
		//Enquadramento Valor da hora/aula 
		//Nível 1 - R$12,00 
		//Nível 2 - R$17,00 
		//Nível 3 - R$25,00 

		inteiro ht, nivel

		escreva("Digite o nivel do professor: ")
		leia(nivel)

		escreva("Digite as horas trabalhadas: ")
		leia(ht)

		se(nivel==1){
			escreva("Salario de professor nivel 1: R$",ht*12)
			} senao { 
				se(nivel==2){
					escreva("Salário de professor nivel 2: R$",ht*17)
				} senao {
					se(nivel==3){
					escreva("Salário de professor nível 3: R$",ht*25) }
					senao { 
						escreva("nivel do professor não existe")
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
 * @POSICAO-CURSOR = 893; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */