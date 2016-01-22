public class StaticMemebersExample {
	
	int a=12;
	static int staticB=10;
	
	 void nonStaticMethod(){
		 System.out.println("inside Non Static method");
     }

	 static void staticMethod(){
		 System.out.println("inside static method");
	 }
	 
    public static void main(String[] args){
		StaticMemebersExample  sme = new StaticMemebersExample();
		sme.a
		
	    System.out.println(sme.a);
		System.out.println(staticB);
		sme.nonStaticMethod();
		staticMethod();
		
	}
	 


}