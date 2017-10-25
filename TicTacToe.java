package tictactoe;
import java.io.*;

public class TicTacToe {
	public int SpielerA;
	public int SpielerB;
	public static int n;
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		BufferedReader size = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter size of game pattern");
		n = Integer.parseInt(size.readLine());
		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Enter x coordinate of the next turn");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter y coordinate of the next turn");
		int y = Integer.parseInt(br.readLine());
		
	}
		
		public static void gamePattern() {
			String [][] spielfeld = new String [n][n];
			for (int i = 0; i < n; i++) {
				System.out.println();
				for (int j = 0; j < n; j++) {
					spielfeld [i][j] = "0";
					System.out.print ("\t" + spielfeld[i][j]);
				}
			}
		}
		private boolean checkWin(int spieler) {
			return (checkZeilen(spieler) | checkSpalten(spieler) | checkDiagonalen(spieler));
		}
		private boolean checkZeilen(int spieler) {
			for (int i = 0; i < n; i++) {
				if (spielfeld [i][0]) {
					return true;
				}
				return false;
			}
		}
		private boolean checkSpalten() {
			for (int i = 0; i < n; i++) {
				if (spielfeld)
			}
		}
		
		
		
		
		
		
		
		
		
		

}
	

