package Lab2;

import java.util.Arrays;

public class Anagram {
	public boolean anagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		if(Arrays.equals(sc,tc)) {
			return false;
		}
		Arrays.sort(sc);
		Arrays.sort(tc);
		return Arrays.equals(sc,tc);
		
	}
	public static void main(String[] args) {
		Anagram a = new Anagram();
		String s = "wand";
		String t = "dawn";
		System.out.print(a.anagram(s, t));
	}
}
