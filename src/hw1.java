//Take an array of StringBuilder input from the user & find the cumulative
//(combined) length of all those strings.

import java.util.*;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder array[] = new StringBuilder[size];
        int totalLength = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder(sc.nextLine());
            totalLength += array[i].length();
        }
        System.out.println(totalLength);
    }
}
