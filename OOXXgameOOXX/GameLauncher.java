package train;

import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) {
		System.out.println("*****Game Start******");
		TicTacToe t=new TicTacToe();
		
		while(t.isGameStart) {
			System.out.print("Player"+t.who()+"enter your move(row|column): ");
			Scanner scanner=new Scanner(System.in);
			String input=scanner.nextLine();
			t.go(input);
			t.printooxx(); 
		}
		
	}

}
