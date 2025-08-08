package user;

import java.time.LocalDate;


public class User {
    private final String id ;
    private final String name;
    private final String email;
    private final LocalDate creationDate;

    public User(String id, String name, String email, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
