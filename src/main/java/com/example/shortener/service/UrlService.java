package com.example.shortener.service;

import com.example.shortener.model.UrlMap;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;

@Service
public class UrlService {
    private final HashMap<String, String> codeToUrl = new HashMap<>();
    private final HashMap<String, String> urlToCode = new HashMap<>();

    public UrlMap shorten(String originalUrl) {
        if (urlToCode.containsKey(originalUrl)) {
            return new UrlMap(originalUrl, urlToCode.get(originalUrl));
        }
        String code = UUID.randomUUID().toString().substring(0, 6);
        codeToUrl.put(code, originalUrl);
        urlToCode.put(originalUrl, code);
        return new UrlMap(originalUrl, code);
    }

    public String getOriginalUrl(String code) {
        return codeToUrl.get(code);
    }
}
