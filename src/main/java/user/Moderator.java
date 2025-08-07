package user;

import java.time.LocalDate;

public class Moderator extends User {
    public Moderator(String id, String name, String email, LocalDate creationDate) {
        super(id, name, email, creationDate);
    }
}
