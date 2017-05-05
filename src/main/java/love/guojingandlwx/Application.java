package love.guojingandlwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * The type Application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * Configure spring application builder.
	 *
	 * @param application the application
	 * @return the spring application builder
	 */
	@Override
	protected SpringApplicationBuilder configure(
		final SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
