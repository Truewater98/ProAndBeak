import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		String num = "";
		EXIT :
		do{
			num = br.readLine();
			int len = num.length();			
			if(len % 2 == 0 && !num.equals("0")) {
				for(int i = 0; i < len / 2; i++) {
					if(num.charAt(i) != num.charAt((len - 1) - i)) {
						bw.write("no\n");
						continue EXIT;
					}
				}
			}else if(len % 2 == 1 && !num.equals("0")) {
				for(int i = 0; i < len / 2; i++) {
					if(num.charAt(i) != num.charAt((len - 1) - i)) {
						bw.write("no\n");
						continue EXIT;
					}
				}
			}
			if(!num.equals("0")) bw.write("yes\n");
		} while(!num.equals("0"));
		bw.flush();
	}
}