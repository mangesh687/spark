package com.string.method;

public class StringBufferAndBuilder {
public static void main(String[] args) {
long startTime = System.currentTimeMillis();
		
        StringBuffer sb = new StringBuffer("Good");
        
        for(int i=0; i<100000; i++) {
        	sb.append("Morning");
        }
        
        System.out.println("time taken by string buffer: "+(System.currentTimeMillis()-startTime)+"ms");
              
        startTime= System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Good");
        for(int i=0; i<100000; i++) {
        	sb2.append("Morning");
        }       
        System.out.println("time taken by string builder: "+(System.currentTimeMillis()-startTime)+"ms");
        
	}



	}


