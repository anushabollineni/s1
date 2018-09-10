import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  String input = "aabbcc"; 
  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result));
	}
}
