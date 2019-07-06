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

public class ExceptionClass {
    
    
    public void run(int value) throws Exception{
    
        
        if(value == 5){
        
            throw new Exception("error the value is 5");
        
        
        }
        
        
    
    
    }
    
    
    public static void main(String[] args){
    
        try{
            
            ExceptionClass c = new ExceptionClass();
            
            c.run(5);
        
        }
        catch(Exception e){
        
            System.out.println(e.getMessage());
        
        }
    
    
    }
    
}
