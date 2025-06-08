package seminario_grafos;

public class TesteGrafo {

	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		grafo.addVertice("Angela");
		grafo.addVertice("Miguel");
		grafo.addVertice("Alex");
		grafo.addVertice("Yuri");
		grafo.addVertice("Felipe");
		
		grafo.addAresta(2.0, "Angela", "Miguel");
		grafo.addAresta(3.0, "Miguel", "Felipe");
		grafo.addAresta(1.0, "Felipe", "Yuri");
		grafo.addAresta(1.0, "Angela", "Yuri");
		grafo.addAresta(2.0, "Alex", "Miguel");
		grafo.addAresta(3.0, "Alex", "Angela");
		
		grafo.buscaEmLargura();

	}

}
