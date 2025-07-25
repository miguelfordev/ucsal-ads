package gamesIIunid;
import java.util.Scanner;
public class JogosIIUnidade {

	public static void main(String[] args) {
		menuJogos();
	}
	
	public static void menuJogos() {
		while (true) {
			System.out.print("====== MENU DE JOGOS ======\n1- Jogo da Forca\n2- Jogo da Velha\n3- Jogo do Sudoku\n4- Sair\n - Opção: ");
			int op = new Scanner(System.in).nextInt();
			switch(op) {
			case 1: iniciarJf();
					break;
			case 2: iniciarJv();
					break;
			case 3: iniciarJs();
					break;
			case 4: System.out.print("\n\nVoltem sempre aos nossos jogos.\nFim do programa."); 
					System.exit(0);
			default: limpaConsole();
					System.out.print("\nOpção inválida.\n\n");
			}
		}
	}
	
	public static void iniciarJf() {
		
		limpaConsole();
    	System.out.print("=== Jogo da Forca ==== \nOlá Jogador 1, Bem-vindo ao Jogo da Forca!\nPor favor, digite a palavra a ser adivinhada: ");
    	String palavra_a_ser_advinhada = new Scanner(System.in).next().toLowerCase();
        limpaConsole();
        
        StringBuilder marcacao_palavra_advinhada = new StringBuilder("_".repeat(palavra_a_ser_advinhada.length()));
        int tentativas_restantes = 6;

        System.out.println("Bem-vindo ao Jogo da Forca Jogador 2, Jogador 1 escolheu a palavra.\n");
        exibirPalavraAdivinhadaJf(marcacao_palavra_advinhada);
        exibirDesenhoForca(tentativas_restantes);

        while (tentativas_restantes > 0 && marcacao_palavra_advinhada.indexOf("_") != -1) {
            System.out.println("\nTentativas restantes: " + tentativas_restantes);
            System.out.print("Digite uma letra: ");
            char letra = new Scanner(System.in).next().toLowerCase().charAt(0); 
            if (!verifTentativaJf(letra,palavra_a_ser_advinhada,marcacao_palavra_advinhada)) {
            	tentativas_restantes--;
            }
            limpaConsole();
            exibirPalavraAdivinhadaJf(marcacao_palavra_advinhada);
            exibirDesenhoForca(tentativas_restantes);
        }

        if (tentativas_restantes == 0) {
            System.out.println("\nVocê perdeu Jogador 2! Jogador 1 escolheu uma palavra dificil. A palavra correta era: " + palavra_a_ser_advinhada);
        } else {
            System.out.println("\nParabéns Jogador 2! Você ganhou!");  
        }
        voltarMenu(1);
	}
	
	public static boolean verifTentativaJf(char letra, String palavra_a_ser_advinhada, StringBuilder marcacao_palavra_advinhada) {
		boolean tenta = false;
        for (int i = 0; i < palavra_a_ser_advinhada.length(); i++) {  
            if (palavra_a_ser_advinhada.charAt(i) == letra) {
            	marcacao_palavra_advinhada.setCharAt(i, letra); 
                tenta = true;
            }
        }
        return tenta;
	}
	
	public static void limpaConsole() {
    	for (int i = 0; i < 50; i++) {
            System.out.println();
            }
    }
	
	public static void exibirPalavraAdivinhadaJf(StringBuilder marcacao_palavra_advinhada) {
        System.out.println("Adivinhe a palavra: " + marcacao_palavra_advinhada.toString());
    }
	
	public static void exibirDesenhoForca(int tentativas_restantes) {
		String[] desenho_forca = {
		        "=== Jogo da Forca ===\n"+
				"+----+\n" +
		        "|    |\n" +
		        "|\n" +
		        "|\n" +
		        "|\n" +
		        "|\n" +
		        "=========",
		        
		        "=== Jogo da Forca ===\n"+
		        "+----+\n" +
		        "|    |\n" +
		        "|    O\n" +
		        "|\n" +
		        "|\n" +
		        "|\n" +
		        "=========",
		        
		        "=== Jogo da Forca ===\n"+
		        "+----+\n" +
		        "|    |\n" +
		        "|    O\n" +
		        "|    |\n" +
		        "|\n" +
		        "|\n" +
		        "=========",
		        
		        "=== Jogo da Forca ===\n"+
		        "+----+\n" +
		        "|    |\n" +
		        "|    O\n" +
		        "|   /|\n" +
		        "|\n" +
		        "|\n" +
		        "=========",
		        
		        "=== Jogo da Forca ===\n"+
		        "+----+\n" +
		        "|    |\n" +
		        "|    O\n" +
		        "|   /|\\ \n" +
		        "|\n" +
		        "|\n" +
		        "=========",
		        
		        "=== Jogo da Forca ===\n"+
		        "+----+\n" +
		        "|    |\n" +
		        "|    O\n" +
		        "|   /|\\ \n" +
		        "|   / \n" +
		        "|\n" +
		        "=========",
		        
		        "=== Jogo da Forca ===\n"+
		        "+----+\n" +
		        "|    |\n" +
		        "|    O\n" +
		        "|   /|\\ \n" +
		        "|   / \\ \n" +
		        "|\n" +
		        "========="
		    };
		System.out.println("\n" + desenho_forca[6 - tentativas_restantes]);
    }

	public static void voltarMenu(int numero_jogo) {
		while(true) {
        	System.out.print("\nQuer continuar a jogar? 1-Sim 2-Não\nResposta: ");
        	int resp = new Scanner(System.in).nextInt();
        	switch(resp) {
        		case 1: limpaConsole();
        				if(numero_jogo==1) {
        					iniciarJf();        					
        				}
        				if(numero_jogo==2) {
        					iniciarJv();
        				}
        				if(numero_jogo==3) {
        					iniciarJs();
        				}
    					break;
        		case 2: limpaConsole();
        				if(numero_jogo==1) {
        					System.out.println("Voltem sempre ao Jogo da Forca!\n\n");        					
        				}
        				if(numero_jogo==2) {
        					System.out.println("Voltem sempre ao Jogo da Velha!\n\n");
        				}
        				if(numero_jogo==3) {
        					System.out.println("\nVoltem sempre ao Sudoku!\n\n");
        				}
    					menuJogos();
    					break;
    			default: limpaConsole();
    					 System.out.print("\nOpção inválida.\n");
        	}
		}
	}
	
	public static void iniciarJv() {
		char jogador_atual = 'X';
		char tabuleiro_matriz[][] = new char[3][3];
		
		limpaConsole();
        System.out.println("\n=== Jogo da Velha ===\n\nBem vindos Jogador X e Jogador O!");
        carregarTabuleiroJv(tabuleiro_matriz,' '); 
        
        while (true) {
        	exibirTabuleiroJv(tabuleiro_matriz);
        	
            System.out.print("\nJogador " + jogador_atual + ", por favor, faça sua jogada na linha (escolha entre 0 e 2): ");
            int linha = new Scanner(System.in).nextInt();
            System.out.print("\nJogador " + jogador_atual + ", por favor, faça sua jogada na coluna (escolha entre 0 e 2): ");
            int coluna = new Scanner(System.in).nextInt();
            
            if (verifJogadaJv(tabuleiro_matriz, linha, coluna, jogador_atual, ' ')) {
                if (verifVitoriaJv(tabuleiro_matriz, jogador_atual)) {
                	limpaConsole();
                	exibirTabuleiroJv(tabuleiro_matriz);
                    System.out.println("\n\nJogador " + jogador_atual + " venceu!");
                    voltarMenu(2);
                    break;
                } else if (verifPreenchiTabuleiroJv(tabuleiro_matriz, ' ')) {
                	limpaConsole();
                	exibirTabuleiroJv(tabuleiro_matriz);
                    System.out.println("\n\nO jogo empatou!");
                    voltarMenu(2);
                    break;
                }
                jogador_atual = (jogador_atual == 'X') ? 'O' : 'X';
                limpaConsole();
            } else {
            	limpaConsole();
                System.out.println("\nJogada inválida, tente novamente.");
            }
        }
	}

	public static void carregarTabuleiroJv(char[][] tabuleiro_matriz,char preencher_vazio) {
		for (int i = 0; i < tabuleiro_matriz.length; i++) {
            for (int j = 0; j < tabuleiro_matriz.length; j++) {
                tabuleiro_matriz[i][j] = preencher_vazio;
            }
        }
	}
	
	public static void exibirTabuleiroJv(char[][] tabuleiro_matriz) {
		System.out.println("\n=== Tabuleiro Jogo da Velha ===\n");
        for (int i = 0; i < tabuleiro_matriz.length; i++) {
            for (int j = 0; j < tabuleiro_matriz.length; j++) {
                System.out.print(tabuleiro_matriz[i][j]);
                if (j < tabuleiro_matriz.length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < tabuleiro_matriz.length - 1) {
                System.out.println("-".repeat(11));
            }
        }
	}
	
	public static boolean verifJogadaJv(char[][] tabuleiro_matriz, int linha, int coluna, char jogador_atual, char preencher_vazio) {
        if (linha < 0 || linha >= tabuleiro_matriz.length || coluna < 0 || coluna >= tabuleiro_matriz.length || tabuleiro_matriz[linha][coluna] != preencher_vazio) {
            return false;
        }
        tabuleiro_matriz[linha][coluna] = jogador_atual;
        return true;
    }
	
	public static boolean verifVitoriaJv(char[][] tabuleiro_matriz, char jogador_atual) {
        for (int i = 0; i < tabuleiro_matriz.length; i++) {
            if (tabuleiro_matriz[i][0] == jogador_atual && tabuleiro_matriz[i][1] == jogador_atual && tabuleiro_matriz[i][2] == jogador_atual) {
                return true;
            }
            if (tabuleiro_matriz[0][i] == jogador_atual && tabuleiro_matriz[1][i] == jogador_atual && tabuleiro_matriz[2][i] == jogador_atual) {
                return true;
            }
        }
        if ((tabuleiro_matriz[0][0] == jogador_atual && tabuleiro_matriz[1][1] == jogador_atual && tabuleiro_matriz[2][2] == jogador_atual) ||
            (tabuleiro_matriz[0][2] == jogador_atual && tabuleiro_matriz[1][1] == jogador_atual && tabuleiro_matriz[2][0] == jogador_atual)) {
            return true;
        }
        return false;
    }
	
	public static boolean verifPreenchiTabuleiroJv(char[][] tabuleiro_matriz, char preencher_vazio) {
        for (int i = 0; i < tabuleiro_matriz.length; i++) {
            for (int j = 0; j < tabuleiro_matriz.length; j++) {
                if (tabuleiro_matriz[i][j] == preencher_vazio) {
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void iniciarJs() {
		int[][] tabuleiroJs = {
		        {5, 3, 0, 0, 7, 0, 0, 0, 0},
		        {6, 0, 0, 1, 9, 5, 0, 0, 0},
		        {0, 9, 8, 0, 0, 0, 0, 6, 0},
		        {8, 0, 0, 0, 6, 0, 0, 0, 3},
		        {4, 0, 0, 8, 0, 3, 0, 0, 1},
		        {7, 0, 0, 0, 2, 0, 0, 0, 6},
		        {0, 6, 0, 0, 0, 0, 2, 8, 0},
		        {0, 0, 0, 4, 1, 9, 0, 0, 5},
		        {0, 0, 0, 0, 8, 0, 0, 7, 9}
		    };
		boolean[][] tabuleiroFixoJs = new boolean[9][9];
		
		fixandoTabuleiro(tabuleiroJs,tabuleiroFixoJs);
		limpaConsole();
		System.out.print("\n\n=== Jogo do Sudoku ===\n\n");
		while (true) {
			exibindoTabuleiroJs(tabuleiroJs);
            System.out.print("\nPor favor, digite a linha (entre 1 a 9). Sair(0): ");
			int linha = new Scanner(System.in).nextInt() - 1;
			System.out.print("Por favor, digite a coluna (entre 1 a 9). Sair(0): ");
            int coluna = new Scanner(System.in).nextInt() - 1;
            System.out.print("Por favor, digite o numero (entre 1 a 9). Sair(0): ");
            int numero_tentado = new Scanner(System.in).nextInt();
            
            if (linha == -1 && coluna == -1 && numero_tentado == 0) {
            	System.out.print("\nJogo encerrado.\n");
                voltarMenu(3);
                break;
            }

            if (verificandoNumeroSeFixo(tabuleiroFixoJs, linha, coluna)) {
            	limpaConsole();
                System.out.println("\nNão é possivel trocar esse número. Tente novamente.\n\n");
            } else {
            	if (jogadaValida(tabuleiroJs, linha, coluna, numero_tentado)) {
            		tabuleiroJs[linha][coluna] = numero_tentado;
            		if(foiConcluido(tabuleiroJs)) {
            			limpaConsole();
            			exibindoTabuleiroJs(tabuleiroJs);
            			System.out.print("\n\nParabéns Jogador! Você concluiu o Sudoku\n\n.");
            			voltarMenu(3);
            			break;
            		}
            		limpaConsole();
            	} else {
            		limpaConsole();
            		System.out.println("\nJogada inválida. Tente novamente.\n\n");
            	}            	
            } 
		}
	}
	
	public static void fixandoTabuleiro(int[][] tabuleiroJs, boolean[][] tabuleiroFixoJs) {
		for (int l = 0; l < 9; l++) {
            for (int c = 0; c < 9; c++) {
                if (tabuleiroJs[l][c] != 0) {
                    tabuleiroFixoJs[l][c] = true;
                }
            }
        }
	}

	public static boolean verificandoNumeroSeFixo(boolean[][] tabuleiroFixoJs, int linha, int coluna) {
		return tabuleiroFixoJs[linha][coluna];
	}
	
	public static void exibindoTabuleiroJs(int[][] tabuleiroJs) {
		for (int l = 0; l < 9; l++) {
            if (l % 3 == 0 && l != 0) {
                System.out.println("------+-------+-------");
            }
            for (int c = 0; c < 9; c++) {
                if (c % 3 == 0 && c != 0) {
                    System.out.print(" |");
                }
                System.out.print(" " + (tabuleiroJs[l][c] == 0 ? " " : tabuleiroJs[l][c]));
            }
            System.out.println();
        }
	}
	
	public static boolean jogadaValida(int[][] tabuleiroJs, int linha, int coluna, int numero_tentado) {
		if (numero_tentado < 1 || numero_tentado > 9 || linha < 0 || linha >= 9 || coluna < 0 || coluna >= 9) {
            return false;
        }

        for (int x = 0; x < 9; x++) {
            if (tabuleiroJs[linha][x] == numero_tentado || tabuleiroJs[x][coluna] == numero_tentado) {
                return false;
            }
        }

        int quadrante_linha = linha - linha % 3;
        int quadrante_coluna = coluna - coluna % 3;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (tabuleiroJs[l + quadrante_linha][c + quadrante_coluna] == numero_tentado) {
                    return false;
                }
            }
        }
        return true;
	}
	
	public static boolean foiConcluido(int[][] tabuleiroJs) {
		for (int l = 0; l < 9; l++) {
            for (int c = 0; c < 9; c++) {
                if (tabuleiroJs[l][c] == 0) {
                    return false;
                }
            }
        }
        return true;
	}
	
}
