/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell

*/

import java.util.*;
import java.io.*;

public class ArbazSolution {


     public static void main(String[] args) throws IOException{
     
         
         HashMap<String , ArrayList<String>> hts = new HashMap<String , ArrayList<String>>();
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         // adding elements to the list , depends upon how many records you have
         
         // suppose you have 2 records  i.e 2 rows * 2 coloumns
         // like city , user
         
         for(int i = 0 ; i < 5 ; i++){      //put the greater to i index equal to number of records you want to enter ;
          
             // every new city name or if existing then we will update in the code below
              System.out.println("\nEnter the city name :: \n");
              String city = br.readLine();
              String lst = "";
              ArrayList<String> names = new ArrayList<>();
             //for(int j = 0 ; j < 2 ; j++){ // for records 
                    lst = "";
                    System.out.println("\nEnter the names to insert in the city");
                    lst = br.readLine();
                   
                   names.add(lst);  // we will add the name in the list here
             
            // }
             
             // now after 2 names entered we will append the city , Arraylist of names to hashMap  
         
             // now to check if the key city exists in the table or not
             
             if(hts.containsKey(city)){
             
                 hts.get(city).add(lst);
             
             }
             // if not existing then we add the new record to the hashmap
             else{
                 
                 hts.put(city, names);
             
             
             }
             
         }
         
         
         
         //printing the values in the hashtable
         System.out.println("CiTY   ::   Values");
         for(Map.Entry m : hts.entrySet()){
         
         
             System.out.print(m.getKey()+ "  " +m.getValue() + "\n");
         
         }
     
     
     }
    
}
