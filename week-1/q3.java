import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
int t=1;
for(int i=1;i<n;i++){
  t=i*2;
  if(t%3==0){
  	sum+=t;
  }
}
 System.out.print(sum);
 }
}
