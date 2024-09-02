package org.alfa.alfa_house.controller;

import lombok.RequiredArgsConstructor;
import org.alfa.alfa_house.model.Post;
import org.alfa.alfa_house.model.PostRent;
import org.alfa.alfa_house.model.PostSale;
import org.alfa.alfa_house.request.PostRequest;
import org.alfa.alfa_house.service.DefaultPostService;
import org.alfa.alfa_house.service.PostToDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@RestController()
@RequestMapping("/")
@RequiredArgsConstructor
public class PostController {
    private final DefaultPostService postService;
    private final PostToDtoMapper mapper;

//    @GetMapping
//    public List<PostSale> getTopFlatsSale() {
//        return postService.getTopPostSale();
//    }
//
//    @GetMapping
//    public List<PostRent> getTopFlatsRent() {
//        return postService.getTopPostRent();
//    }

    @GetMapping("flat/{id}")
    public Post getFlatById(@PathVariable UUID id) {
        return postService.getPostById(id);
    }

    @GetMapping
    public List<Post> getAllFlats() {
        return postService.getAllPosts();
    }

    @PostMapping
    public void addPost(@RequestBody PostRequest request) {
        postService.addPost(mapper.postRequestToPost(request));
    }

    @GetMapping("flats/by-room-count")
    public ResponseEntity<List<Post>> findAllByFilters(@RequestBody ConcurrentHashMap<String, Object> filters) {
        return ResponseEntity.ok(postService.findAllByFilters(filters));
    }


}
