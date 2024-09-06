package com.example.repository;

import com.example.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, String> {
    List<Track> findByTrackId(String trackId);
    List<Track> findByTrackArtist(String trackName);

}
