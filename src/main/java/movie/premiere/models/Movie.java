package movie.premiere.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String title;
    private Integer year;
    private String rated; //TODO -> Model into enum
    private String release; //TODO -> Custom adapter for Jackson
    private Integer runtime;
    private String genre; //TODO -> Model into enum
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String posterUrl;
    private List<Rating> ratings;
    private Integer metaScore;
    private Double imdbRating;
    private Integer imdbVotes;
    private String imdbId;
    private String type; //TODO -> Model into enum¿?
    private String dvdRelease; //TODO -> Custom adapter for Jackson
    private String boxOffice;
    private String production;
    private String officialWebsite;
}
