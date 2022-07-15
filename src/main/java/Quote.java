import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    private Author author;

    public Quote(long id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}
