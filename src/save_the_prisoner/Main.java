package save_the_prisoner;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int input = scan.nextInt();
		scan.nextLine();
		Vector<String> prisoners = new Vector<String>();
		for (int i = 0; i < input; i++) {
			String prisoner = scan.nextLine();
			prisoners.add(prisoner);
		}
		
		for (int i = 0; i < prisoners.size(); i++) {
			String prisoner = prisoners.get(i);
			int limit = Integer.parseInt(prisoner.split(" ")[0]);
			int row = Integer.parseInt(prisoner.split(" ")[1]);
			int start = Integer.parseInt(prisoner.split(" ")[2]);
			
			int temp = start;
			for (int j = 0; j < row; j++) {
				if (j == row - 1) break; 
				if (temp == limit) temp = 1;
				else temp++;
			}
			System.out.println("| " + temp);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
