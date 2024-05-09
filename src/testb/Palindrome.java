package testb;
public class Palindrome {
    public static String buildPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (chars[i] == '?' && chars[n - i - 1] == '?') {
                chars[i] = 'a';
                chars[n - i - 1] = 'a';
            } else if (chars[i] == '?' && chars[n - i - 1] != '?') {
                chars[i] = chars[n - i - 1];
            } else if (chars[i] != '?' && chars[n - i - 1] == '?') {
                chars[n - i - 1] = chars[i];
            } else if (chars[i] != chars[n - i - 1]) {
                return "NO";
            }
        }

        for (int i = 0; i < n; i++) {
            if (chars[i] == '?') {
                chars[i] = 'a';
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String palindrome1 = buildPalindrome("?ab??a");
        System.out.println("Palindrome: " + palindrome1);

        String palindrome2 = buildPalindrome("bab??a");
        System.out.println("Palindrome: " + palindrome2);
    }
}


