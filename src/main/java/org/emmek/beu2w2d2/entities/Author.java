package org.emmek.beu2w2d2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String birthDate;
    private String avatar;
}
