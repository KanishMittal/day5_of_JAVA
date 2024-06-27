import java.util.*;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 or 0 to update bit to 1 or 0 respectively: ");
        int operation = sc.nextInt();
        //operation = 1 , set bit logic
        //operation = 0 , clear bit logic
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        if (operation==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            int newNumber = ~(bitMask) & n;
            System.out.println(newNumber);
        }
    }
}
