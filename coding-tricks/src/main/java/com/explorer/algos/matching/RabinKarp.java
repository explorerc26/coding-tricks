package com.explorer.algos.matching;

public class RabinKarp {
	
	static int prime = 3;
	
	public static void main(String[] args) {
		match("AABCACDDCADAD", "ABCAC");
	}

	public static void match(String txt, String pattern) {
		char[] ip = txt.toCharArray();
		char[] pat = pattern.toCharArray();
		int hash = calHash(pat, pat.length);
		int runningHash = calHash(ip, pat.length);
		if (hash == runningHash) {
			System.out.println("Found at 0");
		}
		;
		for (int i = pat.length; i < ip.length; i++) {
			runningHash = (runningHash - ip[i - pattern.length()]) / prime + ip[i] *(int) Math.pow(prime, pattern.length()-1);
			if (hash == runningHash) {
				System.out.println("Found at " + (i - pattern.length()+1));
			}
		}

	}

	public static boolean compare() {
		return false;
	}

	public static int calHash(char[] pat, int len) {
		int hash = 0;
		for (int i = len - 1; i >= 0; i--) {
			hash = hash * prime + pat[i];
		}
		return hash;
	}
}
