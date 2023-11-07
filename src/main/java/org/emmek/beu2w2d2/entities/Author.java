package org.emmek.beu2w2d2.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private LocalDate birthDate;
    private String avatar;
}
