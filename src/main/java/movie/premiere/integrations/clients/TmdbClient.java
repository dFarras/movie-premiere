package movie.premiere.integrations.clients;

import feign.Param;
import feign.RequestLine;
import movie.premiere.models.Movie;

import java.time.LocalDate;
import java.util.List;

public interface TmdbClient {
    @RequestLine("GET /discover/movie?api_key={apiKey}&primary_release_date.gte={startDate}&primary_release_date.lte={endDate}")
    List<Movie> findByYear(@Param("apiKey") String apiKey, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
