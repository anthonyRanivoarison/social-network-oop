    package user;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comment {
    String id;
    String content;
    User author;
    LocalDate createdAt;

    public Comment(String id, String content, User author, LocalDate createdAt){
        this.id = id;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

}
