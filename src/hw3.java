/*
Input an email from the user. You have to create a username from the email by deleting
the part that comes after ‘@’. Display that username to the user.
Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/

import java.util.*;

public class hw3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        StringBuilder email = new StringBuilder(sc.next());
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
                email.delete(i,email.length());
        }
        System.out.println("Username: "+ email);
    }
}