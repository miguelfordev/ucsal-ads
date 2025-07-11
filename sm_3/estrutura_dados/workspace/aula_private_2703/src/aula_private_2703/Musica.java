package aula_private_2703;

public class Musica {
		private int id;
		private String nomeMusica;
		
		public Musica(int id, String nomeMusica) {
			this.id = id;
			this.nomeMusica = nomeMusica;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNomeMusica() {
			return nomeMusica;
		}
		public void setNomeMusica(String nomeMusica) {
			this.nomeMusica = nomeMusica;
		}
		
}
