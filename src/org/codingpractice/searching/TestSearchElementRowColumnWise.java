package org.codingpractice.searching;

public class TestSearchElementRowColumnWise {
   /**
    * every row and column is sorted in increasing order
    * mat[4][4] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
              x = 29
              
              Let x = element we’re trying to search for in the matrix,
….e = current element we’re processing in the array.

1) Start with top right element.
2) Loop: compare this element e with x
…i) if e = x, then return position of e, since we found x in the given matrix.
…ii) if e > x then move left to check elements smaller than e 
(if out of bound of matrix, then break and return false)
…iii) if e < x then move below to check elements greater than
 e (if out of bound of matrix, then break and return false)
3) repeat the i), ii) and iii) until you find the element or return false
    */

	
	private static void search(int[][] mat, int n, int x) {
		
		int i = 0;
		int j = n - 1;// set indexes for top right 
		
		while(i < n && j >=0) {
			
			if(mat[i][j] == x) {
				  System.out.print("n Found at " + i + " " + j); 
	                return; 
			}
			
			if( x<mat[i][j] ) {
				j--;
			}
			else {  // if mat[i][j] < x 
				i++;
			}
			
		}
		
		System.out.print("n Element not found"); 
        return; // if ( i==n || j== -1 ) 		
	}
	
	
	// driver program to test above function 
	public static void main(String args[]) {
		 int mat[][] = { { 10, 20, 30, 40 }, 
                 { 15, 25, 35, 45 }, 
                 { 27, 29, 37, 48 }, 
                 { 32, 33, 39, 50 } }; 
		 
		 search(mat, 4, 29);
		
	}
	
	   
	
	
}
