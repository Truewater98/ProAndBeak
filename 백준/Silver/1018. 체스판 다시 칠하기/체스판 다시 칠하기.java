import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		boolean[][] a = new boolean[row][col];
		int min = 57;
		for(int i = 0; i < row; i++) {
			str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				a[i][j] = (str.charAt(j) == 'W');
			}
		}
		for(int i = 0; i <= row - 8; i++) {
			for(int j = 0; j <= col - 8; j++) {
				int count = 0;
				int rCount = 1;
				boolean[][] board = new boolean[8][8];
				boolean[][] rBoard = new boolean[8][8];
				for(int f = 0; f < 8; f++) {
					for(int g = 0; g < 8; g++) {
						board[f][g] = a[i + f][j + g];
						rBoard[f][g] = a[i + f][j + g];
					}
				}
				rBoard[0][0] = !rBoard[0][0];
				for(int x = 0; x < 8; x++) {
					for(int y = 0; y< 7; y++) {
						if(y == 0 && x != 7) {
							if(board[x][0] == board[x + 1][0]) {
								board[x + 1][0] = !board[x + 1][0];
								count++;
							}
						}
						if(board[x][y] == board[x][y + 1]) {
							board[x][y + 1] = !board[x][y + 1];
							count++;							
						}
						if(y == 0 && x != 7) {
							if(rBoard[x][0] == rBoard[x + 1][0]) {
								rBoard[x + 1][0] = !rBoard[x + 1][0];
								rCount++;
							}
						}
						if(rBoard[x][y] == rBoard[x][y + 1]) {
							rBoard[x][y + 1] = !rBoard[x][y + 1];
							rCount++;							
						}
					}
				}
				if(min > count) min = count;
				if(min > rCount) min = rCount;
			}
		}
		bw.write(String.valueOf(min));
		bw.flush();
	}

}