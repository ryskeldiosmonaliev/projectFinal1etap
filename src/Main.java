import model.Gender;
import model.User;
import sevise.UserServiseImpl;
import sevise.Userservise;

public class Main {
    public static void main(String[] args) {
        User ryskeldi = new User.Builder()
                .withId(1)
                .withName("Ryskeldi")
                .withAge(26)
                .withGender(Gender.MAN)
                .builds();
        User Ayzada = new User.Builder()
                .withId(2)
                .withName("Ayzada")
                .withAge(26)
                .withGender(Gender.WOMAN)
                .builds();
        User Myskal = new User.Builder()
                .withId(3)
                .withName("Myskal")
                .withAge(26)
                .withGender(Gender.MAN)
                .builds();

        Userservise userservise = new UserServiseImpl();
        userservise.addUser(ryskeldi);
        userservise.addUser(Ayzada);
        userservise.addUser(Myskal);
        userservise.remove(1);
        System.out.println(userservise.byId(3));
       // userservise.getAll();

    }
}