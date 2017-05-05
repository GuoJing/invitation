package love.guojingandlwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * main entry.
     * @param args args
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * application builder.
     * @param application application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(
        final SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
