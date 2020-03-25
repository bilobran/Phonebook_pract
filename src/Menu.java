import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    List<User> users = new ArrayList<>();

    public Menu() {
    }

    public Menu(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "users=" + users +
                '}';
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void showAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }

    }

    public void deleteUser(String name) {
        Iterator<User> userIterator = users.iterator();
        while (userIterator.hasNext()) {
            User userNext = userIterator.next();
            if (userNext.getName() == name) {
                userIterator.remove();
            }
        }
    }

    public void changeNumber(String name, List<String> num) {
        for (User user : users) {
            if (user.getName() == name) {
                user.setNumPhone(num);
            }

        }
    }

    public void showAllNum() {
        for (User user : users) {
            System.out.println(user.getName() + user.getNumPhone());

        }
    }

    public void showAllNameAndSurname() {
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getSurname() + " " + "("+ user.getTypePhone() + ")");

        }
    }

    public void showUserWithNum(List<String> num){
        for (User user : users) {
            if(user.getNumPhone().equals(num)){
                System.out.println(user.getName() +" "+ user.getSurname());
            }

        }
    }
    public  void showAllWhenKod(){
        for (User user : users) {
            for(String i : user.getNumPhone()){
                if(i.contains("073")){
                    System.out.println(user.getName() + " " + user.getSurname() + " " + "(" +i +")");
                }

            }

            }

            }
        }



