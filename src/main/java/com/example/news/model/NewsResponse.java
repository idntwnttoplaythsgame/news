package com.example.news.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsResponse {
    private String status;
    private int totalResults;
    List<NewsArticle> articles;
}
