package rahulsettyjava;

public class Pattern4 {
/*3
  6 9
  12 15 18*/
	public static void main(String[] args) {
		int n=3;
		
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=i;j++) {
				System.out.print(n + " ");
				n+=3;
				}
			
			System.out.println();
		}
	}

}
