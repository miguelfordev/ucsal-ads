programa
{
	
	funcao inicio()
	{
		//4) Faça um programa em Português Estruturado que receba a idade de uma 
		// pessoa em anos, meses e dias e informe quantos dias aproximadamente ele já 
		// viveu. (Assumindo que todos os meses tem 30 dias).
		
		inteiro anoN, mesN, diaN
		inteiro idade, r1, r2, r3

		escreva("Digite o seu ano de nascimento:")
		leia(anoN)

		escreva("Digite o seu mês de nascimento:")
		leia(mesN)

		escreva("Digite o seu dia de nascimento:")
		leia(diaN)		 

		se (2024 > anoN e 1 <= mesN e mesN <= 12 e 1 <= diaN  e diaN <= 30) {
			idade = 2024-anoN
			se (3 > mesN){
				r1 = idade*365
				r2 = mesN*30
				} senao { 
				r1 = (idade-1)*365
				r2 = (12-3)*30
					}
			se (22 > diaN){
				r3 = 22-diaN
				} senao {
				r3 = diaN-22
					}
			escreva(r1+r2+r3," Dias de nascido!")	
		} senao {
			escreva("Datas incoerentes.")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 873; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */