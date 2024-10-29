class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {

    public HexNum(int number) {
        super(number);
    }
    public void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class assign44NumDemo {
    public static void main(String[] args) {
        Num num = new Num(42);
        num.shownum(); // Displays the number in decimal

        HexNum hexNum = new HexNum(42);
        hexNum.shownum(); // Displays the number in hexadecimal and octal
    }
}
