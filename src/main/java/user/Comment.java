package user;

import java.time.LocalDate;

public class Comment {
    private int id;
    private String content;
    private User author;
    private LocalDate createdAt;

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}
