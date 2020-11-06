package ru.springboot.learning.blog.repository;


import org.springframework.data.repository.CrudRepository;
import ru.springboot.learning.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
