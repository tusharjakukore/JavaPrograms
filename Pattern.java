import java.util.*;
class A{
int i = 10;
public void printValue(){
System.out.print("Value-A");
}
}

class B extends A{
int i = 12;
public void printValue(){
System.out.print("Value-B");
}
}
public class Pattern {

	public static void main(String args[]){
		A a = new B();
		a.printValue();
		System.out.print(a.i);
		}
}
