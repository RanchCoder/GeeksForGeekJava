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

public class DijkstraOwnWay {
    
    
    public static void dijkstra(int[][] adjMatrix){
    
        int v = adjMatrix.length;
        int[] distance = new int[v];
        boolean[] visited = new boolean[v];
        
        distance[0] = 0;
        
        for(int i = 1 ; i < v; i++){
        
            distance[i] = Integer.MAX_VALUE;
        
        }
        
        for(int i = 0; i < v - 1 ; i++){
        
            int minVertex = findMinVertex(distance , visited);
            visited[minVertex] = true;
            
            for(int j = 0 ; j < v  ; j++){
            
                if(adjMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                
                    int newDist = distance[minVertex] + adjMatrix[minVertex][j];
                    if(newDist < distance[j]){
                    
                        distance[j] = newDist;
                    }
                
                    
                
                }
            
            
            }
        
        }
        for(int i = 0 ; i  < v ; i++){
        
            System.out.println("vertex :: "+ i + "  distance :: "+distance[i]);
        
        }
        
    
    }
    
    public static int findMinVertex(int[] distance, boolean[] visited){
    
        int minVertex = -1;
        
        for(int i = 0 ; i < distance.length ; i++){
        
            if(!visited[i] &&(minVertex == -1 || distance[i] < distance[minVertex])){
            
                minVertex = i;
            
            
            }
        
        }
    
        return minVertex;
    
    
    }

    public static void main(String[] args){
    
        
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        
        int[][] adjMatrix = new int[vertices][vertices];
        for(int i = 0 ; i < edges ; i++){
        
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        
        }
        
        dijkstra(adjMatrix);
        
        
    
    
    }
    
}
