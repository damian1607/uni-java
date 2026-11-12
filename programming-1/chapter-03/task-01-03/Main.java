class Main {

    static void main(String[] args) {
        int intValue = 2_000_000;
        byte byteValue = intValue; // Compiler error: possible lossy conversion
    }

} 
