package algorithms;

import java.util.Arrays;

/**
 * @author Noah Tyler
 */
public class UnionFind {
   
    private int[] setArray;
    
    public UnionFind(int totalNodes){
        setArray = new int[totalNodes+1];
        Arrays.fill(setArray, -1);
    }
    
    public int find(int node){
        if(setArray[node] < 0)
            return node;
        else{
            setArray[node] = find(setArray[node]);
            return setArray[node];
        }
    }
    
    public boolean union(int node1, int node2){
        int parentNode1 = find(node1);
        int parentNode2 = find(node2);
        
        if(parentNode1 != parentNode2){
            if(setArray[parentNode1] < setArray[parentNode2]){
                setArray[parentNode1] = setArray[parentNode1] + setArray[parentNode2];
                setArray[parentNode2] = parentNode1;
            }
            else{
                setArray[parentNode2] = setArray[parentNode1] + setArray[parentNode2];
                setArray[parentNode1] = parentNode2;
            }
            return true;
        }
        return false;
    } 
    
    public int[] getArray(){
        return setArray;
    }
}