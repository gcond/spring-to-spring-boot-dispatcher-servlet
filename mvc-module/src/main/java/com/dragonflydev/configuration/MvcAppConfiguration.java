package com.dragonflydev.configuration;

import com.dragonflydev.dispatcherservletutil.CustomFilter;
import com.dragonflydev.dispatcherservletutil.CustomListener;
import com.dragonflydev.dispatcherservletutil.CustomServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContextListener;
import java.util.Collections;

/**
 * Created by dragonfly on 2023-09-03
 */
@Configuration
public class MvcAppConfiguration {

    @Bean
    public ServletRegistrationBean customServletBean() {

        return new ServletRegistrationBean(new CustomServlet(), "/barca");
    }

    @Bean
    public ServletListenerRegistrationBean<ServletContextListener> customListenerBean() {
        ServletListenerRegistrationBean<ServletContextListener> listenerRegistrationBean =
                new ServletListenerRegistrationBean<>();
        listenerRegistrationBean.setListener(new CustomListener());

        return listenerRegistrationBean;
    }

//    @Bean
//    public FilterRegistrationBean customFilterBean() {
//        FilterRegistrationBean filterRegistrationBean =
//                new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new CustomFilter());
//        filterRegistrationBean.setServletNames(Collections.singletonList("CustomServlet"));
//        filterRegistrationBean.addUrlPatterns("/barca");
//
//        return filterRegistrationBean;
//    }
}
