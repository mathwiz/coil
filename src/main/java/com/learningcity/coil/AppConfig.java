package com.learningcity.coil;

import com.learningcity.coil.service.SimpleWidgetService;
import com.learningcity.coil.service.WidgetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Yohan on 2/21/14.
 */
@Configuration
public class AppConfig {
    @Bean
    public WidgetService widgetService() {
        return new SimpleWidgetService();
    }
}
