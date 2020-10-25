import java.util.Scanner;
class Question {  //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
  int e1 = sc.nextInt();  //Read e1
  int e2 = sc.nextInt();  //Read e2
 }
public class Question5 {
// Define static method swap()to swap the values of e1 and e2 of class Question.
static void swap(Question obj){
	int a =obj.e1;
  	int b = obj.e2;
  	int temp =a;
    a=b;
  	b=temp;
  	obj.e1=a;
 	obj.e2=b;
   
  
  
}
public static void main(String[] args) {
 //Create an object of class Question
   	Question t = new Question();
  //Call the method swap()
        swap(t);

    System.out.println(t.e1+" "+ t.e2);     
  }
 
}
