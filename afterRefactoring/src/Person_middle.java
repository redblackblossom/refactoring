//해당 코드는 완전한 리팩토링을 하기 전, 중간 단계에 존재하는 리팩토링 입니다!

public class Person_middle {
    private final Label _name;
    private final Label _mail;

    public Person_middle(Label name, Label mail) {
        _name = name;
        _mail = mail;
    }

    //리팩토링으로 바뀐 생성자
    public Person_middle(Label name){
        this(name,new NullLabel());
    }
    //리팩토링으로 바뀐 조건문
    public void display(){
        if(!_name.isNull()){
            _name.display();
        }
        if(!_mail.isNull()){
            _mail.display();
        }
    }
    public String toString(){
        String result = "[ Person:";
        result += " name =";
        if(_name.isNull()){
            result += "\"(none)\"";
        } else {
            result += _name;
        }

        result += " mail =";
        if(_mail.isNull()){
            result += "\"(none)\"";
        } else {
            result += _mail;
        }
        result += " ]";
        return result;
    }

}
