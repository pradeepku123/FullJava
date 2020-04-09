package programPattern;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("Invert pyramid");
		for(int i=5;i!=0;i--) {
			for(int j=0;j<i;j++) {
				if((i==4 && j==1)||(i==4 && j==2)||(i==3 && j==1)) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
