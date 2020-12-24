import java.util.Scanner;
public class Question92{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

// Write code below
char k[]=input.toCharArray(); 
int outflag=0; 
double knce=0.0,lifeline=0.0;
String o1="" ,o2=""; 
double nce=0.0;

for(int i=0; i<k.length; i++)
	k[i]=gui_map(k[i]);

outerloop:
	for (int i=0; i<k.length; i++)
	{
  		int r=0;
  		if(k[i]=='+'||k[i]=='-'||k[i]=='/'||k[i]=='X'||k[i]=='=')
  		{
   		 for (int j=0; j<i; j++)
      		o1+=Character.toString(k[j]);
    		knce=Double.parseDouble(o1);
    	 for(int t=i+1; t<k.length; t++)
    	{
      	   if(k[t]=='=')
      		{
        	outflag=1;
        	lifeline=Double.parseDouble(o2);
        	if(k[i]=='+')
        		nce=knce+lifeline;
        	else if(k[i]=='-')
       		  nce=knce-lifeline;
       	    else if(k[i]=='/')
         	 nce=knce/lifeline;
        	else if(k[i]=='X')
         	 nce=knce*lifeline;
        	break outerloop;
      }
      else
        o2+=Character.toString(k[t]);
    }
 }
 else if(k[i]=='R'||k[i]=='S'||k[i]=='F')
 {
   for (int j=0;j<i;j++)
     o1+=Character.toString(k[j]);
     knce=Double.parseDouble(o1);
   		if(k[i]=='R')
          System.out.print(Math.sqrt(knce));
   		else if(k[i]=='S')
          System.out.print(knce*knce);
        else if(k[i]=='F')
          System.out.print(1/knce);
    }
}
	if(outflag==1)
      System.out.print(nce);
  }// The main() method ends here.
	
// A method that takes a character as input and returns the corresponding GUI character
	static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','R'}
					,{'b','0'}
					,{'c','.'}
					,{'d','='}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','+'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','-'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','*'}
					,{'q','S'}
					,{'r','F'}
					,{'s','C'}
					,{'t','/'}};
				     /* R = Square root
					C = Clear/Restart
					F = Fraction
					S = Square
					*/
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}

