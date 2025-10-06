package testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Demo {

	@Test
	public void show() {
		System.out.println("This is a Show Method!!");
	}
	
	@Test
	public void add() {
		int a=10;
		int b=56;
		int sum=a+b;
		System.out.println("Sum of the a & b is :" +sum);
	}
}
