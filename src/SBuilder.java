import java.util.*;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert any character
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(1,'o');
        System.out.println(sb);

        //delete any element
        sb.delete(0,1);
        System.out.println(sb);

        //to append (last me kuch jodna)
        sb.append("f");
        System.out.println(sb);
        sb.append("ool");
        System.out.println(sb);

        //to print length
        System.out.println(sb.length());
    }
}
