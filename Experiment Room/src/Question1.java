class Question1 extends Thread {

 public static void main(String [] args) {
	 Question1 t = new Question1();
 t.start();
 System.out.print("one. ");
 t.start();
 System.out.print("two. ");
 }

 public void run() {
 System.out.print("Thread ");
 }
 }