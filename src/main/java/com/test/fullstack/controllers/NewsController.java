package com.test.fullstack.controllers;

import com.test.fullstack.dtos.NewsDTO;
import com.test.fullstack.models.News;
import com.test.fullstack.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class NewsController {

    @Autowired
    NewsRepository newsRepository;

    @GetMapping("/api/news")
    public List<News> getNews() {
        return newsRepository.findAll();
    }

    @PostMapping("/api/addNews")
    public ResponseEntity<Object> addNews(@RequestBody NewsDTO newsDTO) {

        if (newsDTO.getContent().isEmpty()){
            return new ResponseEntity<>("El contenido no puede estar vacio", HttpStatus.FORBIDDEN);
        }
        if (newsDTO.getContent().length() > 255){
            return new ResponseEntity<>("El contenido no puede contener más de 255 caracteres", HttpStatus.FORBIDDEN);
        }

        newsRepository.save(new News(newsDTO.getContent(), newsDTO.getTags(), newsDTO.getCategories(), newsDTO.getRegion(), LocalDateTime.now()));

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
