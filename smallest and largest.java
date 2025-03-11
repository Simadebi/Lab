package array;
import java.util.Scanner;
public class MaxiMini {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] A=new int[3][3];
		System.out.println("enter row and colums:");
		//getting user input
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				A[row][col]=input.nextInt();
			}
		}
		int max=A[0][0];
		int mini=A[0][0];
		//printing
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(max<A[row][col]) {
					max=A[row][col];
				}
				if(mini>A[row][col]) {
					mini=A[row][col];
				}
		
	}
}
System.out.println("Maximum= "+max);
System.out.println("Minimum= "+mini);
	}
}
