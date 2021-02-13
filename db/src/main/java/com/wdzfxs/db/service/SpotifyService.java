package com.wdzfxs.db.service;

import com.wdzfxs.db.entity.Spotify;
import com.wdzfxs.db.repository.SpotifyRepository;
import org.springframework.stereotype.Service;

@Service
public class SpotifyService {

    private final SpotifyRepository repository;

    public SpotifyService(SpotifyRepository repository) {
        this.repository = repository;
    }

    public void save(Spotify spotify) {
        repository.save(spotify);
    }
}