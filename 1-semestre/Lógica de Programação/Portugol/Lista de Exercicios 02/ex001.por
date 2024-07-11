programa
{
	
	funcao inicio()
	{	
		//1) Escreva um algoritmo em Português Estruturado para ler o ano de nascimento 
		//de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar 
		//este ano (não é necessário considerar o mês em que ela nasceu). 
		
		inteiro anoN, idade
		
		escreva("Digite o ano de nascimento: ")
		leia(anoN)

		idade = 2024 - anoN

		se (idade >= 18){
			escreva("Pode VOTAR.")
			} senao {
				escreva("NÃO pode VOTAR")}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */