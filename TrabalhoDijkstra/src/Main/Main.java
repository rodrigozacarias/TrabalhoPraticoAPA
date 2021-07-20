package Main;

import DijkstraHeapBinario.DijkstraHeap;
import DijkstraVetor.DijkstraVetor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String file1 = "C:\\Users\\rodri\\OneDrive\\Documentos\\Material de Estudo\\APA\\Instâncias\\check_v5_s1.dat";
		String file2 = "C:\\Users\\rodri\\OneDrive\\Documentos\\Material de Estudo\\APA\\Instâncias\\check_v5_s2.dat";
		
		Arquivo arquivo = new Arquivo(file2);
		
		arquivo.ler();
		
		DijkstraVetor dijkstraVetor = new DijkstraVetor(arquivo.getGrafo());
		
		long inicioVetor = System.currentTimeMillis();
		dijkstraVetor.calculaMenorCaminho(0);
		long fimVetor = System.currentTimeMillis();
		long totalVetor = fimVetor - inicioVetor;
		
		dijkstraVetor.imprimeCaminhoCompleto();
		
		System.out.println("O tempo total de processamento para este algoritmo foi de " + totalVetor + "ms.");
		
		DijkstraHeap dijkstraHeap = new DijkstraHeap(arquivo.getGrafo());

		long inicioHeap = System.currentTimeMillis();
		dijkstraHeap.obterArvoreCMC(0);
		long fimHeap = System.currentTimeMillis();
		long totalHeap = fimHeap - inicioHeap;
		
		dijkstraHeap.imprimeCaminhoCompleto();
		
		System.out.println("O tempo total de processamento para este algoritmo foi de " + totalHeap + "ms.");
		
	}
	

}
