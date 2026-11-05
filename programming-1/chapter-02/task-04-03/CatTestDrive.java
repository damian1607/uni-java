class CatTestDrive {

    public static void main(String[] args) {
        Cat firstCat = new Cat("gray", 9);
        Cat secondCat = new Cat("orange", 6);

        System.out.printf("Cat 1:\nFur color: %s\nRemaining lives: %s\n", firstCat.furColor, firstCat.remainingLives);
        firstCat.meow();

        System.out.println();

        System.out.printf("Cat 2:\nFur color: %s\nRemaining lives: %s\n", secondCat.furColor, secondCat.remainingLives);
        secondCat.meow();
    }

}
