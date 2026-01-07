package _2_Non_Linear_Data_Structures_Practice;
import java.util.*;

public class _3_Graph {
//    public static void main(String[] args) {
//        int vertex = 4;
//        //====================== 1 =========================
//        //Outer List : it contains all the nodes/vertices from the Graph.
//        //Inner List : it contains all the connection of that specific nodes/vertex with all other nodes/vertex.
//        List<List<Integer>> graph = new ArrayList<>();
//
//        for(int i =0; i< 4; i++)
//        {
//            graph.add(new ArrayList<>());
//        }
//
//        // Here we have that edges that are reversing as well.
//        graph.get(0).add(1);
//
//        graph.get(1).add(0);
//        graph.get(1).add(2);
//        graph.get(1).add(3);
//
//        graph.get(2).add(1);
//        graph.get(3).add(1);
//        System.out.println("Undirected Graph : " + graph);
//
//
//        //======================= 2 ==========================
//        //But now lets say that graph is directed Graph.
//        List<List<Integer>> unidirectionalGraph = new ArrayList<>();
//        for(int i = 0 ; i < 3; i++)
//        {
//            unidirectionalGraph.add(new ArrayList<>());
//        }
//        unidirectionalGraph.get(0).add(1);
//        unidirectionalGraph.get(1).add(2);
//        unidirectionalGraph.get(2).add(0);
//        System.out.println("Directed Graph : " + unidirectionalGraph);
//
//    }

    public static void main(String[] args) {
        int V = 8; // 5 Vertices (0 to 4)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Manual Graph Construction
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 4, 6);
        addEdge(adj, 3, 5);
        addEdge(adj, 5, 7);

//      Graphs UnDirected Graph
//            1 --- 3 --- 5 --- 7
//        0
//            2 --- 4 --- 6


        System.out.println("BFS Traversal starting from 0:");
        bfs(adj, V, 0); // Start walking from Node 0

        System.out.println();
        System.out.println();
        boolean[] visited = new boolean[V]; // The Checklist
        System.out.println("DFS Traversal:");
        dfs(0, visited, adj); // Start the recursion
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int startNode) {
        // 1. The Queue (The Line)
        Queue<Integer> q = new LinkedList<>();

        // 2. The Checklist (Visited Array)
        boolean[] visited = new boolean[V];

        // 3. Start the process
        q.offer(startNode);
        visited[startNode] = true; // Mark 0 as seen!

        while (!q.isEmpty()) {
            // A. Get the person at the front
            int curr = q.poll();
            System.out.print(curr + " ");

            // B. Look at all their friends
            for (int neighbor : adj.get(curr)) {
                // C. Only add them if we haven't seen them before
                if (visited[neighbor] == false) {
                    visited[neighbor] = true; // Mark as seen immediately
                    q.offer(neighbor);        // Add to the line
                }
            }
        }
    }
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        // 1. Mark me as visited immediately
        visited[node] = true;
        System.out.print(node + " ");

        // 2. Visit my neighbors recursively
        for (int neighbor : adj.get(node)) {
            // 3. Only visit if NOT visited (The Dead End Check)
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj); // Recurse! (Go deeper)
            }
        }
    }
}

