import java.util.Scanner;

class car {
    String name = "audi R8";
}

class course {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        System.out.print("Enter you input:");

        // int value = scan.nextInt();
        int value = 10;
        for (int i = 0; i < value; i++) {
            System.out.println("*".repeat(i) + " ".repeat(value - i) + " ".repeat(value - i) + "*".repeat(i));

        }
        for (int i = 0; i < value; i++) {
            System.out.println("*".repeat(value - i) + " ".repeat(i) + " ".repeat(i) + "*".repeat(value - i));
        }
        int[] arr = { 10, 20, 25, 30, 35 };
        car audi = new car();
        System.out.println(audi.name);
    }

}