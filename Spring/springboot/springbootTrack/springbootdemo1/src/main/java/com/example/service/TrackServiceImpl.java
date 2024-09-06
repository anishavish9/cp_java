package com.example.service;
import com.example.domain.Track;
import com.example.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks() {
        List<Track> tracks = trackRepository.findAll();
        System.out.println("Database about the track "+tracks);
        return tracks;
    }

    @Override
    public List<Track> getTrackById(String trackId) {
        List<Track> tracks = trackRepository.findByTrackId(trackId);
        System.out.println("Database about track id"+tracks);
        return tracks;
    }
}
