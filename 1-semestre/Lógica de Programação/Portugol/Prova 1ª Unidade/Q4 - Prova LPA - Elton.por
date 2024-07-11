programa
{
	
	funcao inicio()
	{
		real n1,n2,n3
		inteiro op

		escreva("Digite o primeiro numero e positivo: ")
		leia(n1)
		escreva("Digite o segundo numero e positivo: ")
		leia(n2)
		escreva("Digite o terceiro numero e positivo: ")
		leia(n3)

		escreva("Escolha uma das seguintes opções 1) Soma dos números digitados 2) Media dos números digitados \n3) Maior número digitado e 4) Menor número digitado: ")
		leia(op)

		se(op==1) {
			escreva("A soma dos números digitados são: ",n1+n2+n3)
			} senao {
				se(op==2){
					escreva("A media dos números digitados são: ",(n1+n2+n3)/3)
					} senao {
						se(op==3){
							se(n1>n2 e n1>n3){
								escreva("O maior número digitado foi: ",n1)
								} senao {
									se (n2>n1 e n2>n3) {
										escreva("O maior número digitado foi: ",n2)
										} senao {
											escreva("O maior número digitado foi: ",n3)
											}
									}
							} senao {
								se(op==4){
									se(n1<n2 e n1<n3) {
										escreva("O menor número digitado foi: ",n1)
										} senao {
											se(n2<n1 e n2<n3) {
												escreva("O menor número digitado foi: ",n2)
												} senao {
													escreva("O menor número digitado foi: ",n3)
													}
											}
									} senao {
										escreva("Opção inválida.")
										}
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
 * @POSICAO-CURSOR = 1293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */