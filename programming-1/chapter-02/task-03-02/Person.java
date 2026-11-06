class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.printf("Hello, my name is %s and I'm %d years young! :D\n", name, age);
    }
}
