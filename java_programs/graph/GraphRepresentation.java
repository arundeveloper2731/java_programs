package graph;

import java.util.ArrayList;
import java.util.Scanner;




public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter nuber of vertices: ");
        int vertices = sc.nextInt();
        
        System.out.println("Enter number of edges");
        int edges = sc.nextInt();
        
        int[][] matrix = new int[vertices][vertices];
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        
        System.out.println("enter edges");
        
        for (int i = 0; i < edges; i++) {
            
            int u=sc.nextInt();
            int v=sc.nextInt();
            
            matrix[u][v] =1;
            matrix[v][u]=1;
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        System.out.println("\n Adjacency Matrix");
        
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nAjacency List");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i+" -> ");
            for(int neighbor:adjList.get(i)){
                System.out.print(neighbor+ " ");
            }
            System.out.println();
        }
    }

}