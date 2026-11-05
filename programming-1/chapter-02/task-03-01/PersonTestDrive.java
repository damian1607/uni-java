class PersonTestDrive {

  static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();

    person1.name = "Lea";
    person1.age = 25;

    person2.name = "Damian";
    person2.age = 21;

    person1.greet();
    person2.greet();

    // Change name of person1 within runtime
    person1.name = "Lou";
    person1.greet();
  }
  
}
