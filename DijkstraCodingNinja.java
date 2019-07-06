/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

import java.io.*;
import java.util.*;

public class DijkstraCodingNinja {
    
    public static void dijkstra(int[][] adjMatrix){
    
        int v = adjMatrix.length;
        boolean[] visited = new boolean[v];
        int[] distance = new int[v];
        
        distance[0] = 0;
        
        //setting distance of all the vertices to max value.
        for(int i = 1 ; i < v ; i++){
        
            distance[i] = Integer.MAX_VALUE;
            
        }
        
        for(int i = 0 ; i < v - 1 ; i++){
        
            //finding minimum vertex among the set of vertex
            
            int minVertex = findMinVertex(distance , visited);
            
            //setting vertex as visted.
            visited[minVertex] = true;
            
            //exploring a neigbor
            for(int j = 0 ; j < v ; j++){
            
                if(adjMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex]!= Integer.MAX_VALUE){
                
                    int newDist = distance[minVertex] + adjMatrix[minVertex][j];
                
                    if(newDist < distance[j]){
                    
                        distance[j] = newDist;
                    
                    }
                }
            
            
            }
            
            
        
        }
        
        for(int i = 0 ; i < v ; i++){
        
            System.out.println("vertex :" + i +" : Minimum distance " + distance[i]);
        
        }
        
        
    
    
    }
    
    public static int findMinVertex(int[] distance , boolean[] visited){
    
        int minVertex = -1;
        //trying to find a minimum vertex from the graph, and setting it as visited
        for(int i = 0 ; i < distance.length ; i++){
        
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
            
                minVertex = i;
            
            }
            
            
        
        }
    
        return minVertex;
    
    }
    
    
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        //no of vertices
        int vertices = sc.nextInt();
        //no of edges
        int edges  = sc.nextInt();
        
        int[][] adjMatrix = new int[vertices][vertices];
        
        for(int i = 0 ; i < edges ; i++){
        
        
            //the vertices of an edge
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
        
            //the weight of that edge
            int weight = sc.nextInt();
            //since undirected graph will have same weight for both the sides.
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
            
            
        }
        
        dijkstra(adjMatrix);
        
    
    }
}
