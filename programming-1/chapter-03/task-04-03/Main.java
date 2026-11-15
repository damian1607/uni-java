class Main {

    static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 9;
        numbers[3] = 12;
        numbers[4] = 15;

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();

        System.out.println(dogs[0]);
        System.out.println(dogs[1]);
        System.out.println(dogs[2]);

        // Override previous reference variables
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();
        dogs[0].name = "Kenai";
        dogs[0].breed = "Shiba Inu";
        dogs[0].size = 5;
        dogs[1].name = "Spike";
        dogs[1].breed = "American Bulldog";
        dogs[1].size = 10;
        dogs[2].name = "Gismo";
        dogs[2].breed = "French Bulldog";
        dogs[2].size = 3;

        // Create new int array with the same references
        int[] numbers2 = numbers;
        numbers2[0] = 5;
        System.out.println(numbers[0]); // prints 5
        System.out.println(numbers2[0]); // prints 5

        // Traverse through the dogs array 
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark();
        }
    }

}
