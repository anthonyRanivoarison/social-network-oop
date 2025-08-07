package user;

import java.time.LocalDate;
import java.util.List;

public class Admin extends Moderator {

    public Admin(String id, String name, String email, LocalDate creationDate) {
        super(id, name, email, creationDate);
    }

    private GroupUser group;

    String deleteUser(String id) {
        List<User> users = group.getUsers();
        if (id != null){
            users.removeIf(user -> user.getId() == id);
            return "Successfully deleted";
        }
        return "Enter a valid ID";
    }
}
