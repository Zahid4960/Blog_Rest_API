package com.zahid.BlogRestApi.service;

import com.zahid.BlogRestApi.model.Post;
import com.zahid.BlogRestApi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post savePost(Post post){
        return repository.save(post);
    }

    public List<Post> getAllPosts(){
        return repository.findAll();
    }
}
