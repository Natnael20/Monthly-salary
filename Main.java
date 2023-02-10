package monthlySalary;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 

		int userInput; 
		int userput;
		int upupman=0; 
		int downdownman=0;
		int upupkvinna=0;
		int downdownkvinna=0;
		char next; // loop variabel

			do{

   				System.out.println("kön/lån                                      man                        kvinna");
    				System.out.println("minst 20000                                  "+  upupman  + "                            " + upupkvinna);
    				System.out.println("mindre än 20000                              " + downdownman + "                            " + downdownkvinna);


				System.out.println("antal lön för man");
				userInput = input.nextInt();
				System.out.println("antal lön för kvinna");
				userput = input.nextInt();

				if(userInput >= 20000) {upupman = upupman+1;
  				     System.out.println("antal lön: " + upupman);
				  }
				
				else{ downdownman = downdownman+1;
   				     System.out.println("antal lön: " + downdownman);
				  }

				if(userput >= 20000) {upupkvinna = upupkvinna+1;
    				     System.out.println("antal lön: " + upupkvinna);
				  }
				
				else{downdownkvinna = downdownkvinna+1;
    				     System.out.println("antal lön: " + downdownkvinna);
				  }

					System.out.println("En beräkning till? (y/n)");   
					next = input.next().charAt(0);

 			 } 

      				while (next == 'y'); // Om svaret är y, kör igen

      			        System.out.print("Hej då"); //annars, gå ut

	}

}
