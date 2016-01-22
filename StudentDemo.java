class Student {

   int id;
   String name;
   String phone; 
   
   public void display(int id, String name, String phone){
	   
	  String className ="java"; 
      System.out.println("Student details: " +id +" " +name+" "+phone + " in " + className);   
   }

}

public class StudentDemo {
	
	

   public static void main(String[] args){
       
	    mtd1();
   
   }
   
   static void mtd1(){
	   
	    Student std ;
		std =  new Student();
		std.display(10, "Siva", "2121212121");
		std.display(11, "Vishnu", "as121212121");*/
	   
   }

}