package com.zahid.BlogRestApi.repository;

import com.zahid.BlogRestApi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
