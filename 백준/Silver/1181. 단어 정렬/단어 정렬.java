import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeatNum = Integer.parseInt(br.readLine());
		Set<String> a = new HashSet<String>();
		for(int i = 0; i < repeatNum; i++) {
			a.add(br.readLine());
		}
		String[] strs = a.toArray(new String[0]);
		for(int i = 0; i < strs.length; i++) {
			for(int j = 0; j < strs.length - i - 1; j++) {
				if(strs[j].length() > strs[j + 1].length()) {
					String temp = strs[j];
					strs[j] = strs[j + 1];
					strs[j + 1] = temp;
				}
				else if(strs[j].length() == strs[j + 1].length()) {
					for(int k = 0; k < strs[j].length(); k++) {
						if(strs[j].charAt(k) != strs[j + 1].charAt(k)) {
							if(strs[j].charAt(k) > strs[j + 1].charAt(k)) {
								String temp = strs[j];
								strs[j] = strs[j + 1];
								strs[j + 1] = temp;								
							}
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i < strs.length; i++) {
			if(i != strs.length - 1) {
				bw.write(strs[i]);
				bw.newLine();				
			}else {
				bw.write(strs[i]);
			}
		}
		bw.flush();	
	}
}