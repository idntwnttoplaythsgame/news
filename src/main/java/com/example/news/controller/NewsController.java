package com.example.news.controller;

import com.example.news.model.NewsArticle;
import com.example.news.service.NewsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
@AllArgsConstructor
public class NewsController {
    @Autowired
    NewsService service;

    @GetMapping
    public List<NewsArticle> getNews() throws JsonProcessingException {
        return service.getNews();
    }
}
