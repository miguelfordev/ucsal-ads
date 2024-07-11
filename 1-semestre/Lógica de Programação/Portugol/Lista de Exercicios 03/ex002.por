programa
{
	
	funcao inicio()
	{
		//2) Faça um programa que receba os dados coletados numa pesquisa 
		//feita para saber o gosto dos frequentadores de um cinema. Foi 
		//perguntado às pessoas: 
		//- A idade 
		//- O sexo 
		//- A preferência entre os gêneros: Comédia, terror ou ação. 
		//A entrada de dados termina quando for digitado -1 para a idade da 
		//pessoa. Ao final o programa deve informar: 
		//a. Qual a média de idade das pessoas que preferem filmes de 
		//terror. 
		//b. Qual o percentual de homens que prefere filmes de ação. 
		//c. Mais homens ou mais mulheres preferem os filmes de 
		//comédia. 
		//d. Em que faixa etária estão os frequentadores do referido 
		//cinema.

		real id, sex, gen, soma_tr, cont_tr, qtd_hm, hm_ac, hm_cmd, mh_cmd, qtd_mh, soma_hm, soma_mh

		id = 0.0
		soma_tr = 0.0
		cont_tr = 0.0
		qtd_hm = 0.0
		hm_ac = 0.0
		hm_cmd = 0.0
		mh_cmd = 0.0
		qtd_mh = 0.0
		soma_hm = 0.0
		soma_mh = 0.0
		enquanto (id!=-1){
			escreva("Informe a idade: ")
			leia(id)
			se(id==-1){
				pare
				}
			escreva("Sexo 1-Feminino 2-Masculino: ")
			leia(sex)
			escreva("Genêro de filme 1-Comédia,2-Terror e 3-Ação: ")
			leia(gen)
			//limpa()
			se(gen==2){
				 soma_tr = soma_tr + id
				 cont_tr = cont_tr + 1
				}
			se(sex==2){
				qtd_hm = qtd_hm + 1
				soma_hm = soma_hm + id
				se(gen==3){
					hm_ac = hm_ac + 1
					}
				se(gen==1){
					hm_cmd = hm_cmd + 1
					}
				}
			se(sex==1){
				soma_mh = soma_mh + id
				qtd_mh = qtd_mh + 1
				se(gen==1){
					mh_cmd = mh_cmd + 1
					}
				}
			
			}
		//limpa()
		escreva("A média da idade de pessoas que preferem de filmes de terror é: ",soma_tr/cont_tr)
		escreva("\nO percentual de homens que preferem filme de ação é: ",(hm_ac/qtd_hm)*100,"%")
		se(hm_cmd>mh_cmd){
			escreva("\nMais homens preferem filmes de comédia que as mulheres.")
			} senao {
				se(mh_cmd>hm_cmd){
					escreva("\nMais mulheres preferem filmes de comédia que os homens.")
					} senao {
						escreva("\nA quantidade dos sexos que preferem filmes de comédia são iguais ou ninguem prefere filme de comédia.")
						}
				}

		escreva("\nA média de idade do frequentadores do cinema são: ",(soma_mh+soma_hm)/(qtd_hm+qtd_hm)," anos.")
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */