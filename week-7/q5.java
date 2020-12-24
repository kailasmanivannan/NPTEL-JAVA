import java.util.*;
public class Question5 {  
    public static void main(String[] args) { 
       try{	
	    String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
            char c='a';
	     
StringBuilder str = new StringBuilder(s1);
str.setCharAt(n,c);
System.out.print(str);
}
     catch (Exception e){
          System.out.println("exception occur");
	    }	   
    }  
}  
