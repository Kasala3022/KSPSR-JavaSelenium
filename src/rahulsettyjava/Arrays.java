package rahulsettyjava;

public class Arrays {

	public static void main(String[] args) {

		// a container which stores multiple values same data type

		int a[] = new int[5];// Declares a array and allocate memory for the values

		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;// initilased values into that array

		int b[] = { 1, 2, 3, 4, 5, 6 };
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]);//retrive the values
		 * present in this array
		 * 
		 * 
		 * 
		 * }
		 */

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);// retrive the values present in this array

		}

	}

}
