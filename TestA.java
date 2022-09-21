package edu;

public class TestA {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for (int i = 2; i<10; i++) {
//			for (int j = 1; j<10; j++) {
//				System.out.println(i + "*"+ j + "=" + (i*j));
//			}
//
//		}
//	}
//
//}
	
	int dan = 1;
	
	for (int i=2; i<10; i+=dan) {
		for (int j=1; j<10; j++) {
			for (int k=0; k< dan; k++) {
				System.out.printf("%d * %d = %d", i+k , j, i*j);
				
				if (k< dan+1)
					System.out.print("\t");
				else
					System.out.print("\n");
			}
		}
		System.out.println("");
	}
	}
}