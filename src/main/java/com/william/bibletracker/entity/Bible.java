package com.william.bibletracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bible {

    @Id
    @Column(unique=true)
    private int id;

    @Column(unique=true)
    private String book;

    @Column(unique=true)
    private int chapter;

    public int getId() {
        return id;
    }

    public String getBook() {
        return book;
    }

    public int getChapter() {
        return chapter;
    }

    @Override
    public String toString() {
        return "Bible{" +
                "id=" + id +
                ", book='" + book + '\'' +
                ", chapter=" + chapter +
                '}';
    }
}
