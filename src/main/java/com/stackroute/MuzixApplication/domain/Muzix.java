package com.stackroute.MuzixApplication.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "versha")
public class Muzix {
    @Id
    @Column(name="id")
    int id;
    @Column(name="name")
    String name="Versha";
    @Column(name="comment")
    String comment="Vharma";

    public Muzix(int id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }

    public Muzix() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Muzix{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
