import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;

/**
 * 
 * CLASS THAT CREATES A GRAPHMAP, LOADS IN CSV, PARSES IT TO ITS RESPECTIVE PARAMETERS
 *
 */
public class GraphMap {
	//define parameters here
	public ArrayList<Vertice> V;
	public ArrayList<Edge> E;
	
	//define constructors here
	public GraphMap() {
		this.loadGraph();
	}
	
	//define methods here
	public void loadGraph() {
		//implement csv reader...
		System.out.println("Loading GraphMap...");
		try {
			CSVReader reader = new CSVReader(new FileReader("yourfile.csv")); //CHANGE TO NAME OF CSV (IN RESOURCES)
		    String [] nextLine;
		    while ((nextLine = reader.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		    	// System.out.println(nextLine[0] + nextLine[1] + "etc...");
		    }
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage() + "\n"); //WILL PRINT ERROR IF TROUBLE READING CSV...
		}
	}
	
	//define inner classes here
	class Vertice {
		//vertice of a map piece
	}
	class Edge {
		//edge of map pieces
	}
}
