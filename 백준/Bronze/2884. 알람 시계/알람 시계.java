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
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int MAXH = 24;
		final int MAXM = 60;
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		minute -= 45;
		if(minute < 0) {
			hour--; 
			minute += MAXM;
		}
		if(hour > MAXH) {
			hour -= MAXH;
		}else if(hour < 0) {
			hour += MAXH;
		}
		bw.write(hour + " " + minute);
		bw.flush();
		
	}

}