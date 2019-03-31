package movie.premiere.scheduled;

import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Singleton;

@Singleton
public class ReleaseCron {

    private ReleasePublisher releasePublisher;

    public ReleaseCron(ReleasePublisher releasePublisher) {
        this.releasePublisher = releasePublisher;
    }

    @Scheduled(cron = "00 00 12 1 * ? ?")
    public void monthlyMovieNotification() {
        releasePublisher.publishMovies();
    }

}
