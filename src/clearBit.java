public class clearBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int newNumber = ~(bitMask) & n;
        System.out.println(newNumber);
    }
}
