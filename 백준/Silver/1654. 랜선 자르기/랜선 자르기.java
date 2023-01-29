import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int index = Integer.parseInt(st.nextToken());
		int amount = Integer.parseInt(st.nextToken());
		long min = 0;
		long max = 0;
		long length = 0;
		int[] nums = new int[index];
		for(int i = 0; i < index; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			if(max < nums[i]) max = nums[i];
		}
		max++;
		while(min < max) {
			length = (max + min) / 2;
			int result = 0;
			for(int i = 0; i < index; i++) {
				result += nums[i] / length; 
			}
			if(result < amount) {
				max = length;
			}else {
				min = (length + 1);
			}
		}
		System.out.println(min - 1);
	}
}