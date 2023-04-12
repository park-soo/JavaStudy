package study01;

public class LoopPrac {

	public static void main(String[] args) {
		
		// 4 3 2 1 
		int line =4;
		
		for(int i=0; i<line; i++) {
			for (int j=0; j<line-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 1 2 3 4 
		for(int i=0; i<line; i++) {
			for (int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 4 3 2 1 오른쪽
		int space =0;
		int star=4;
		for(int i=0; i<line; i++) {
			for (int j=0; j<space;j++) {
					System.out.print(" ");
			}
				for(int k=0; k<star; k++) {
					System.out.print("*");					
				}
				space++;
				star--;
				System.out.println("");				
			}
		
		
		// 1 2 3 4 오른쪽
		space =3;
		star=1;
		for(int i=0; i<line; i++) {
			for (int j=0; j<space;j++) {
					System.out.print(" ");
			}
				for(int k=0; k<star; k++) {
					System.out.print("*");					
				}
				space--;
				star++;
				System.out.println("");		
				
		}
		// 산 모양
		space =3;
		star=1;
		for(int i=0; i<line; i++) {
			for (int j=0; j<space;j++) {
					System.out.print(" ");
			}
				for(int k=0; k<star; k++) {
					System.out.print("*");					
				}
				space--;
				star+=2;
				System.out.println("");		
				
		}
		// 다이아 몬드 모양
		line=7;
		space =3;
		star=1;
		for(int i=0; i<line; i++) {
			for (int j=0; j<space;j++) {
					System.out.print(" ");
			}
				for(int k=0; k<star; k++) {
					System.out.print("*");					
				}
				if(i<line/2) {
				space--;
				star +=2;
				} else {
					space++;
					star -=2;
				}
				System.out.println("");		
				
		}
		
		// 1 2 3 4 3 2 1 
		line=7;
		star=1;
		for(int i=0; i<line; i++) {
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
			if(i<line/2) {
			star++;
			} else{ star--;
			}
			System.out.println();
		}
		
		
	}

}
