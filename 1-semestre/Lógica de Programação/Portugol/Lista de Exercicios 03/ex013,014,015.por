programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		//13) Faça um programa que receba 2 números inteiros e mostre na tela 
		//o seguinte menu: 
		//1 – Soma 
		//2 – Subtração 
		//3 – Multiplicação 
		//4 – Divisão 
		//5 – Trocar valores 
		//6 – Sair 

		//14) O usuário deverá escolher a opção desejada e, então deve ser 
		//mostrado o resultado da operação desejada. Caso o usuário 
		//escolha a opção 5, os valores devem ser recebidos novamente. 

		//15) Uma vez mostrado o resultado da operação escolhida, o menu deve 
		//ser mostrado novamente na tela. Esse ciclo se repetirá até que o 
		//usuário solicite a opção Sair.

		inteiro n1,n2,op,i
		real n3,n4,n5

		escreva("Digite o 1º número: ")
		leia(n1)
		escreva("Digite o 2º número: ")
		leia(n2)

		op=0
		enquanto(op!=6){
			limpa()
			escreva("		MENU		")
			escreva("\n1.Soma 2.Subtração 3.Multiplicação") 
			escreva("\n4.Divisão 5.Trocar valores 6.Sair")
			escreva("\nOpção desejada: ")
			leia(op)
			se(op==6){
				escreva("Fim do programa, volte sempre!")
				pare
				}

			escolha(op) {
				caso 1:{
					limpa()
					escreva("O resultado da Soma é: ",n1,"+",n2,"=",n1+n2)
					u.aguarde(5000)
					pare
					}
				caso 2:{
					limpa()
					escreva("O resultado da Subtração é: ",n1,"-",n2,"=",n1-n2)
					u.aguarde(5000)
					pare
					}
				caso 3:{
					limpa()
					escreva("O resultado da Multiplicação é: ",n1,"x",n2,"=",n1*n2)
					u.aguarde(5000)
					pare
					}
				caso 4:{
					limpa()
					n4=n1
					n5=n2
					n3=n4/n5
					escreva("O resultado da Divisão é: ",n1,"/",n2,"=",n3)
					u.aguarde(5000)
					pare
					}
				caso 5:{
					limpa()
					escreva("Digite o 1º numero novamente: ")
					leia(n1)
					escreva("Digite o 2º numero novamente: ")
					leia(n2)
					u.aguarde(300)
					pare
					}
				}
			para(i=10;i>1;i--){
				limpa()
				escreva("\nVoltando pro MENU em: ",i," segundos.")
				u.aguarde(150)
				}
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */