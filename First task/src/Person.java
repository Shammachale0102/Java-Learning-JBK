
public class Person {
     String name;
     int age;

    
    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
   public static void main(String [] agrs) {
	   Person Person1 = new Person("sham", 21);
	   Person Person2 = new Person("rohit", 19);
	   
	   System.out.println(" Person1:name-"+ Person1.name+",age-"+Person1.age);
	   System.out.println(" Person2:name-"+ Person2.name+",age-"+Person2.age);
   }
}