public class TE4_2 {

    public static void main(String[] args) {
        String name = "Jane Doe";
        int age = 20;

        // Loop: print the greeting several times (ends after 3 iterations)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello " + name + "! (" + i + ")");
        }

        // Store the age in a variable and print a matching message
        System.out.println("You are " + age + " years old.");

        // if condition: flattering output depending on the age
        if (age < 18) {
            System.out.println("So young and already curious about Java - impressive!");
        } else if (age < 30) {
            System.out.println("The perfect age to master Java!");
        } else {
            System.out.println("Experience and curiosity - a powerful combination!");
        }
    }

}
