package org.alfa.alfa_house.service;

import io.micrometer.core.instrument.binder.system.FileDescriptorMetrics;
import lombok.RequiredArgsConstructor;
import org.alfa.alfa_house.dao.PostEntity;
import org.alfa.alfa_house.exception.FlatNotFoundException;
import org.alfa.alfa_house.model.Post;
import org.alfa.alfa_house.repository.PostRepository;
import org.alfa.alfa_house.specifications.PostSpecificationBuilder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
@RequiredArgsConstructor
public class DefaultPostService implements PostService {
    private final PostRepository postRepository;
    private final EntityMapper mapper;
    private final FileDescriptorMetrics fileDescriptorMetrics;

    @Override
    public Post getPostById(UUID id) {
        PostEntity postEntity = postRepository
                .findById(id)
                .orElseThrow(() -> new FlatNotFoundException("Квартира не найдена: id = " + id));

        return mapper.postEntityToPost(postEntity);
    }

    @Override
    public List<Post> getAllPosts() {
        Iterable<PostEntity> iterable = postRepository.findAll();

        List<Post> posts = new ArrayList<>();
        for (PostEntity postEntity : iterable) {
            posts.add(mapper.postEntityToPost(postEntity));
        }
        return posts;
    }

    @Override
    public void addPost(Post post) {
        PostEntity postEntity = mapper.postToPostEntity(post);
        postRepository.save(postEntity);
    }

    public List<Post> findAllByFilters(ConcurrentHashMap<String, Object> filters) {
        PostSpecificationBuilder builder = new PostSpecificationBuilder();
        // Основные параметры
        builder.addSpecification("isRent", ":", filters.get("isRent")).
                addSpecification("isApartment", ":", filters.get("isApartment")).
                addSpecification("roomCount", ":", filters.get("roomCount")).
                addSpecification("priceMin", ">", filters.get("priceMin")).
                addSpecification("priceMax", "<", filters.get("priceMax")).
                addSpecification("metro", ":", filters.get("metro"));

        // Фильтры
        builder.addSpecification("areaMin", ">", filters.get("areaMin")).
                addSpecification("areaMax", "<", filters.get("areaMax")).
                addSpecification("balcony", ":", filters.get("balcony")).
                addSpecification("sanUzel", ":", filters.get("sanUzel")).
                addSpecification("remont", ":", filters.get("remont")).
                addSpecification("windowView", ":", filters.get("windowView")).
                addSpecification("stove", ":", filters.get("stove"));

        Specification spec = builder.build();

        Iterable<PostEntity> iterable = postRepository.findAll(spec);

        List<Post> posts = new ArrayList<>();
        for (PostEntity postEntity : iterable) {
            posts.add(mapper.postEntityToPost(postEntity));
        }
        return posts;
    }
}
