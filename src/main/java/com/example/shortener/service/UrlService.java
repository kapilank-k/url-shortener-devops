package com.example.shortener.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UrlService {

    private final Map<String, String> urlDatabase = new HashMap<>();

    public String shortenUrl(String longUrl) {
        String shortCode = UUID.randomUUID().toString().substring(0, 6);
        urlDatabase.put(shortCode, longUrl);
        return shortCode;
    }

    public String getOriginalUrl(String shortCode) {
        return urlDatabase.get(shortCode);
    }
}
