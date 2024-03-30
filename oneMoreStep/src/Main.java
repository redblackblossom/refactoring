// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person(new Label("Alice"), new Label("alice@example,com")),
                new Person(new Label("Bobby"), new Label("bobby@example,com")),
                new Person(new Label("Chris"))
        };
        for(Person p :people){
            System.out.println(p.toString());
            p.display();
            System.out.println("");
        }
    }
}