package com.example.news.service;

import com.example.news.model.NewsResponse;
import com.example.news.model.NewsArticle;
import com.example.news.service.api.GetActualNews;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    public List<NewsArticle> getNews() throws JsonProcessingException {
        JsonParser parser = new BasicJsonParser();
        ObjectMapper objectMapper = new ObjectMapper();
        NewsResponse response = objectMapper.readValue(GetActualNews.getApiResponse(), NewsResponse.class);
        return response.getArticles();
    }


}
