package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11653 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while(n!=1) {
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					sb.append(i).append("\n");
					n/=i;
					break;
				}
					
			}
		}
		System.out.println(sb);
	}

}
