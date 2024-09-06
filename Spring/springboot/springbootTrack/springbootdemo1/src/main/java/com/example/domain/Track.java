package com.example.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Track {

    @Id
    private String trackId;
    private String trackName;
    private String trackComments;
    private String trackRating;
    private String trackArtist;

    public Track() {
    }

    public Track(String trackId, String trackName, String trackComments, String trackRating, String trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public String getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(String trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId='" + trackId + '\'' +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                ", trackRating='" + trackRating + '\'' +
                ", trackArtist='" + trackArtist + '\'' +
                '}';
    }
}
