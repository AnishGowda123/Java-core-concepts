public class prg5 {
	public static void main(String[] args) {
		 int col =5;
			int row =5;
			char ch='E';
			
			for (int i = 0; i <row; i++) {

				for (int j = 0; j < col; j++)
				{
					 if (i>=j) {
						System.out.print(ch);
				}
				else {
						 System.out.print(" ");
					 }	
			}
				System.out.println();
				ch--;
	}
	}
}