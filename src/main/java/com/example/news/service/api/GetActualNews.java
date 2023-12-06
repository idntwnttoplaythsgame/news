package com.example.news.service.api;

import com.example.news.constant.Constants;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

public class GetActualNews {
    public static String getApiResponse() {
        RestTemplate restTemplate = new RestTemplate();

        String apiURL = "https://newsapi.org/v2/everything?q=investment&sortBy=publishedAt&apiKey=" + Constants.API_KEY
                + "&language=ru&image=1";

        ResponseEntity<String> response = restTemplate.getForEntity(apiURL, String.class);

        if (response.getStatusCode().is2xxSuccessful()){
            String responseBody = response.getBody();
            return responseBody;
        } else {
            return "Ошибка при выполнении запроса!!!";
        }
    }
}
