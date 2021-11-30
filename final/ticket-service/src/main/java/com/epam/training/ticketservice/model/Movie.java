package com.epam.training.ticketservice.model;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public void Movie{

    @Id
    @GeneratedValue
    private Long id;

    @Unique
    private String name;
    private String genre;
    private int length;

    public Movie(String name, String genre, int length){
        this.name = name;
        this.genre = genre;
        this.length = length;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ", " + length + " minutes)";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, length);
    }


}