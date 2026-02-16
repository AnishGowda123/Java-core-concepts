public class prm10 {
 
	
	public static void main(String[] args) {
		 int col =5;
			int row =5;
			
			for (int i = 0; i <row; i++) {
				char ch=(char)('E'-i);


				for (int j = 0; j < col; j++)
				{
					 if (i>=j) {
						 
						System.out.print(ch++ +" ");
				}
				else {
						 System.out.print(" ");
					 }
			}
				System.out.println();
				ch++;
				

	}
	}



}

