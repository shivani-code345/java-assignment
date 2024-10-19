class Commission {
    private double sales;
    public Commission(double sales) {
        this.sales = sales;
    }
    public double commission() {
        return sales * 0.10;
    }
    public double getSales() {
        return sales;
    }
}

public class assign33 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid input");
        } else {
            Commission commission = new Commission(sales);
            double commissionValue = commission.commission();
            System.out.println("Sales: " + commission.getSales());
            System.out.println("Commission: " + commissionValue);
        }

        scanner.close();
    }
}
