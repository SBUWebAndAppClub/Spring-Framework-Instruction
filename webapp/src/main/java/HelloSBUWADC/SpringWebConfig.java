package HelloSBUWADC;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Armando on 10/5/2016.
 */
public class SpringWebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        super.addResourceHandlers(registry);

        registry.addResourceHandler("/css/**")
                .addResourceLocations("/css/");
    }
}
