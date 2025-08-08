    package user;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comment {
    String id;
    String content;
    User author;
    LocalDate createdAt;
    private static ArrayList<Comment> everyComments = new ArrayList<Comment>();


    public Comment(String id, String content, User author, LocalDate createdAt){
        this.id = id;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
        everyComments.add(this);
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Comment> getEveryComments() {
        return everyComments;
    }

    public static void setEveryComments(ArrayList<Comment> everyComments) {
        Comment.everyComments = everyComments;
    }
}
