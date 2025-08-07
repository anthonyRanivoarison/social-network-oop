package user;

import java.time.LocalDate;
import java.util.List;

public class Post {

    private int id;
    private User author;
    private String description;
    private LocalDate createdAt;
    private List<String> media;
    private String visibility;
    List<Comment> Comments;



    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public List<String> getMedia() {
        return media;
    }

    public String getVisibility() {
        return visibility;
    }

    public List<Comment> getComments() {
        return Comments;
    }

}