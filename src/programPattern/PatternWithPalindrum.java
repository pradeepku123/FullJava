package programPattern;

public  class PatternWithPalindrum {
	static final int a = 20;
	public static void main(String[] args) {
		int x=0;
		for(int i=1;i<6;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			
			x=i;
			while(x!=0) {
				System.out.print(x+" ");
				x--;
			}
			System.out.println("\n");
		}
		
	}
}
