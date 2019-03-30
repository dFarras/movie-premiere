package movie.premiere.configuration;

import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

import movie.premiere.configuration.model.Credentials;

public class Configuration {

    private String path = this.getClass().getClassLoader().get
    private static Credentials credentialConfiguration;

    static {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass().
    }
}
