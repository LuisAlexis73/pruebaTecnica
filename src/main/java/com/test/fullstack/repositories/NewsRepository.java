package com.test.fullstack.repositories;

import com.test.fullstack.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsRepository extends JpaRepository<News, Long> {
    News findById(long id);
}
