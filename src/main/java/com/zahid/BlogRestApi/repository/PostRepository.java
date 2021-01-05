package com.zahid.BlogRestApi.repository;

import com.zahid.BlogRestApi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PostRepository  extends JpaRepository<Post, Integer>{
}
