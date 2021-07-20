package Main;

import DijkstraHeapBinario.DijkstraHeap;
import DijkstraVetor.DijkstraVetor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String file1 = "C:\\Users\\rodri\\OneDrive\\Documentos\\Material de Estudo\\APA\\Instâncias\\check_v5_s1.dat";
		String file2 = "C:\\Users\\rodri\\OneDrive\\Documentos\\Material de Estudo\\APA\\Instâncias\\check_v5_s2.dat";
		
		Arquivo arquivo = new Arquivo(file1);
		
		arquivo.ler();
		
		DijkstraVetor dijkstraVetor = new DijkstraVetor(arquivo.getGrafo());
		
		dijkstraVetor.calculaMenorCaminho(0);
		
		dijkstraVetor.imprimeCaminhoCompleto();
		
		DijkstraHeap dijkstraHeap = new DijkstraHeap(arquivo.getGrafo());

		dijkstraHeap.obterArvoreCMC(0);
		
		dijkstraHeap.imprimeCaminhoCompleto();
		
	}
	

}
