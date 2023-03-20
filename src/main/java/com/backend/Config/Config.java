package com.backend.Config;

import com.backend.model.Category;
import com.backend.model.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class Config implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] preventMethods = {HttpMethod.GET, HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
        DisableHttpMethod(Category.class,config,preventMethods);
        DisableHttpMethod(Order.class,config,preventMethods);


    }

    private void DisableHttpMethod(Class theclass, RepositoryRestConfiguration config, HttpMethod[] UnSuportedMethod) {
        config
                .getExposureConfiguration()
                .forDomainType(theclass)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(UnSuportedMethod))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(UnSuportedMethod));
    }
}