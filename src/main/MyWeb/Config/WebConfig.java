package main.MyWeb.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("main.MyWeb")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".html");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/Login/CSS/**").addResourceLocations("/resources/Login/");
        registry.addResourceHandler("/Login/IMG/**").addResourceLocations("resources/Login/");

        registry.addResourceHandler("/CSS/**").addResourceLocations("/resources/main/CSS/");
        registry.addResourceHandler("/IMG/**").addResourceLocations("resources/main/IMG/");
        registry.addResourceHandler("/JS/**").addResourceLocations("resources/main/JS/");
    }
}
