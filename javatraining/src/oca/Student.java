package oca;

public class Student {
	int rollno;
	String name;
	static String college="TEC";
	Student(int r,String n){
		rollno=r;
		name=n;
   
	}
	
void display() {
	System.out.println(rollno+" "+name+" "+college);
	
}
public static void main(String[] args) {
	Student s1=new Student(591,"madhu");
	Student s2=new Student(580,"ravi");
	s1.display();
	s2.display();
}
}
