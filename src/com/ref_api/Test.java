package com.ref_api;

class Simple{}    

public class Test{    
 public static void main(String args[]) throws Exception {    
  Class c=Class.forName("Simple");    
  System.out.println(c.getName());    
 }    
}  
