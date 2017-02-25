package hei.urlProject.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"hei.urlProject.web.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
        registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
        registry.addResourceHandler("/vendor/**").addResourceLocations("/resources/vendor/");
        registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
        registry.addResourceHandler("/less/**").addResourceLocations("/resources/less/");
        registry.addResourceHandler("/other/**").addResourceLocations("/resources/other/");
    }

    @Bean
    public VelocityConfigurer velocityConfigurer(){
        VelocityConfigurer configurer = new VelocityConfigurer();
        configurer.setResourceLoaderPath("/WEB-INF/velocity");
        return configurer;
    }

    @Bean
    public VelocityViewResolver viewResolver(){
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setSuffix(".vm");
        return resolver;

    }
}

