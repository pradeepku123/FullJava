package programPattern;

public class StaticControlFlow {
	static int id;//0
	static String name;//null
	
	public StaticControlFlow() {
		id = 40;
		name = "DDD";
	}
	
	
	public StaticControlFlow(String name,int id) {
		this.id = 50;
		this.name = "EEE";
	}
	static {
		//m1();
		
		id = 10; 
		name = "BBB";
		
		System.out.println("SBI: "+id);//10
		System.out.println("SBI: "+name);//BBB
	}
	public static void main(String[] args) {
		StaticControlFlow staricFlow = new StaticControlFlow("AA", 101);
		
		System.out.println(staricFlow.id);//101 // 40
		System.out.println(staricFlow.name);//AA //DDD
		
		System.out.println("---------------");
		
		System.out.println(StaticControlFlow.id);// 101 //40
		System.out.println(StaticControlFlow.name);// AA //DDD

		StaticControlFlow staricFlow1 = new StaticControlFlow();
		System.out.println("---------------");
		System.out.println(staricFlow1.id);//
		System.out.println(staricFlow1.name);//
		
		System.out.println("---------------");
		
		System.out.println(StaticControlFlow.id);//
		System.out.println(StaticControlFlow.name);//
		System.out.println("---------------");
		m1(10);
		
	}
	public static void m1(final int x) {
		id =30;
		name ="CCC";		
		System.out.println(id);//30
		System.out.println(name);//CCC
	}

}
