package movie.premiere.integrations;

import io.micronaut.context.annotation.Property;
import movie.premiere.configuration.Configuration;
import movie.premiere.integrations.clients.TmdbClient;
import movie.premiere.models.Movie;

import javax.inject.Singleton;
import java.time.LocalDate;
import java.util.List;

@Singleton
public class Tmdb {

    @Property(name = "tmdb.url")
    private String url;
    private TmdbClient tmdbClient;
    private Configuration configuration;

    public Tmdb(Configuration configuration, TmdbClient tmdbClient) {
        this.tmdbClient = tmdbClient;
        this.configuration = configuration;
    }

    public List<Movie> getPresentMovies() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = LocalDate.of(now.getYear(), now.getMonthValue(), 1);
        LocalDate endDate = startDate.plusMonths(1);
        return tmdbClient.findByYear(configuration.getTmdbApiKey(), startDate, endDate);
    }
}
