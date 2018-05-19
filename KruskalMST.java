package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Noah Tyler
 * CSC 406.02 - Assignment 3
 */
public class KruskalMST{

    private PriorityQueue<Edge> queue = new PriorityQueue<>();
    private LinkedList<Edge> outputList = new LinkedList<>();
    private final PrintWriter writer;
    private int totalNodes, totalWeight;
    
    public KruskalMST (File inputFile) throws FileNotFoundException {
        findMST(inputFile);  
        writer = new PrintWriter("testUF-Output.txt");
        writer.write(toString());
        writer.flush();
        writer.close();
    }
    
    private void initializeHeap(File dataFile) throws FileNotFoundException{
        Scanner sc = new Scanner(dataFile);
        while (sc.findInLine("c ") != null)
            sc.nextLine(); // skip comment lines
        totalNodes = sc.nextInt();
        while(sc.hasNextInt())
            queue.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        sc.close();
    }
    
    private void findMST(File dataFile) throws FileNotFoundException {
        initializeHeap(dataFile);
        UnionFind uf = new UnionFind(totalNodes);
        while(outputList.size() < totalNodes - 1){
            Edge curEdge = queue.remove();
            if(uf.union(curEdge.getStartNode(), curEdge.getEndNode()))
            {
                outputList.add(curEdge);
                totalWeight += curEdge.getWeight();
            } 
        }
    }
    
    @Override
    public String toString(){
        return " " + outputList.toString().replaceAll("^\\[|\\]$|,", "") + 
                "MST Weight With "+totalNodes+" Nodes: "+totalWeight;
    }
}
