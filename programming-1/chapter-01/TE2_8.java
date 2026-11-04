import java.util.Scanner;

public class TE2_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("Nice to meet you, " + name + "!");

        input.close();
    }

}
