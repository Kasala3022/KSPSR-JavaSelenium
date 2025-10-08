package rahulsettyjava;

public class InterviewMaxvalueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int abc[][]= {{3,4,5},{2,6,9},{0,1,3},{9,7,6}};
		
		int  min=abc[0][0];
		
	for(int i=0;i<4;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(min<abc[i][j]) {
					
					min=abc[i][j];
				}
				
			}
			
		}
		System.out.println(min);	
	}

}
