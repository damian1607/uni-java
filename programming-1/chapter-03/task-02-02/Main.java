class Main {

    static void main(String[] args) {

        // Test 1
        Dog dog1 = new Dog();
        dog1.name = "Kenai";
        dog1.breed = "Shiba Inu";
        dog1.size = 5;

        Dog dog2 = dog1;
        dog2.name = "Spike";

        dog1.bark(); // prints "Spike"
        dog2.bark(); // also prints "Spike"

        dog2 = new Dog();
        dog2.name = "Gismo";

        dog1.bark(); // prints "Spike"
        dog2.bark(); // prints "Gismo"

        // Test 2
        int num1 = 3;
        int num2 = num1;

        num1 = 9;
        System.out.println("Number 1: " + num1); // prints 9
        System.out.println("Number 2: " + num2); // prints 3
    }

}
