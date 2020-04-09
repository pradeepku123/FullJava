package programPattern;

public class StarPatternDemo {
  public static void main(String[] args) {
	int x,y=0;
	  for(int i=1;i<5;i++) {
		  x=y+i;
		  for(int j=0;j<i;j++) {
			  System.out.print(x+" ");
			  x--;
			  y++;
		  }
		  System.out.println("\n");
		
	}
}
}



