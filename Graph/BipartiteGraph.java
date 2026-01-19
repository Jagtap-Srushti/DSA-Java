package Graph;

import java.util.*;

public class BipartiteGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];

        for (int i = 0; i < col.length; i++) {
            col[i] = -1; // for all node assign no color=-1
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) { // outer for loop is for is graph contain different component
                q.add(i); // if color is not assign to node then assign and add in queue
                col[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) { // if color is not assign to neighbor then assign opposite color of the
                                                 // current node
                            col[e.dest] = col[curr] == 0 ? 1 : 0;
                            q.add(e.dest);
                        } else if (col[curr] == col[e.dest]) { // if the color of current node and neighbor is same then
                                                               // not bipartite
                            return false;
                        }
                    }

                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        /*
         * 0-------1
         * | |
         * | 4
         * | |
         * 2-------3
         */

        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }

}
