package sham ;

 public class HelloWorld{
	 void add(int a, int b) {
         int c = a + b;
         System.out.println("add is="+c);
	 }
	 
	 void sub(int x, int y) {
		int	c = x - y;
		System.out.println("sub is="+c);
		}
	 void mult(int r,int s) {
			int c = r * s;
		System.out.println("mult is="+c);
	 }
	 
	 
		
	public static void main(String[]args) {
		HelloWorld p = new HelloWorld();
		p.add(5, 10);
		p.sub(5,2);
		p.mult(3, 3);
	}
 }
 
 