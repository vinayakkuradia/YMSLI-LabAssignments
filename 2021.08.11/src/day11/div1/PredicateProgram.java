package day11.div1;
import java.util.function.Predicate;

public class PredicateProgram {
	public static void main(String[] args) {
		Predicate<Integer> EvenOdd = num->num%2==0;
		System.out.println(EvenOdd.test(6));
		Predicate<Integer> DivByTen = num->num%10==0;
		System.out.println(DivByTen.test(400));
	}
}
