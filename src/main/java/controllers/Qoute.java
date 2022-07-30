package controllers;

import java.io.Serializable;

public class Qoute implements Serializable {
    private long id;
    private String content;
    private int author_id;

    public Qoute(long id, String content, int author_id) {
        this.id = id;
        this.content = content;
        this.author_id = author_id;
    }

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

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
}
