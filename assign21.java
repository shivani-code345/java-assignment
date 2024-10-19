import java.util.Scanner;
public class assign21 {
    public static int binaryToDecimal(String binaryStr) {
        int decimal = 0;
        int length = binaryStr.length();

        for (int i = 0; i < length; i++) {
            if (binaryStr.charAt(i) == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }

        return decimal;
    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();
        int decimalValue = binaryToDecimal(binaryStr);
        System.out.println("Decimal value: " + decimalValue);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binaryStrValue = decimalToBinary(decimal);
        System.out.println("Binary value: " + binaryStrValue);

        scanner.close();
    }
}


