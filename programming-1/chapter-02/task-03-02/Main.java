import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine().trim();

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        Person p = new Person(name, age);
        p.greet();

        input.close();
    }

}
