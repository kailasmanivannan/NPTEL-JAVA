import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
//Use if...else ladder to find the largest among 3 numbers and store the largest number in a variable called result.
if(x>=y&&x>=z){
	System.out.print(x);
}
else if(y>=z){
	System.out.print(y);
}
else{
	System.out.print(z);
}
 }
}
