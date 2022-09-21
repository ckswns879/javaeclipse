package edu;
//import java.util.Scanner;
public class TestA3 {

	public static void main(String[] args) {
		int[][]a = new int[2][3];
		int[][]b = new int[2][3];
		int[][]c = new int[2][3];
		
		
		for(int i = 0; i<a.length;i++) {
		for(int j = 0; j< a[i].length; j++) {
				double d = Math.random();
				int n = (int)(d*10);	
				a[i][j] = n;
				
				double dd = Math.random();
				int nn = (int)(dd*10);
				b[i][j] = nn; 
				}
		}
		
		for(int i = 0; i < a.length; i++) {
		for(int j = 0; j<a[i].length; j++) {
			
			c[i][j] = a[i][j]+b[i][j];
				}
					
		} 	
				
		for(int i = 0; i < a.length; i++) {
		for(int j = 0; j<a[i].length; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
						}
				System.out.println("\n");
				} 	
		}
}