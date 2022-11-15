package Recursion;

public class Recursion {

	public static void main(String[] args) {
		
		factorialTest fact=new factorialTest();
		int num=5;
		long factans=fact.findFactorial(num);
		System.out.println("Factorial num is :"+num+"  Ans is:- "+factans);
		

	}

}
class factorialTest{
	long findFactorial(int num) {
	long  factorial=1;
	while(num > 0) {
		factorial =factorial*num;
		num--;
	}
	return factorial;
}
}
