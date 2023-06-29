package sevise;

import dao.UserDao;
import dao.exsepsion.Excepsion;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiseImpl implements Userservise {
    private final UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        List<User> users = userDao.getUsers();
        users.add(user);
    }

    @Override
    public User remove(int id) {
        User user = new User();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                user = userDao.getUsers().remove(i);
            }
        }
        if (user.getName() == null) {
            throw new Excepsion("not  Found");
        }

        return user;
    }

    @Override
    public void getAll() {
        for (User u : userDao.getUsers()) {
            System.out.println(u);
        }
    }

    @Override
    public User byId(int id) {
        User user = new User();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                user = userDao.getUsers().get(i);
            }
        }
        if (user.getName() == null) {
            throw new Excepsion("not  Found");
        }

        return user;
    }
}
