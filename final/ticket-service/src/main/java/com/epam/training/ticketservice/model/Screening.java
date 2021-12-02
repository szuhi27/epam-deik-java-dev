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
    private LocalDateTime date;

    @Override
    public String toString() {
        return movie+", screened in room "+room.getName()+ ", at "
        + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

}
