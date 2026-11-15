class Main {

    static void main(String[] args) {
        Dog nullDog = null;
        Dog errorDog;
        System.out.println("Dog: " + nullDog); // This compiles
        // System.out.println("Dog: " + errorDog); // Compiler error: variable might not have been initialized
    }

}
