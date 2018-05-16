package Lambdas_Java8;

import java.util.Arrays;
import java.util.List;

public class practice {

	static List<String> strings = Arrays.asList("hello","there");
	
	public static void main(String[] args) {
		strings.forEach(s->System.out.println(s));
		System.out.println("---------------------");
		strings.replaceAll(s->s.toUpperCase());
		strings.forEach(s->System.out.println(s));

	}

}
