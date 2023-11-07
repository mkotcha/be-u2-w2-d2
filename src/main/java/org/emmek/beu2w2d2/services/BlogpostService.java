package org.emmek.beu2w2d2.services;

import org.emmek.beu2w2d2.entities.BlogPost;
import org.emmek.beu2w2d2.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogpostService {
    private final List<BlogPost> blogposts = new ArrayList<>();

    public BlogPost save(BlogPost blogpost) {
        Random rnd = new Random();
        blogpost.setId(rnd.nextInt(1, 1000));
        blogposts.add(blogpost);
        return blogpost;
    }

    public List<BlogPost> getBlogposts() {
        return blogposts;
    }

    public BlogPost findById(int id) throws NotFoundException {
        for (BlogPost bp : blogposts) {
            if (bp.getId() == id) {
                return bp;
            }
        }
        throw new NotFoundException(id);
    }

    public void findByIdAndDelete(int id) {
        blogposts.removeIf(bp -> bp.getId() == id);
    }

    public BlogPost findByIdAndUpdate(int id, BlogPost blogpost) throws NotFoundException {
        for (BlogPost bp : blogposts) {
            if (bp.getId() == id) {
                return bp = blogpost;
            }
        }
        throw new NotFoundException(id);
    }


}
