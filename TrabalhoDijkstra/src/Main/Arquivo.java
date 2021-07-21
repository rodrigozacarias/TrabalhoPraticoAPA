package Main;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

public class Arquivo {
	
	private Grafo grafo;
	private String inFile;
	
	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public String getInFile() {
		return inFile;
	}

	public void setInFile(String inFile) {
		this.inFile = inFile;
	}


	int interacao = 0;
	int InbNodes = 0;
	
	public Boolean End(String line) { return line.trim().replace("\t\t", "").equalsIgnoreCase("END");}
		
	public Boolean Header(String line) {
		return line.trim().contains("NB_NODES") ||
			line.trim().contains("NB_ARCS") || 
			 line.trim().contains("LIST_OF_ARCS") ||
			 line.trim().contains("Section Graph");
	}
	
	public Boolean EDGESALUE(String line) {
		return line.trim().contains("Edges");
	}
	
	public Boolean ENDALUE(String line) {
		return line.trim().contains("End");
	}
	
	public Boolean NODESALUE(String line) {
		return line.trim().contains("Nodes");
	}
	
	public Boolean INFO(String line) {
		return line.trim().contains("STP File, STP Format Version  1.00") ||
			 line.trim().contains("Section Comment") ||
			 line.trim().contains("Name") ||
			 line.trim().contains("Creator") ||
			 line.trim().contains("Remark") ||
			 line.trim() == "" ||
			 line.trim().contains("Section Graph")||
			 line.trim().contains("Nodes");
	}
		
    public Arquivo(String inFile) {
    	this.inFile = inFile;
    }
       
    public void ler() throws Exception{
    	try{    		
        
    		RandomAccessFile file = new RandomAccessFile(inFile, "rw");
            String tmp = file.readLine();
            boolean endinfo = false;
            while(tmp != null ){
        	    if(!INFO(tmp)) {
        	    	if(End(tmp)&&endinfo==false) 
        	    	{ 
        	    		endinfo = true; 
        	    	}
        	    	else
        	    	{
	        	    	if(EDGESALUE(tmp)) 
	                	{
	                        InbNodes = Integer.parseInt(tmp.split(" ")[1]);
	                        setGrafo(new Grafo(InbNodes));
	            		}
	        	    	else 
	        	    	{ 
		        	    	if(End(tmp)&&endinfo) {break;} 
		                    StringTokenizer sT = new StringTokenizer(tmp); 
		                    while(sT.hasMoreTokens())
		                    {                    	
		                	    sT.nextToken();
		                    	int origem = Integer.parseInt(sT.nextToken());
		                    	int destino = Integer.parseInt(sT.nextToken()); 
		                    	int peso = Integer.parseInt(sT.nextToken());
		                    	grafo.insereAresta(origem, destino, peso);                	
		                    }
	        	    	}
        	    	}
         	    }
                tmp = file.readLine();
            }
            
            file.close();
        }
        catch( IOException io ){ 
        	System.err.println( io.toString() ); 
        	System.exit( interacao ); 
        }
        catch( RuntimeException re ){ 
        	System.err.println( re.toString() ); 
        	System.exit( interacao ); 
        }
    }
    
    public void lerTestSet() throws Exception{
    	try{
            
    		RandomAccessFile file = new RandomAccessFile( inFile, "rw" );
            
            String tmp = file.readLine(); 
            
            String snbNodes = tmp.split(" \t\t ")[1];
            
            InbNodes = Integer.parseInt(snbNodes);

            setGrafo(new Grafo(InbNodes));

            file.seek(0); 
            tmp = file.readLine();
            while(tmp != null ){
            	if(End(tmp)) {break;}
        	    if(!Header(tmp)) {        	    	
                    StringTokenizer sT = new StringTokenizer( tmp); 
                    while(sT.hasMoreTokens() )
                    {
                    	int origem = Integer.parseInt(sT.nextToken());
                    	int destino = Integer.parseInt(sT.nextToken()); 
                    	int peso = Integer.parseInt(sT.nextToken());
                    	grafo.insereAresta(origem, destino, peso);
                    }
         	    }
                tmp = file.readLine();
            }
            
            file.close();
          
        }
        catch( IOException io ){ 
        	System.err.println( io.toString() ); 
        	System.exit( interacao ); 
        }
        catch( RuntimeException re ){ 
        	System.err.println( re.toString() ); 
        	System.exit( interacao ); 
        }
    }

}
