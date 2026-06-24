package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class GraphTraversal {
    static ArrayList<ArrayList<Integer>> graph;
    
    //BFS Traversal
    static void bfs(int start,int vertices){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        
        visited[start]= true;
        queue.add(start);
        System.out.println("\n BFS Traversal: ");
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node +" ");
            
            for(int neighbor: graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    //DFS Travesal
    static void dfsTravesal(int node,boolean[] visited ){
        visited[node]=true;
        System.out.print(node+" ");
        
        for(int neighbor:graph.get(node)){
            if(!visited[neighbor]){
                dfsTravesal(neighbor, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter nubbr of vertices ");
        int vertices = sc.nextInt();
        
        System.out.println("Enter number of edges");
        int edges=sc.nextInt();
        
        graph=new ArrayList<>();
        
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println("enter edges");
        
        for (int i = 0; i < edges; i++) {
            
            int u=sc.nextInt();
            int v=sc.nextInt();
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        System.out.println("Enter starting node: ");
        int start = sc.nextInt();
        bfs(start, vertices);
        
        System.out.println("\nDFS Travesal ");
        boolean[] visited=new boolean[vertices];
        
        dfsTravesal(start, visited);
    }

}