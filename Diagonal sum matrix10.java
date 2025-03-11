package array;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] A=new int[3][3];
		int sumofdiagonalElements=0;
		System.out.println("enter row and col elements: ");
		//matrix input
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				A[row][col]=input.nextInt();
		
	}
}
//diagonal
for(int row=0;row<3;row++) {
	for(int col=0;col<3;col++) {
		if(row==col) {
			sumofdiagonalElements=sumofdiagonalElements+A[row][col];
		}
	}
}
System.out.println("SumofDiagonal= "+sumofdiagonalElements);
	}
}