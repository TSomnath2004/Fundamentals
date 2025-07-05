import java.util.Scanner;

class Percentageofinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gender = sc.nextLine();
        int age = sc.nextInt();

        if (gender.equals("female")) {
            if (age > 1 && age < 58) {
                System.out.print("percentage of interest 8.2%");
            } else if (age >= 58 && age < 100) {
                System.out.print("percentage of interest 9.2%");
            } else {
                System.out.print("Age out of range");
            }
        } else if (gender.equals("male")) {
            if (age > 1 && age < 58) {
                System.out.print("percentage of interest 8.4%");
            } else if (age >= 58 && age < 100) {
                System.out.print("percentage of interest 10.5%");
            } else {
                System.out.print("Age out of range");
            }
        } else {
            System.out.print("Invalid gender input");
        }

        sc.close();
    }
}
