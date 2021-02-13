package com.wdzfxs.db.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Spotify {

    @Id
    @Column(name = "user_id")
    private String userId;
    private String artist;
    private String album;

    public Spotify() {
    }

    public Spotify(String userId, String artist, String album) {
        this.userId = userId;
        this.artist = artist;
        this.album = album;
    }
}