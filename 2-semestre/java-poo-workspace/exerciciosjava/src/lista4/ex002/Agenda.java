package lista4.ex002;
import java.util.Scanner;
public class Agenda {
	
	private Contato[] contatos = new Contato[5];
	private int qtd=0;
	
	public void adicionarContato() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n<<- Contato ->>\nNome: "); String nome = sc.next();
		System.out.print("Telefone: "); int tel = sc.nextInt();
		System.out.print("Dia de nascimento: "); String dia = sc.next();
		System.out.print("Mes de nascimento: "); String mes = sc.next();
		System.out.print("Ano de nascimento: "); String ano = sc.next();
		System.out.print("E-mail: "); String email = sc.next();
		Contato ct = new Contato(nome,tel,dia,mes,ano,email);
		this.contatos[this.qtd] = ct;
		this.qtd += 1;
	}
	
	public void consultarContato() {
		Scanner sc = new Scanner(System.in);
		if(qtd==0) {
			System.out.print("\nNão foram adicionados contatos ainda.\n");
		} else {
			System.out.print("\nPesquisa por nome: "); String nome = sc.next();
			int qtdCont=0;			
			for(int i=0;i<qtd;i++) {
				String nomeContato = this.contatos[i].consultaNome();
				if(nomeContato.equalsIgnoreCase(nome)){
					qtdCont += 1;
				}
				System.out.println(qtdCont);
			}
			if(qtdCont!=0) {
				System.out.print("\nExiste(m) "+qtdCont+" com esse nome: "+nome+"\n");
			} else {
				System.out.print("\nNão existe(m) contatos com esse nome.\n");
			}
			
		}
	}
	
	public void listarContatos() {
		if(qtd==0) {
			System.out.print("\nAinda não foram adicionados nenhum contato.\n");
		} else {
			System.out.println("-->> Contatos <<--");
			for(int i=0;i<qtd;i++) {
				System.out.print(contatos[i].toString());
				System.out.println();
			}			
		}
	}
	
	public void listarAniversariante() {
		if(qtd==0) {
			System.out.print("\nAinda não foram adicionados nenhum contato.\n");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.print("Qual mês: "); String mes = sc.next();
			System.out.print("\n->-> Aniversariantes do Mês <-<-\n");
			for(int i=0;i<qtd;i++) {
				String mesCont = contatos[i].consultaMes();
				if(mesCont.equalsIgnoreCase(mes)) {
					System.out.print(contatos[i].toString());
					System.out.println();					
				}
			}			
		}
		
		/*if (qtd == 0) {
	        System.out.print("\nAinda não foram adicionados nenhum contato.\n");
	    } else {
	        Scanner sc = new Scanner(System.in);
	        int mesInt = -1;
	        
	        while (true) {
	            System.out.print("Qual mês (1-12): ");
	            String input = sc.next();
	            
	            try {
	                mesInt = Integer.parseInt(input);
	                if (mesInt < 1 || mesInt > 12) {
	                    System.out.println("Número do mês inválido. Digite um valor entre 1 e 12.");
	                } else {
	                    break;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Entrada inválida. Digite um número entre 1 e 12.");
	            }
	        }
	        
	        System.out.print("\n->-> Aniversariantes do Mês <-<-\n");
	        for (int i = 0; i < qtd; i++) {
	            String mesCont1 = contatos[i].consultaMes();
	            int mesCont = Integer.parseInt(mesCont1);
	            if (mesCont == mesInt) {
	                System.out.print(contatos[i].toString());
	                System.out.println();					
	            }
	        }
	    }*/
	}

}
