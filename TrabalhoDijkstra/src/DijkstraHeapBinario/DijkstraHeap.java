package DijkstraHeapBinario;

import Main.Grafo;

public class DijkstraHeap {
	
	private int antecessor[];
	private double p[];
	private Grafo grafo;
	private FPHeapMin heap;
		
	public FPHeapMin getHeap() {
		return heap;
	}

	public void setHeap(FPHeapMin heap) {
		this.heap = heap;
	}

	public DijkstraHeap (Grafo grafo) {
		this.grafo = grafo;
	}
	
	public void Dijkstra(Grafo grafo, int s) throws Exception {		
		
		int n = this.grafo.numVertices();
		this.p = new double[n] ; // peso dos vértices
		int vs[] = new int [n+1]; // vértices		
		this.antecessor = new int [n] ;
		
		for (int u = 0; u < n; u ++) {
			this.antecessor[u] = -1;
			p[u] = Double.MAX_VALUE ; // ∞
			vs[u+1] = u; // Heap indireto a ser construído
		}
		
		p[s] = 0;
		
		heap = new FPHeapMin(p, vs);
		heap.constroi();
		while(!heap.vazio()) {
			int u = heap.retiraMin();
			if(!this.grafo.listaAdjVazia(u)){
				Grafo.Aresta adj = grafo.primeiroListaAdj(u);
				while(adj != null){
					int v = adj.v2();
					if(this.p[v] > (this.p[u] + adj.peso())){
						antecessor[v] = u;
						heap.diminuiChave(v, this.p[u] + adj.peso());
					}
					adj = grafo.proxAdj(u);
				}
			}
		}
	}
	
	public int antecessor (int u){
		return this.antecessor[u];
	}
	
	public double peso (int u) {
		return this.p[u];
	}
	
	public void imprimeCaminho (int origem, int v) {
	
		if (origem == v) {
			System.out.println(origem);
		}
		else if (this.antecessor[v] == -1)
			System.out. println ("Nao existe caminho de " +origem+ " ate " +v);
			else {
				imprimeCaminho (origem, this.antecessor[v]) ;
				System.out.println (v +" ("+this.peso(v)+")");
			}
	}
	
	public void imprimeCaminhoCompleto() {
		
		System.out.println("---------------------");
		System.out.println("Algoritmo Dijkstra implementado com Heap");
		for(int i=0; i< this.p.length; i++) {
			System.out.println("d["+ i +"] = "+ p[i]);
		}
		System.out.println("");
		
	}



}
