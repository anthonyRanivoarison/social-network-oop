package user;

import java.time.LocalDate;


public class User {
    private String id ;
    private String name;
    private String email;
    private LocalDate creationDate;

    public User(String id, String name, String email, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.creationDate = LocalDate.now();
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
