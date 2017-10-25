package tictactoe;

import java.io.*;

public class TicTacToe {
	private static int spieler;
	public final int n;
	private int[][] spielfeld;


	public TicTacToe(int n){
		spieler=1;
		this.n=n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		int[][] spielfeld;
		BufferedReader size = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of game pattern");
		n = Integer.parseInt(size.readLine());
		spielfeld = new int[n][n];
		TicTacToe game= new TicTacToe(n);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter x coordinate of the next turn");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter y coordinate of the next turn");
		int y = Integer.parseInt(br.readLine());
		
		while(!game.checkWin(spieler)||!game.tie(spielfeld)tie){
			//to do spiel
			
		}

	}

	public static void gamePattern(int[][] spielfeld) {
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				if (spielfeld[i][j] == 0) {
					System.out.print(". ");
				} else if (spielfeld[i][j] == 1) {
					System.out.print("X ");
				} else {
					System.out.print("O ");
				}
				System.out.print("\t" + spielfeld[i][j]);
			}
		}
	}

	private boolean checkWin(int spieler) {
		return (checkZeilen(spieler) | checkSpalten(spieler) | checkDiagonalen(spieler));
	}

	private boolean checkZeilen(int spieler) {
		boolean check = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (spielfeld[i][j] != spieler) {
					break;
				}
				if (i == n - 1) {
					check = true;
				}
			}
		}
		return check;
	}

	private boolean checkSpalten(int spieler) {
		boolean check = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (spielfeld[j][i] != spieler) {
					break;
				}
				if (j == n - 1) {
					check = true;
				}
			}
		}
		return check;
		}
	private boolean checkDiagonalen (int spieler) {
		boolean check = false;
		for (int i = 0; i < n; i++) {
				if (spielfeld[i][i] != spieler) {
					break;
				}
				if (i == n - 1) {
					check = true;
				}
		}
		for (int i= 0; i<n; i++) {
			if (spielfeld[i][n-1-i] != spieler) {
					break;
			}
			if (i == n-1) {
				check = true;
			}
		}
		return check;
	}
	
	private boolean tie(int[][] spielfeld){
		for(int i=0; i<n; i++){
			for(int j=1; j<n; j++){
				if(spielfeld[i][j]==0){
					return false;
				}
			}
		}
		return true;
	}
}
