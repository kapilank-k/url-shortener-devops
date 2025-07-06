package com.example.shortener;

import com.example.shortener.model.UrlMap;
import com.example.shortener.service.UrlService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrlServiceTest {

    @Test
    void testShortenAndRetrieveUrl() {
        UrlService urlService = new UrlService();

        String longUrl = "https://kapilan.com/some-long-url";
        UrlMap result = urlService.shorten(longUrl);

        assertNotNull(result.getShortCode());
        assertEquals(longUrl, result.getOriginalUrl());

        String retrieved = urlService.getOriginalUrl(result.getShortCode());
        assertEquals(longUrl, retrieved);
    }
}
