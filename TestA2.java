package edu;
//import java.util.Scanner;
public class TestA2 {

	public static void main(String[] args) {
		int[][]a= new int[2][3];
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		
		
		for(int i = 0; i < a.length;i++) {
			for (int j= 0; j < a[i].length ; j++) {
				double d = Math.random();
				int n = (int)(d*10);
				a[i][j] = n;
				
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
			
		}
		
	}

}
