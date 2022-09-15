import java.util.Scanner;

public class individual {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rand = (int) (Math.random()*100);
		System.out.println("Your number is " + rand);
		System.out.println("Choose left /");
		String temp = scan.nextLine();
		if(temp.equals("left")) {
			rand--;
			System.out.println(rand);
		}else {
			System.out.println("Invalid Input");
		}
		scan.close();
	}

}
