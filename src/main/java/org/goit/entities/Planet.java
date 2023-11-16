package org.goit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    private long id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Override
    public String toString(){
        return id + ") " + name;
    }
}
