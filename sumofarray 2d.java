package sumarray;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] num=new int[2][3];
		int sum=0;
		System.out.println("please enter any numbers= ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				num[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum=sum+num[i][j];
			}
		}
		System.out.println("The Sum is= "+sum);
		
	}
}