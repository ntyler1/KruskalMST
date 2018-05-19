package algorithms;

/**
 *@author Noah Tyler
 */

public class Edge implements Comparable<Edge> {
    
    private final int node1, node2, weight;
    
    public Edge(int node1 , int node2 , int weight){
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
    }
    
    public int getStartNode(){
        return node1;
    }
    
    public int getEndNode(){
        return node2;
    }
    
    public int getWeight(){
        return weight;
    }
    
    @Override
    public String toString(){
        return node1+" --("+weight+")--> "+node2+"\r\n";
    }

    @Override
    public int compareTo(Edge e) {
        return weight < e.getWeight() ? -1 : weight > e.getWeight() ? 1 : 0; 
    }
}
