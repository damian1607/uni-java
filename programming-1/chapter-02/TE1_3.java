import java.util.Scanner;

public class TE1_3 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = inputs.nextLine();
        firstName = firstName.trim();
        if (firstName.isEmpty()) {
            System.out.println("U kinda messed up... :C");
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.printf("Hallo %s!\n", firstName);
            }
        }
        inputs.close();
    }
}