package com.epam.training.ticketservice.model;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public void Screening{

    @Id
    @GeneratedValue
    @Unique
    private Long id;

    private String movie;
    private String room;
    private date
        create screening <film címe> <terem neve> <
        vetítés kezdetének dátuma és ideje, YYYY-MM-DD hh:mm formátumban>

}
