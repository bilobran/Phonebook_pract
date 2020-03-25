import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private TypePhone typePhone;
    List<String> numPhone = new ArrayList<>();

    public User() {
    }

    public User(String name, String surname, TypePhone typePhone, List<String> numPhone) {
        this.name = name;
        this.surname = surname;
        this.typePhone = typePhone;
        this.numPhone = numPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TypePhone getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone;
    }

    public List<String> getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(List<String> numPhone) {
        this.numPhone = numPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", typePhone=" + typePhone +
                ", numPhone=" + numPhone +
                '}';
    }



}
