programa
{
	
	funcao inicio()
	{
		//3) Escreva um programa para ler o nome do cliente e o saldo inicial de 
		//uma conta bancária. A seguir ler um número indeterminado de 
		//pares de valores indicando respectivamente o tipo da operação. 
		//Codificado da seguinte forma: 
		//1.Depósito 
		//2.Retirada 
		//3.Fim e o valor. 
		//Quando for informado para o tipo o código 3, o programa deve ser 
		//encerrado e impresso o saldo final da conta com as seguintes 
		//mensagens: CONTA ZERADA, CONTA ESTOURADA(se o saldo for 
		//negativo) ou CONTA PREFERENCIAL (se o saldo for positivo).

		cadeia nome
		real sal,trans
		inteiro op

		escreva("Digite o nome do cliente: ")
		leia(nome)
		escreva("Digite o saldo da conta: ")
		leia(sal)

		op=0
		trans=0.0
		enquanto(op!=3) {
			escreva("		MENU		")
			escreva("\n1. Depósito 2. Retirada 3. Sair: ")
			leia(op)

			se(op==1){
				escreva("Digite o valor do deposito: R$")
				leia(trans)
				sal = sal + trans
				} senao {
					se(op==2){
						escreva("Digite o valor de retirada: R$")
						leia(trans)
						sal = sal - trans
						}
					}
			}
		limpa()
		se(sal>0){
			escreva("Conta preferencial. Nome do cliente: ",nome," Saldo:R$",sal)
			} senao {
				escreva("Conta zerada ou negativada. Nome do cliente: ",nome," Saldo:R$",sal)
				}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */