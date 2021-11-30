package com.epam.training.ticketservice.model;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public void Room{

    @Id
    @GeneratedValue
    private Long id;

    @Unique
    private String name;
    private int rows;
    private int columns;
    private int chairs;

    public Room(String name, int rows, int columns){
        this.name = name;
        this.rows = rows;
        this.columns= columns;
        this.chairs = int(rows*columns);
    }

    @Override
    public String toString() {
        return "Room "+name + " with "+chairs+" seats, "+rows+" rows and "+
            columns+" columns.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, length);
    }
}
