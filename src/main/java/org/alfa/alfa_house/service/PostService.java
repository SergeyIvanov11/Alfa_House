package org.alfa.alfa_house.service;

import org.alfa.alfa_house.model.Post;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPostById(UUID id);
    List<Post> getAllPosts();
    void addPost(Post post);
}
