programa
{
	
	funcao inicio()
	{
		//4) Faça um programa que receba vários números positivos, calcule e 
		//mostre: 
		//a. A soma dos números digitados; 
		//b. A quantidade de números digitados; 
		//c. A média dos números digitados; 
		//d. O maior número digitado; 
		//e. O menor número digitado; 
		//f. A média dos números pares.

		inteiro n,soma,contN,maior,menor,somaPar,contPar
		real mediaPar, mediaN
		n=1
		soma=0
		contN=0
		maior=0
		menor=0
		somaPar=0 
		contPar = 0
		mediaN=0.0
		mediaPar=0.0
		enquanto(n!=0){
			escreva("Digite um numero: ")
			leia(n)
			se(n==0){
				pare
				}

			soma = soma + n
			contN = contN + 1
			se(n>0 e contN==1){
				maior = n
				menor = n
				} senao{
					se(n>maior){
						maior = n
						} senao{
							se(n<menor){
								menor=n
								}
							}
					}

			se(n%2==0){
				somaPar = somaPar + n
				contPar = contPar + 1
				}
			}
		mediaN=soma/contN
		mediaPar=somaPar/contPar
		escreva("\nA soma dos números digitados: ",soma)
		escreva("\nA quantidade de números digitados: ",contN)
		escreva("\nA média dos números digitados: ",mediaN)
		escreva("\nO número maior digitado foi: ",maior)
		escreva("\nO número menor digitado foi: ",menor)
		escreva("\nA média dos números pares: ",mediaPar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 793; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */