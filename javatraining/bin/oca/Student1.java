package oca;

public class Student1 {
int rollno;
String name;
static String college="TEC";
static void change() {
	college="NEC";
	
}
Student1(int r,String n){
	rollno=r;
	name=n;
}
void display() {
	System.out.println(rollno+" "+name+" "+college);
}
public static void main(String[] args) {
	Student1.change();
	Student1 s1=new Student1(501,"durga");
	Student1 s2=new Student1(591,"madhuri");
	s1.display();
	s2.display();
	
}
}
