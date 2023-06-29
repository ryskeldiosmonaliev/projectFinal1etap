package sevise;

import model.User;

public interface Userservise {
    void addUser(User user);
    User remove(int id);
    void getAll();
    User byId(int id);
}
