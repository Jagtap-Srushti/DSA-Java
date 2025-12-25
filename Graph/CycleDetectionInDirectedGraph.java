package Graph;
import java.util.*;
public class CycleDetectionInDirectedGraph {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public static void connectGraph(ArrayList<Edge> graph[]){  //create a graph
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }

    public static boolean isCycle(ArrayList<Edge> graph[]){

        boolean vis[]=new boolean[graph.length]; // visited array
        boolean stack[]=new boolean[graph.length];// recursion stack
        // Check cycle for every component
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true; //cycle found
                }
            }
        }
        return false; // no cycle
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true; // mark current node visited
        stack[curr]=true; // add to recursion stack

        for(int i=0;i<graph[curr].size();i++){  // Visit all neighbors
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){                  // If neighbor is already in recursion stack → cycle
                return true;
            }
            else if(!vis[e.dest]){              // If neighbor not visited, recurse
                if(isCycleUtil(graph, e.dest, vis, stack)){
                    return true;
                }
            } 
        }
        //Backtracking: remove current node from recursion stack
        stack[curr]=false;
        return false;


    }
       
    public static void main(String[] args) {
        /*
        1-------->0
                  |\
                  | \
                  |  3
                  | /
                  |/
                  2


                    */

        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v] ;
        connectGraph(graph);

        System.out.println(isCycle(graph)); //true
    }    
    
}
