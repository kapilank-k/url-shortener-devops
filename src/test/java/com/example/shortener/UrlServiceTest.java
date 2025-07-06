package com.example.shortener;

import com.example.shortener.service.UrlService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrlServiceTest {

    @Test
    public void testShortenUrl() {
        UrlService urlService = new UrlService();
        String longUrl = "https://example.com";

        String shortCode = urlService.shortenUrl(longUrl);

        assertNotNull(shortCode);
        assertFalse(shortCode.isEmpty());

        System.out.println("✅ Shortened Code: " + shortCode);
    }

    @Test
    public void testRetrieveOriginalUrl() {
        UrlService urlService = new UrlService();
        String longUrl = "https://example.com";

        String shortCode = urlService.shortenUrl(longUrl);
        String retrievedUrl = urlService.getOriginalUrl(shortCode);

        assertEquals(longUrl, retrievedUrl);
        System.out.println("✅ Retrieved Original URL: " + retrievedUrl);
    }
}
