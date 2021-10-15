public class PersonDemoApp {

    public static void main(String[] args) {

        Person person1= new Person();
        person1.firstName="Max";
        person1.lastName="Mustermann";
        person1.age=39;
        // System.out.println(person1.age +" "+ person1.firstName +" "+ person1.lastName);
       // printPerson(person1);
        person1.print();
    }
    public static void printPerson(Person p) {
        System.out.println(p.lastName +" "+ p.firstName +" "+ p.age );

    }
}
