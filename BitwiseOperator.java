public class BitwiseOperator {

  public static void main(String[] args){
  
    int a= 14, b=5, c=20, d=20;
	
	int x = a & b;
	int y = a | b;
	int z = a ^ b;
	
	c = c >> 1;
	d = d << 1;
	
	System.out.println("bitwise OR: "+ y);	
 	System.out.println("bitwise XOR: "+ z);  
 	System.out.println("right shift (reduce the value to half) "+c);    
	System.out.println("bitwise OR: "+ y);	
 	System.out.println("bitwise XOR: "+ z);  
 	System.out.println("right shift (reduce the value to half) "+c);    
 	System.out.println("left shift ( increase the value to double) "+ d);
  
  }



}