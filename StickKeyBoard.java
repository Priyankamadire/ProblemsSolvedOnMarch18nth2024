/*Amazon fire tv stick keyboard wanted to be operated on number pad. 
You will be given the below pad. 
You are supposed to print all possible words in alphabetic order for a given number (0-9)

	1		2		3
		   abc	   def
		 
	4		5		6
   ghi             jkl     mno
  
	7		8		9
  pqrs           tuv    wxyz
	
	*		0		#


You will be given a string S which contains (2-9)  only  
For example: S = "3", then the possible words are "d", "e", "f".

Input Format:
-------------
String(2-9)

Output Format:
--------------
Print the list of words in alphabetical order


Sample Input-1:
---------------
2

Sample Output-1:
----------------
a b c


Sample Input-2:
---------------
24

Sample Output-2:
----------------
ag ah ai bg bh bi cg ch ci
 */
import java.util.*;
public class StickKeyBoard{
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }

    public static List<String> solve(String s) {
        List<String> al = new ArrayList<>();
        help(s, 0, "", al);
        return al;
    }

    public static void help(String s, int i, String curr, List<String> al) {
        if (i == s.length()) {
            al.add(curr);
            return;
        }
        int digit = s.charAt(i) - '0';
        String chars = keypad[digit];
        for (char c : chars.toCharArray()) {
            help(s, i + 1, curr + c, al);
        }
    }
}