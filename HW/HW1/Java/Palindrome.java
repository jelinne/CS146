package HW1;

public class Palindrome {
	public boolean palindrome(String s) {
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			char n = s.charAt(i);
			reverse = n + reverse;
		}
		if(reverse.equals(s)) {
			return true;
		}
		return false;
	}
	public static void main (String[] args) {
		Palindrome p = new Palindrome();
		String s = "tot";
		System.out.print(p.palindrome(s));
	}
}
