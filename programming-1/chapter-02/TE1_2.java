import java.util.*;

public class TE1_2 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = inputs.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Hallo %s!\n", firstName);
        }
        inputs.close();
    }
}