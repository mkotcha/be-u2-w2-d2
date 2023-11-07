package org.emmek.beu2w2d2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class BlogPost {

    private int id;
    private String category;
    private String title;
    private String picture;
    private String content;
    private int readTime;

}
