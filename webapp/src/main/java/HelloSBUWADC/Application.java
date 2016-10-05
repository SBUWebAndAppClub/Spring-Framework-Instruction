package HelloSBUWADC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.devtools.*;
/**
 * Created by Armando on 10/5/2016.
 */
@SpringBootApplication
public class Application {

    public static void main (String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Application.class, args);
    }
}
