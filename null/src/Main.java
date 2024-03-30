// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Label nullLabel = new NullLabel();
        Label label = new Label("I'm Label Class");

        if(nullLabel instanceof NullLabel){
            System.out.println("Null label이기 때문에 아무 것도 안함");
            nullLabel.display();
        }
        if(!(label instanceof NullLabel)){
            label.display();
        }
    }
}