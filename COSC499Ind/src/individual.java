import java.util.Scanner;

public class individual {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner scans user input
		int rand = (int) (Math.random()*100); //Random number
		System.out.println("Your number is " + rand);
		System.out.println("Choose left");
		String temp = scan.nextLine();
		rand += left(temp);
		System.out.println(rand);
		scan.close();
	}
	
	public static int left(String temp) {
		if(temp.equals("left")){//This if statement checks if the left has been input by the user, to check to add 1
			return 1;
		}else {
			return 0;
		}
	}
}
