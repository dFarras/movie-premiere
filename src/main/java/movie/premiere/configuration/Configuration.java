package movie.premiere.configuration;

import lombok.Data;

import javax.inject.Singleton;
import java.util.Map;

@Data
@Singleton
public class Configuration {

    private String dbConn;

    private String botUsername;
    private String botToken;
    private String botPath;

    private String tmdbApiKey;

    public static final String DB_CONNECTION_KEY = "db_connection";
    public static final String BOT_USERNAME_KEY = "bot_username";
    public static final String BOT_TOKEN_KEY = "bot_token";
    public static final String BOT_PATH_KEY = "bot_path";
    public static final String OMDB_API_KEY = "omdb_api_key";

    {
        Map<String, String> env = System.getenv();
        this.dbConn = env.get(DB_CONNECTION_KEY);
        this.botUsername = env.get(BOT_USERNAME_KEY);
        this.botToken = env.get(BOT_TOKEN_KEY);
        this.botPath = env.get(BOT_PATH_KEY);
        this.tmdbApiKey = env.get(OMDB_API_KEY);
    }

    public String getTmdbApiKey() {
        return this.tmdbApiKey;
    }
}
