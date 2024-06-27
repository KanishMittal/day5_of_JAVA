/*
Input a StringBuilder from the user in which you will replace the letter ‘e’
the with letter ‘i’.
Example :
input = “eabcdef’ ; output = “iabcdif”
*/

import java.util.*;


public class hw2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        StringBuilder input = new StringBuilder(sc.next());
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e')
                input.setCharAt(i, 'i');
        }
        System.out.println(input);
    }
}

