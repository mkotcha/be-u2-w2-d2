package org.emmek.beu2w2d2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogposts")
public class BlogPostController {

    @GetMapping("")
    public String getBlogPosts() {
        return "BlogPosts";
    }
}
