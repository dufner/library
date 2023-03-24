package com.example.Library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
public class Book {
    @Id
    private String id;
    private String name;
    private TypeOfBook type;

    public enum TypeOfBook {
        CRIME, DRAMA, COMEDY, DOCUMENTARY, LOVE, NATURE
    }
}
