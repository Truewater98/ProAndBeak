import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
 		int index = Integer.parseInt(br.readLine());
		String num = "";
		int a = 665;
		int count = 0;
		while(true) {
			a++;
			num = String.valueOf(a);
			if(num.contains("666")) {
				count++;
				if(count == index) {
					bw.write(String.valueOf(a));
					break;
				}
			}
		}
		bw.flush();
	}
}