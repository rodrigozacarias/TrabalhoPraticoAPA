package Main;

import DijkstraHeapBinario.DijkstraHeap;
import DijkstraVetor.DijkstraVetor;

public class Main {

	private static String test_set1file1 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v100_s1.dat";
	private static String test_set1file2 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v200_s1.dat";
	private static String test_set1file3 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v300_s1.dat";
	private static String test_set1file4 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v400_s1.dat";
	private static String test_set1file5 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v500_s1.dat";
	private static String test_set1file6 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v600_s1.dat";
	private static String test_set1file7 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v700_s1.dat";
	private static String test_set1file8 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v800_s1.dat";
	private static String test_set1file9 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v900_s1.dat";
	private static String test_set1file10 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set1\\inst_v1000_s1.dat";
	
	private static String test_set2file1 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v100_s2.dat";
	private static String test_set2file2 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v200_s2.dat";
	private static String test_set2file3 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v300_s2.dat";
	private static String test_set2file4 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v400_s2.dat";
	private static String test_set2file5 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v500_s2.dat";
	private static String test_set2file6 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v600_s2.dat";
	private static String test_set2file7 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v700_s2.dat";
	private static String test_set2file8 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v800_s2.dat";
	private static String test_set2file9 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v900_s2.dat";
	private static String test_set2file10 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\test_set2\\inst_v1000_s2.dat";
	
	private static String ALUEfile1 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue2087.stp";
	private static String ALUEfile2 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue2105.stp";
	private static String ALUEfile3 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue3146.stp";
	private static String ALUEfile4 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue5067.stp";
	private static String ALUEfile5 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue5345.stp";
	private static String ALUEfile6 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue5623.stp";
	private static String ALUEfile7 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue5901.stp";
	private static String ALUEfile8 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue6179.stp";
	private static String ALUEfile9 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue6457.stp";
	private static String ALUEfile10 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue6735.stp";		
	private static String ALUEfile11 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue6951.stp";
	private static String ALUEfile12 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue7065.stp";
	private static String ALUEfile13 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue7066.stp";
	private static String ALUEfile14 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue7080.stp";
	private static String ALUEfile15 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUE\\alue7229.stp";
	
	private static String ALUTfile1 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut0787.stp";
	private static String ALUTfile2 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut0805.stp";
	private static String ALUTfile3 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut1181.stp";
	private static String ALUTfile4 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut2010.stp";
	private static String ALUTfile5 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut2288.stp";
	private static String ALUTfile6 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut2566.stp";
	private static String ALUTfile7 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut2610.stp";
	private static String ALUTfile8 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut2625.stp";
	private static String ALUTfile9 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\ALUT\\alut2764.stp";
	
	private static String DMXAfile1 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa0296.stp";
	private static String DMXAfile2 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa0368.stp";
	private static String DMXAfile3 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa0454.stp";
	private static String DMXAfile4 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa0628.stp";
	private static String DMXAfile5 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa0734.stp";
	private static String DMXAfile6 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa0848.stp";
	private static String DMXAfile7 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1010.stp";
	private static String DMXAfile8 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1109.stp";
	private static String DMXAfile9 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1200.stp";
	private static String DMXAfile10 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1304.stp";
	private static String DMXAfile11 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1516.stp";
	private static String DMXAfile12 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1721.stp";
	private static String DMXAfile13 = "C:\\Users\\alralves\\Google Drive\\UNIRIO\\AULAS\\APA - Análise e Projeto de Algoritmos (APA)\\TRABALHO APA 01\\APA_TRABALHO_PRÁTICO\\INSTANCIAS\\DMXA\\dmxa1801.stp";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		
		Arquivo arquivo = new Arquivo(DMXAfile13);		
		arquivo.ler();
			
		DijkstraVetor dijkstraVetor = new DijkstraVetor();
		
		long inicioVetor = System.currentTimeMillis();		
		dijkstraVetor.dijkstra(arquivo.getGrafo(),0);
		long fimVetor = System.currentTimeMillis();
		long totalVetor = fimVetor - inicioVetor;
		
		System.out.println("O tempo total de processamento dos VETORES para este algoritmo foi de " + totalVetor + "ms.");
		
		Grafo grafo = arquivo.getGrafo();		
		DijkstraHeap dijkstraHeap = new DijkstraHeap(arquivo.getGrafo());
		long inicioHeap = System.currentTimeMillis();
		dijkstraHeap.Dijkstra(grafo, 0);
		long fimHeap = System.currentTimeMillis();
		long totalHeap = fimHeap - inicioHeap;
	
		System.out.println("O tempo total de processamento DO HEAP para este algoritmo foi de " + totalHeap + "ms.");		
	}
	
	
	

}
