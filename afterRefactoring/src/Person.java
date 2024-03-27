public class Person {
    private final Label _name;
    private final Label _mail;

    public Person(Label name, Label mail) {
        _name = name;
        _mail = mail;
    }

    //리팩토링으로 바뀐 생성자
    public Person(Label name){
        this(name,new NullLabel());
    }

    //리팩토링으로 바뀐 조건문
    public void display(){
        _name.display();
        _mail.display();
    }

    //리팩토링 완료
    public String toString(){
        return "[ Person: name =" + _name + " mail= " + _mail + "]";
    }

}
