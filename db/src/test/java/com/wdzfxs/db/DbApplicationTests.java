package com.wdzfxs.db;

import com.wdzfxs.db.entity.Spotify;
import com.wdzfxs.db.service.SpotifyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest(properties = "spring.datasource.url=jdbc:postgresql://localhost:5432/tinder")
@Import(value = SpotifyService.class)
class DbApplicationTests {

    @Autowired
    private SpotifyService service;

    @Test
    void save() {
        service.save(new Spotify("a", "b", "c"));
    }

    @SpringBootApplication
    static class Boot {
    }

}