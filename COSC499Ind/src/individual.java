import java.util.Scanner;

public class individual {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner scans user input
		int rand = (int) (Math.random()*100); //Random number
		System.out.println("Your number is " + rand);
		System.out.println("Choose right or left");
		String temp = scan.nextLine();
		rand += right(temp);
		rand += left(temp);

		System.out.println(rand);
		scan.close();
	}
	
	public static int right(String temp) {
		if(temp.equals("right")){//This if statement checks if the right has been input by the user, to check to add 1
			return 1;
		}else {
			return 0;
	    }
	}
	public static int left(String temp) {
		if(temp.equals("left")){//This if statement checks if the left has been input by the user, to check to decrease by 1
			return -1;
		}else {
			return 0;
		}
	}
}
