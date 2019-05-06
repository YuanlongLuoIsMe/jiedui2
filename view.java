package fail;

import java.util.Random;

public class view {
		
		public static void out(int n,int m,int[] A,int KH,int XS,int OUTP) {
		int[] B = new int[4];
		B[0] = A[0];
		B[1] = A[1];
		B[2] = A[2];
		B[3] = A[3];
		int numOFfunction = 0,t = A[0] + A[1] + A[2] + A[3],l = 0,k = 0,j = 0;
		double x;

		Random number = new Random();    
		Random choose = new Random();    
		Random XSRan = new Random();     
		Random KHRan = new Random();    
		
		for(int i = 0;i < n;i ++) {
			j = t;
			k = 0;
			l = 0;
			numOFfunction = t;
			A[0] = B[0];
			A[1] = B[1];
			A[2] = B[2];
			A[3] = B[3];
			
			if(KH == 1) {
				if (t >= 2 && l == 0 && j > 2) {
					if(KHRan.nextInt(2) == 1) {
						System.out.print("(");
						l++;
					}
				}
			}
			
			if(XS == 1) {        
				x = Math.random() + number.nextInt(m)+.12;
				if(XSRan.nextInt(3) == 0) {
					System.out.printf("%.2f",x);
					if(l != 0) {
						k++;
						j--;
					}
				}
				else {
					System.out.print(number.nextInt(m)+1);
					if(l != 0) {
						k++;
						j--;
					}
				}
			}
			else {
				System.out.print(number.nextInt(m)+1);   
				if(l != 0) {
					k++;
					j--;
				}
			}
			if(k == 2) {
				System.out.print(")");
				k = 0;
				l=0;
			}
				
			while(numOFfunction != 0) {
				
				int ran;
				while(true) {
					ran = choose.nextInt(4);
					if(A[ran] == 1) {
						A[ran] = 0;
						break;
					}
				}
				if(ran == 0) {
					System.out.print("+");
					numOFfunction = numOFfunction - 1;
				}
				else if(ran == 1) {
					System.out.print("-");
					numOFfunction = numOFfunction - 1;
				}
				else if(ran == 2 ) {
					System.out.print("*");
					numOFfunction = numOFfunction - 1;
				}
				else if(ran == 3) {
					System.out.print("/");
					numOFfunction = numOFfunction - 1;
				}
				
				if(KH == 1) {
					if (t >= 2 && l ==0 && j > 2) {
						if(KHRan.nextInt(2) == 1) {
							System.out.print("(");
							l++;
						}
					}
				}
				
				if(XS == 1) {
					x = Math.random() + number.nextInt(m)+.12;
					if(XSRan.nextInt(3) == 0) {
						System.out.printf("%.2f",x);
						if(l != 0) {
							k++;
							j--;
						}
					}
					else {
						System.out.print(number.nextInt(m)+1);
						if(l != 0) {
							k++;
							j--;
						}
					}
				}
				else {
					System.out.print(number.nextInt(m)+1);
					if(l != 0) {
						k++;
						j--;
					}
				}
				if(k == 2) {
					System.out.print(")");
					k = 0;
					l = 0;
				}
			}
				System.out.println("=");
		}
	}
}

