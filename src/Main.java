import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static  void main(String[] args) {
        Menu menu = new Menu();
        menu.addUser(new User("Ihor","Buk",TypePhone.HOME,Arrays.asList("07349758")));
        menu.addUser(new User("Vika","Baluh",TypePhone.WORK,Arrays.asList("07323234")));
        menu.addUser(new User("Katya","Chayka",TypePhone.WORK,Arrays.asList("06769558")));
        menu.addUser(new User("Vitalik","Bulobran",TypePhone.WORK,Arrays.asList("09149548")));


        menu.showAllWhenKod();


    }
}



