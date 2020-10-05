class School { 
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
class Student { 
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question21{ 
    public static void main(String args[]){
Student s = new Student();
School s2 = new School();
s.print();
s2.print();
     } 
}
