package com.bit.durg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReverseString {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			String r = "";
			int x;
			for (int j = 0; j < s.length(); j = x) {
				x = j;
				while (++x < s.length() && s.charAt(x) == s.charAt(j))
					;
				r = r + s.charAt(j);
			}
			System.out.println(r);
		}
	}
}