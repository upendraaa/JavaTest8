package testb;


//Given a string str, the task is to find the longest substring which is a palindrome.
//        Input: str = “forgeeksskeegfor”
//        Output: “geeksskeeg”
//        Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.
public class MainD {
    public static void main(String[] args) {

        longestPalindrome("forgeeksskeegfor");

    }


    public static void longestPalindrome(String str){

        char[] charArray = str.toCharArray();
        char [] testArray = new char[charArray.length];
        int start =0;
        int end = charArray.length-1;

        int lastStartIndex = 0;
        int lastEndIndex = end;

        while (start<end){

            if(charArray[start] == charArray[end]){
                testArray[start] = charArray[start];
                testArray[end] = charArray[end];
                start++;
                end--;
            }else if(charArray[start] != charArray[end]){

                lastStartIndex = lastStartIndex+1;
                lastEndIndex = lastEndIndex-1;

                start = lastStartIndex;
                end = lastEndIndex;
                testArray = new char[lastEndIndex+1];

            }

        }

        StringBuilder sb = new StringBuilder();
        for(char c: testArray){
            sb.append(String.valueOf(c));
        }
        System.out.println(sb);

    }

}
