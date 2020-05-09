package com.Collection;

public class DemolocalStackCheck {
	public static void main(String[] args) {
		LocalStack ls=new LocalStack(15);
		ls.localStackPush("Pradeep");
		ls.localStackPush("kumar");
		System.out.println(ls.localStackPeek());
		ls.localStackPush("behera");
	    System.out.println(ls.localStackPop());
		ls.localStackPush("book");
		ls.dispalyLocalStack();
	}
}
