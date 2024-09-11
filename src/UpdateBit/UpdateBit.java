package UpdateBit;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an operation: ");
            int oper = sc.nextInt();

            int n = 5;
            int pos = 1;
            int bitMask = 1 << pos;

            if (oper == 1) {
                // set
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            } else {
                // clear
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & n;
                System.out.println(newNumber);
            }
        }
    }
}
