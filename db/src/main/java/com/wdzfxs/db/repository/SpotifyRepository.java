package com.wdzfxs.db.repository;

import com.wdzfxs.db.entity.Spotify;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpotifyRepository extends JpaRepository<Spotify, String> {
}