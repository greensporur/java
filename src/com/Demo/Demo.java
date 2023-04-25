package com.Demo;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		Animal al = new Tiger(); //Up casting
		
		al.eatingHabits();
		al.nature();
		
		
        Tiger ts = (Tiger) al; //Down Casting
        
       
        byte b = 10;
        
        int c = b; //Widening data type
        
        
        long l = 30; 
        
        short s = (short) l; //Narrowing 
        
     
        
		
		
		
		
	}

}
