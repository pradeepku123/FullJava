package com.javaEnhancement;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoLambdaExpresion {
	public static void main(String[] args) {
		Predicate<Integer> p=I-> I%2==0;
		Predicate<Integer> pp=I-> I%4==0;
		System.out.println(p.test(10));
		System.out.println(p.test(21));
		System.out.println(p.or(pp).test(10));
		System.out.println(p.and(pp).test(40));
		System.out.println(p.negate().test(10));
		
		
		Consumer<String> c= S->System.out.println(S.length()); // andThen(1 ,2 )  & Compose (2, 1)
 		c.accept("Pradeep");
		
		Function<String,String> f=s->{
			String Temp="";
			for(int i=s.length()-1;i>=0;i--) {
				
				Temp+=s.charAt(i);
				
			}
			return Temp;
			
		};
		System.out.println(f.apply("Pradeep"));
	}

}
