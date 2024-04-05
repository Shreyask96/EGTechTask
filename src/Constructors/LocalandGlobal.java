package Constructors;

public class LocalandGlobal {
	private int x=2;
	private static int y=3;
	
	public static void main(String[] args) {
			
	//	System.out.println(y);
	//	System.out.println(x);   //compilation error as we cannotb access non static memeber in static context
		
 	//	System.out.println(LocalandGlobal.y);  
 		                   //object creation is happening her
 		
 		//other way of object creation is
 		LocalandGlobal global=new LocalandGlobal();
// 		System.out.println(global.x);
// 		global.x=13;
// 		System.out.println(global.x);
 		
 		LocalandGlobal global1=new LocalandGlobal();
// 		System.out.println(global1.x);
// 		
// 		System.out.println(global.y);
// 		global.y=50;               // modifying y
// 		System.out.println(global.y);   
// 		System.err.println(global1.y);
 		
// 		x=2  y=3
 		//for non-static
 		System.out.println(++global.x);      //doesn't increment in non static
 		System.out.println(++global1.x);
 		
 		//static
 		System.out.println(++global.y);      //gets increment in static 
 		System.out.println(++global1.y);
	}

}
