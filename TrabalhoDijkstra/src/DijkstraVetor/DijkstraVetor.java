package DijkstraVetor;

import Main.Grafo;

public class DijkstraVetor {
	
	private Grafo grafo;
	private double p[];
	
	public DijkstraVetor () {}

	public DijkstraVetor (Grafo grafo) {
		this.grafo = grafo;
	}
	
	public void calculaMenorCaminho(int raiz) { 
		dijkstra(this.grafo,raiz);
	}
	
	public void dijkstra(Grafo grafo,int raiz) {
		
		int n = grafo.numVertices();
		this.p = new double[n]; //peso dos vértices
		
        boolean visitados[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            p[i] = Double.MAX_VALUE;
            visitados[i]=false;
        }
        
        p[raiz] = 0;
        
        for (int i = 0; i < n ; i++) {
   /*1.*/   int menorVertice = encontrarVerticeMinimo(p, visitados);
            if(!grafo.listaAdjVazia(menorVertice)){
  /*2*/			Grafo.Aresta adj = grafo.primeiroListaAdj(menorVertice);
				if( p[menorVertice] == Double.MAX_VALUE) {break;}
				while(adj != null){					 	
     				if (adj.peso()  != 0 && !visitados[adj.v2()] ){
							if (p[adj.v2()] > p[menorVertice] + adj.peso()) {
								p[adj.v2()] = p[menorVertice] + adj.peso();
							}						
					 }
					adj = grafo.proxAdj(menorVertice);
				}
				visitados[menorVertice] = true;
            }
        }
	}
	
	private int encontrarVerticeMinimo(double[] distancias, boolean visitados[]) {
        int verticeMinimo = -1;
        for (int i = 0; i < distancias.length; i++) {
            if (!visitados[i] && (verticeMinimo == -1 || distancias[i] < distancias[verticeMinimo])) {
                verticeMinimo = i;
            }
        }
        return verticeMinimo;
    }
	
	public void imprimeCaminhoCompleto() {
		
		System.out.println("---------------------");
		System.out.println("Algoritmo Dijkstra implementado com Vetor");
		for(int i=0; i< this.p.length; i++) {
			System.out.println("d["+ i +"] = "+ p[i]);
		}
		System.out.println("");
		
	}

}
