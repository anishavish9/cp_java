package com.example.controller;
import com.example.domain.Track;
import com.example.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class TrackController {
    private TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("/track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) {
        return new ResponseEntity<>(trackService.saveTrack(track), HttpStatus.CREATED);
    }

    @GetMapping("/tracks")
    public ResponseEntity<?> getAllTracks() {
        return new ResponseEntity<>(trackService.getAllTracks(), HttpStatus.FOUND);
    }

    @GetMapping("/tracks/{trackId}")
    public ResponseEntity<?> getTrackById(@PathVariable String trackId) {
        return new ResponseEntity<>(trackService.getTrackById(trackId), HttpStatus.OK);
    }

}
