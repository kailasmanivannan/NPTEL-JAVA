class ThreadRun implements Runnable {
        public void run(){ 
            System.out.print("Thread using Runnable interface."); 
        } 
   }
public class Question62{
public static void main(String[] args){
  ThreadRun obj = new ThreadRun();
  Thread obj2 = new Thread(obj);
  obj2.start();
}
}
