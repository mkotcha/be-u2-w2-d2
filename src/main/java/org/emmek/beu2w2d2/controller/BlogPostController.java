package org.emmek.beu2w2d2.controller;

import org.emmek.beu2w2d2.entities.BlogPost;
import org.emmek.beu2w2d2.services.BlogpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogPostController {

    @Autowired
    private BlogpostService bpService;

    @GetMapping("")
    public List<BlogPost> getBlogPosts() {
        return bpService.getBlogposts();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost postBlogPosts(@RequestBody BlogPost blogpost) {
        return bpService.save(blogpost);
    }
}
