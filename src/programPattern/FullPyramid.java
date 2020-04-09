package programPattern;

public class FullPyramid {
	public static void main(String[] args) {
		int x=5;
		for(int i=0;i<=5;i++) {
		  for(int j=x;j>0;j--) {
			  System.out.print(" ");
		  }
		  x--;
		  for(int j=0;j<=i;j++) {
			  System.out.print("* ");
		  }
		  System.out.print("\n");
		}
		//System.out.println("-----------------------");
		x=1;
		for(int i=5;i>=0;i--) {
			for(int j=x;j>0;j--) {
				  if(j==1)
					  continue;
				  System.out.print(" ");
			  }
			  x++;
			  for(int j=0;j<=i;j++) {
				  System.out.print("* ");
			  }
			  System.out.print("\n");
		}
		x=9;
		for(int i=0;i<=9;i++) {
		  if(i%2!=0)
		  for(int j=x;j>0;j--) {
			
			  System.out.print(" ");
		  }
		  x--;
		  if(i%2!=0)
		  for(int j=1;j<=i;j++) {
			  System.out.print(i+" ");
		  }
		  System.out.print("\n");
		}
	}

}
