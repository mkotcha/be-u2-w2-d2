package org.emmek.beu2w2d2.services;

import org.emmek.beu2w2d2.entities.Author;
import org.emmek.beu2w2d2.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    private final List<Author> authors = new ArrayList<>();

    public Author save(Author author) {
        Random rnd = new Random();
        author.setId(rnd.nextInt(1, 1000));
        authors.add(author);
        return author;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Author findById(int id) throws NotFoundException {
        for (Author bp : authors) {
            if (bp.getId() == id) {
                return bp;
            }
        }
        throw new NotFoundException(id);
    }

    public void findByIdAndDelete(int id) {
        authors.removeIf(bp -> bp.getId() == id);
    }

    public Author findByIdAndUpdate(int id, Author author) throws NotFoundException {
        for (Author bp : authors) {
            if (bp.getId() == id) {
                return bp = author;
            }
        }
        throw new NotFoundException(id);
    }


}
