import java.util.Scanner;

 public class Circle extends Point{
	 	  
     public static void main(String[] args) {
    
	 Scanner sc = new Scanner(System.in);
	 Point c=new Point(); //Create a point center
	 c.x=sc.nextDouble();
	 c.y=sc.nextDouble();
	 Point p=new Point();  //Create a point on circumference
	 p.x=sc.nextDouble();
	 p.y=sc.nextDouble(); 
	 Circle c1=new Circle(); //Create an object of class Circle
	 c1.distance(c,p);  //Calcualte radius of the circle
	
  }
 
}

//Complete the code segment to define a class Point with variable x,y and method distance() that calculates the distance between two points.
//Note: Pass objects of type class Point as argument in distance() method. 
class Point{
  public double x,y;
  static void distance(Point a,Point b){
  		double ans;
    	double temp1,temp2;
    temp1=(a.x-b.x);
    temp1=temp1*temp1;
    temp2=(a.y-b.y);
    temp2=temp2*temp2;
    temp1=temp1+temp2;
    temp1=Math.sqrt(temp1);
    System.out.println(temp1);
    //return temp1;
  }
  
}
