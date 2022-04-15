package Patterns;

public class PatternTest {
	
	public static void stars(int outer, int inner) {
		for(int j=0; j<outer; j++) {			
			for(int i=0; i<inner; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starsRightHalfPyramid(int num) {
		for(int i=0; i<=num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void charsRightHalfPyramid(String str, int num) {		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
	
	//method 1
	public static void invertedStarsRightHalfPyramid(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//method 2
	public static void invertedStarsRightHalfPyramidM(int num) {
		for(int i=num; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftHalfPyramid(int rows) {
		
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=rows; j++) {
				if((j+i)<=rows) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void spacedPyramid(int rows) {
		for(int i=0; i<rows; i++) {
			for(int space=0; space<(rows-i); space++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void unspacedPuramid(int rows) {
		for(int i=0; i<rows; i++) {
			for(int space=0; space<(rows-i); space++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedPyramid(int rows) {
		for(int i=rows; i>=0; i--) {
			for(int space=0; space<rows-i; space++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		invertedPyramid(5);
		//unspacedPuramid(10);
		//spacedPyramid(5);
		//leftHalfPyramid(5);
		//invertedStarsRightHalfPyramidM(10);
		//invertedStarsRightHalfPyramid(5);
		//charsRightHalfPyramid("proggramming", 5);
		//starsRightHalfPyramid(5);
		//stars(10, 6);
								
				
	}

}
