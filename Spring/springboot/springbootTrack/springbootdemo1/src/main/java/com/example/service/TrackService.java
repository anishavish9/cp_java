package com.example.service;

import com.example.domain.Track;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);
    List<Track> getAllTracks();
    List<Track> getTrackById(String trackId);

}
